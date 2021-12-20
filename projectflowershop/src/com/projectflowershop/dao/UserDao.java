package com.projectflowershop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.projectflowershpo.model.User;

public class UserDao {
	
	public void insertUser(User user) {
		String insertQuery ="insert into User_Details(name,email_id,Password,address,mobile_number) values(?,?,?,?,?)";

		Connectionutil conUtil = new Connectionutil();
		Connection con = conUtil.getDbConnection();
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(insertQuery);
			
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmailId());
			pst.setString(3, user.getPassword());
			pst.setString(4, user.getAddress());
			pst.setLong(5, user.getMobileNumber());
			pst.executeUpdate();
			System.err.println("Value inserted Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Value not inserted in the table");
		}

	}

	public static User validateUser(String emailId,String password)
	{
		String validateQuery="select * from User_Details where email_id='"+ emailId +"' and password='"+password+"'";
		Connection con=Connectionutil.getDbConnection();
		User user=null;
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(validateQuery);
			if(rs.next())
			{
				user=new User(rs.getString(1),emailId,password,rs.getString(4),Long.parseLong(rs.getString(5)));
			}
			else {
				System.out.println("Not a valid user");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Statement error");
		} 
		return user;
	}
    public void update(String update) throws ClassNotFoundException,SQLException{ 
	String updateQuery="update User_Details set password=? where user_id=?";
	
	Connection con=Connectionutil.getDbConnection();
	System.out.println("Connection Successfully");
	
	PreparedStatement pstmt=con.prepareStatement(updateQuery);
	pstmt.setString(1, update.split(",")[0]);
	pstmt.setString(2, update.split(",")[1]);
	int i=pstmt.executeUpdate();
	System.out.println(i+"row updated");
	pstmt.close();
	con.close();
    }
    
    public void delete(String delete) throws ClassNotFoundException,SQLException{
    	String deleteQuery="delete from User_Details where user_id=?";
    	
    	Connection con=Connectionutil.getDbConnection();
    	System.out.println("Connection Successfully");
    	
    	PreparedStatement pstmt=con.prepareStatement(deleteQuery);
    	pstmt.setString(1,(delete));
    	int i=pstmt.executeUpdate();
    	System.out.println(i+"row deleted");
    	pstmt.close();
    	con.close();
    	
    	
    }


}
