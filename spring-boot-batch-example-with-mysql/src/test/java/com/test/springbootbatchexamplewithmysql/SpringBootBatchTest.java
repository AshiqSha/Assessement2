package com.test.springbootbatchexamplewithmysql;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;


import org.mockito.InjectMocks;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootbatchexamplewithmysql.service.StudentResultBatchService;

@RunWith(SpringRunner.class)
public class SpringBootBatchTest {
	@Mock
    private JobLauncher jobLauncher;

    @Mock
    private Job job;

    @InjectMocks
    private StudentResultBatchService studentResultBatchService;

    @Test
    public void testLaunchBatchSuccess() throws Exception {
        Map<String, JobParameter> maps = new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        maps.put("filename", new JobParameter("test.csv"));
        JobExecution jobExecution = new JobExecution(1L);
        jobExecution.setStatus(BatchStatus.COMPLETED);
        when(jobLauncher.run(any(), any())).thenReturn(jobExecution);

        String result = studentResultBatchService.lauchBatch("test.csv");
        assertEquals("test.csv has been successfully processed and saved into database!", result);
    }

    @Test
    public void testLaunchBatchFailure() throws Exception {
        Map<String, JobParameter> maps = new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        maps.put("filename", new JobParameter("test.csv"));
        JobExecution jobExecution = new JobExecution(1L);
        jobExecution.setStatus(BatchStatus.FAILED);
        when(jobLauncher.run(any(), any())).thenReturn(jobExecution);

        String result = studentResultBatchService.lauchBatch("test.csv");
        assertEquals("Oops!..Something went wrong while processing test.csv", result);
    }

}



