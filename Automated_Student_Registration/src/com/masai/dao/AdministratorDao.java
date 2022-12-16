package com.masai.dao;



import java.util.List;

import com.masai.exception.AdminException;
import com.masai.model.Admin;
import com.masai.model.Batch;
import com.masai.model.Course;
import com.masai.model.InformationCourseDTO;
import com.masai.model.StudentDTO;


public interface AdministratorDao {
	
	public String	adminRegistration(Admin a) throws AdminException;
	
	public Admin	adminLogin(String name, String pass) throws AdminException;
	
  public String	addCourse(Course c) throws AdminException;
	
  public String	updateFee(int c_id,int fee) throws AdminException;
  
  public String	deleteCourse(int c_id) throws AdminException;


  
  public String	createBatch(Batch b,int c_id) throws AdminException;
  
  public List<InformationCourseDTO>	searchInformationOfCourse(int c_id) throws AdminException;
  


  
  public String	allocateStudent(int roll,int bid,int c_id) throws AdminException;
  
  public String updateSeatsOfBatch(int bid, int newSeats) throws AdminException ;
  
  


  
  public List<StudentDTO> viewAllStudent_Batch() throws AdminException;
  
}
