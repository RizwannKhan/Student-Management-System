package com.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return this.studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return this.studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return this.studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		this.studentRepository.deleteById(id);		
	}
	
	
}
