package com.bloom.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	
	public void insertUser(User user) {
		String insertQuery ="insert into User_Details(name,Email_Id,Password) values(?,?,?)";

		Connectionutil conUtil = new Connectionutil();
		Connection con = conUtil.getDbConnection();
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement(insertQuery);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail_id());
			pst.setString(3, user.getPassword());
			pst.executeUpdate();
			System.err.println("Value inserted Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Value not inserted in the table");
		}

	}

	public static User validateUser(String Email_Id,String password)
	{
		String validateQuery="select * from User_Details where email_id="+Email_Id;
		Connection con=Connectionutil.getDbConnection();
		User user=null;
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(validateQuery);
			if(rs.next())
			{
				user=new User(rs.getString(1),Email_Id,password);
			}
			else {
				System.out.println("Not a valid user");
				
			}
		} catch (SQLException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
			System.out.println("Statement error");
		} 
		return user;
	}



}
