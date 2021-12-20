package com.projectflowershop.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.projectflowershpo.model.Product;

public class productDao {
	
	Connectionutil conutil=new Connectionutil();
	Connection con=conutil.getDbConnection();
	
	public List<Product>showProduct(){
		List<Product> productList= new ArrayList<Product>();
		
		
		String showQuery="select * from inventory";
		Connection con=Connectionutil.getDbConnection();
		try {
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery(showQuery);
			while(rs.next())
			{
				Product product=new Product(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),Double.parseDouble(rs.getString(5)),
				rs.getString(6));
				productList.add(product);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productList;
	}
	public static String findProductId(Product product)
	{
		String findUserID="select flower_id from inventory where = '"+product.getFlowerName()+"'";
		Connection con=Connectionutil.getDbConnection();
		Statement stmt;
		String flowerId=null;
		try {
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(findUserID);
			if(rs.next())
			{
			flowerId=rs.getString(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flowerId;
		
	}
    public Object getFlower_Name() {
    	
    	return null;
    }

}
