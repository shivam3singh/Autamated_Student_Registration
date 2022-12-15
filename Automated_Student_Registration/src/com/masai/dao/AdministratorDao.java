package com.masai.dao;

import com.masai.exception.AdminException;
import com.masai.model.Batch;
import com.masai.model.Course;

public interface AdministratorDao {

  public String	addCourse(Course c) throws AdminException;
	
  public String	updateFee(int c_id,int fee) throws AdminException;
  
  public String	deleteCourse(int c_id) throws AdminException;

//wrong  public Course searchInformation_Course(int c_id) throws AdminException;
  
  public String	createBatch(Batch b,int c_id) throws AdminException;
  
  
}
