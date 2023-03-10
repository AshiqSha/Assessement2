package com.springbootbatchexamplewithmysql.util;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootbatchexamplewithmysql.model.Student;
import com.springbootbatchexamplewithmysql.repository.StudentRepository;

@Component
public class ResultWriter implements ItemWriter<Student> {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void write(List<? extends Student> students) throws Exception {
		studentRepository.saveAll(students);
	}
}
