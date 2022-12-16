package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception.AdminException;
import com.masai.model.Admin;
import com.masai.model.Batch;
import com.masai.model.Course;
import com.masai.model.InformationCourseDTO;
import com.masai.model.StudentDTO;
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

	@Override
	public List<InformationCourseDTO> searchInformationOfCourse(int c_id) throws AdminException {
		
		List<InformationCourseDTO> list = new ArrayList<>();
		  	
			try (Connection conn=utility.provideconnetion()){
				
			PreparedStatement ps=	conn.prepareStatement("select * from courses where c_id=?");
				
			
			
			
			ps.setInt(1,c_id);
			
			ResultSet rs= ps.executeQuery();
	      
			if(rs.next()) {
			

				
				PreparedStatement ps1=	conn.prepareStatement("select c.c_name,c.fee,b.bname,b.seats from batch b INNER JOIN courses c "
						+ "ON b.cId = c.c_id  And c.c_id= ?");
				
			ps1.setInt(1,c_id);
				
			ResultSet rs1= ps1.executeQuery();
			
			
			while(rs1.next()) {
				
				
				int seats = rs1.getInt("b.seats");
				String bname = rs1.getString("b.bname");
				String cname = rs1.getString("c.c_name");
				int fee = rs1.getInt("c.fee");
			
				InformationCourseDTO co= new InformationCourseDTO(cname, fee, bname, seats);
				
				
				list.add(co);
				
				
				
				
			}if(list.size()==0) {
				throw new AdminException("No data found with this course id");
			}
			
			
			}else {
				throw new AdminException("No data Available with this id");
			}
				
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				
				throw new AdminException(e.getMessage());
				
			}
			
			
			
			
			
			return list;
		
		
	}

	@Override
	public String allocateStudent(int roll, int bid, int c_id) throws AdminException {
		
String msz="";
		
		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement("select * from students where sroll=?");
			
		
		ps.setInt(1,roll);
		
        ResultSet rs=	ps.executeQuery();
			
        if(rs.next()) {
        	
        	PreparedStatement ps1=	conn.prepareStatement("select * from courses where c_id=?");
			
    		
    		ps1.setInt(1,c_id);
    		
            ResultSet rs1=	ps1.executeQuery();
        	
        	if(rs1.next()) {
        		
        		PreparedStatement ps2=	conn.prepareStatement(" insert into student_batch values(?,?,?);");
    			
        		ps2.setInt(1,roll);
        		ps2.setInt(2,c_id);
        		ps2.setInt(3,bid);
        		
                int rs2=	ps2.executeUpdate();
        		
                if( rs2>0) {
                	msz="Inserted succesfully";
                	
                	
                	PreparedStatement ps3=	conn.prepareStatement(" select seats from  batch where bid=?");
                	ps3.setInt(1, bid);
                	
                 ResultSet done=	ps3.executeQuery();
                	
                	if(done.next()) {
                		PreparedStatement ps4=	conn.prepareStatement(" update batch set seats=? where bid=?");
                		
                		int num=done.getInt("seats")-1;
                		ps4.setInt(1, num);
                		ps4.setInt(2, bid);
                		ps4.executeUpdate();
                		
                	}else {
                		msz="Seat not available";
                	}
                	
                	
                	
                	
                	
                }else {
                	throw new AdminException("No Batch found with this id");
                }
        		
        			
        			
        			
        		
                
        		
        		
        	}else {
        		throw new AdminException("No Course found with this id");
        	}
        	
        	
        	
        	
        	
        	
        }else {
        	throw new AdminException("No student found with this roll");
        }
     
       
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		
		
		
		return msz;
		
		
		
	}

	@Override
	public String updateSeatsOfBatch(int bid, int newSeats) throws AdminException {
		
		String msz= "Not Updated";
		

		
		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement(" update batch set seats=? where bid=?");
			
	
		ps.setInt(2,bid);
		ps.setInt(1,newSeats);
		
		
       int	x=	ps.executeUpdate();
			
       if(x>0) {
    	   msz="Seats updated Succesfully";
       }else {
    	   msz="No batch found with this id to be updated";
       }
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		
		return msz;
	}

	@Override
	public List<StudentDTO> viewAllStudent_Batch() throws AdminException {


		List<StudentDTO> st= new  ArrayList<>();
		

		
		try (Connection conn=utility.provideconnetion()){
			
			PreparedStatement ps = conn.prepareStatement("SELECT s.sroll,s.sname,c.c_name,b.bname "
					+ "FROM students s INNER JOIN batch b INNER JOIN courses c INNER JOIN "
					+ "student_batch sb ON c.c_id = sb.course AND b.bid = sb.bid And s.sroll=sb.roll");
			ResultSet rs = ps.executeQuery();
		
		
	while(rs.next()) {
		
		int roll = rs.getInt("sroll");
		
		String sName = rs.getString("sname");
	
		String cName = rs.getString("c_name");
		
		String bName = rs.getString("bname");
		
		
		
		
		StudentDTO student = new StudentDTO(roll, sName, cName,  bName);
		st.add(student);
		
		
		
		
		
	}if(st.size()==0) {
		throw new AdminException("No data found");
	}
			
    
    	
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		
		return st;
		
		
	}

	@Override
	public String adminRegistration(Admin a) throws AdminException {
		
String msz="Admin not registered";
		
		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement("insert into admin values(?,?,?)");
		ps.setInt(1,a.getId());
		ps.setString(2, a.getName());
	
		ps.setString(3,a.getPass());
		
       int	x=	ps.executeUpdate();
			
       if(x>0) {
    	   msz="Admin Registered Succesfully";
       }
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			
			throw new AdminException(e.getMessage());
			
		}
		
		
		
		
		
		return msz;
		
		
		
	}

	@Override
	public Admin adminLogin(String name, String pass) throws AdminException {

		Admin adm= null;
				
				try (Connection conn=utility.provideconnetion()){
					
				PreparedStatement ps=	conn.prepareStatement("select * from Admin where a_name=? and a_pass=?");
				
				
				
				ps.setString(1,name);
				ps.setString(2,pass);
			
				
		 ResultSet rs=   ps.executeQuery();
					
		       if(rs.next()) {
		    	  
		    	  
		    	
		    	   
		    	  
		    	  adm= new Admin(rs.getInt("adminId"),rs.getString("a_name"),  rs.getString("a_pass"));
		    	   
		       }else {
		    		throw new AdminException("Invalid login!");
		       }
					
					
					
				} catch (SQLException e) {
					// TODO: handle exception
					
					throw new AdminException(e.getMessage());
					
				}
				
				
				
				
				
				return adm;
		
		
	}

		
	
		
		
		
	
	
	
	

	

}
