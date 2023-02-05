package com.test.springbootbatchexamplewithmysql;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootbatchexamplewithmysql.service.StudentResultBatchService;




@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBatchExampleWithMysqlApplicationTests {

	@Test
	public void contextLoads() {
		String filename = "testFile";
		StudentResultBatchService student  = mock(StudentResultBatchService.class);
		try {
			when(student.lauchBatch(filename)).thenReturn("aa");
		} catch (JobParametersInvalidException | JobExecutionAlreadyRunningException | JobRestartException
				| JobInstanceAlreadyCompleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

