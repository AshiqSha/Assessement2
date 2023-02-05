package com.springbootbatchexamplewithmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootbatchexamplewithmysql.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
