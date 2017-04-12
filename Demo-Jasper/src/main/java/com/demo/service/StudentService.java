package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentdao;

	public List<Student> getAllStudents() {
		return studentdao.findAll();
	}

	public void delete(Long id) {
		studentdao.delete(id);
	}

	public void add(Student student) {
		studentdao.save(student);
	}

	public void update(Long id, Student student) {
		Student std = studentdao.findOne(id);
		std.setName(student.getName());
		std.setSubject(student.getSubject());
		studentdao.save(std);
	}

	public Student getStudentByName(String name) {
		return studentdao.getStudentByName(name);

	}

	public boolean checkLogin(Student studentfuckyou) {
		boolean result = false;
		Student student = studentdao.getStudentByName(studentfuckyou.getName());
		if (student != null) {
			if (student.getSubject().equals(studentfuckyou.getSubject())) {
				result = true;
			}
		}
		return result;
	}
}
