package com.masai.dao;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.InformationCourseDTO;
import com.masai.model.Student;

public interface StudentDao {


	 public String studentRegistration(Student student, int cid) throws StudentException;
	
	 public String updateDetails(int roll, String field, String newData) throws StudentException;
	
	 public List<InformationCourseDTO>	detailsAllCourse() throws StudentException;
	
	 public Student login(String username, String password) throws StudentException;
}
