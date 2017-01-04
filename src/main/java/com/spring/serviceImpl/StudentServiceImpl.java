package com.spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Student;
import com.spring.mapper.StudentMapper;
import com.spring.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper mapper;
	
	@Override
	public List<Student> FindStudentAll() {
		return mapper.FindStudentAll();
	}
	@Override
	public List<Student> getFindStudentAll() {
		return mapper.getFindStudentAll();
	}
}
