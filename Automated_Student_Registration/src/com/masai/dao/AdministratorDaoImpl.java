package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.exception.AdminException;
import com.masai.model.Batch;
import com.masai.model.Course;
import com.masai.utility.utility;

public class AdministratorDaoImpl implements AdministratorDao {

	@Override
	public String addCourse(Course c) throws AdminException  {
		
		String msz="Course not Added";
		
		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement("insert into courses(c_name,fee,seats) values(?,?,?)");
			
		ps.setString(1, c.getC_name());
		ps.setInt(2,c.getFee());
		ps.setInt(3,c.getSeats());
		
       int	x=	ps.executeUpdate();
			
       if(x>0) {
    	   msz="Course added Succesfully";
       }
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		
		
		
		return msz;
	}

	@Override
	public String updateFee(int c_id,int fee) throws AdminException {

		
	
	String msz="fee not updated";
		
		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement(" update  courses set fee=? where c_id=?");
			
	
		ps.setInt(1,fee);
		ps.setInt(2,c_id);
		
		
       int	x=	ps.executeUpdate();
			
       if(x>0) {
    	   msz="fee updated Succesfully";
       }else {
    	   msz="No course found with yhis id to be updated";
       }
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		
		
		
		return msz;
	}


	
	@Override
	public String deleteCourse(int c_id) throws AdminException {
	
       String msz="Course not Deleted";
		
		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement(" delete from courses where c_id=?");
			
	
	
		ps.setInt(1,c_id);
		
		
       int	x=	ps.executeUpdate();
			
       if(x>0) {
    	   msz="Course Deleted Succesfully";
       }else {
    	   msz="No course found with this id to delete";
       }
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		return msz;
	}

	
	@Override
	public Course searchInformation_Course(int c_id) throws AdminException {
		
		Course c= null;
		
		try (Connection conn=utility.provideconnetion()){
			
			PreparedStatement ps=	conn.prepareStatement("select * from courses where c_id=?");
				
		
		
			ps.setInt(1,c_id);
			
			
	       ResultSet rs=	ps.executeQuery();
				
	      if(rs.next()) {
	    	  
	    	  c= new Course();
	    	  
	    	
	    	  
	    	  c.setCid(rs.getInt("c_id") );
	    	  c.setC_name(  rs.getString("c_name") );
	    	  c.setFee(  rs.getInt("fee"));
	    	  c.setSeats(	  rs.getInt("seats"));
	    	  
	    	  
	      }if(c==null) {
	    	  
	    	  throw new AdminException("No course found with this id");
	      }
				
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				
				throw new AdminException(e.getMessage());
				
			}
		
		
		return c;
	}

	
	@Override
	public String createBatch(Batch c,int c_id) throws AdminException {
		
       String msz="Batch not added for this course";
		
		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement("insert into batch(bname,duration,cId,seats) values(?,?,?,?)");
			
		ps.setString(1, c.getBname());
		ps.setInt(2,c.getDuration());
		ps.setInt(3,c_id);
		ps.setInt(4,c.getSeats());
		
       int	x=	ps.executeUpdate();
			
       if(x>0) {
    	   msz="Batch created Succesfully for  course_id :"+c_id;
       }else {
    	   
    	   msz="Course not  found with this id for Creation of batch";
       }
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		
		
		
		return msz;
		
	}
		
		

	

}
