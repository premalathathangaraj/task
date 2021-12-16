package com.bloom.model;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("\tWelcome to Online Flower Shop");
			System.out.println("\n1.Register\n2.Login\nEnter your Choice :");
			int choice=Integer.parseInt(scan.nextLine());

			
			switch(choice)
			{
			case 1:
				UserDao userDao =new UserDao();
				System.out.println("Enter User Name:");
				String name=scan.nextLine();
				int flag=0;
				do {
					if(name.matches("[A-Za-z]+")) 
					{
						flag=0;
						break;
					}
					else
						System.out.println("Enter valid name");
					    name=scan.nextLine();
					    flag=1;
					
				}while(flag==1);
				System.out.println("Enter Email_Id :");
				String Email_Id=scan.nextLine();
				
				do {
					
					if(Email_Id.matches("[A-Za-z0-9]+[@][a-zA-Z]+[.][a-z]+")) 
					{
						flag=0;
						break;
					}
					else
					    System.out.println("Enter Valid Email");
					    Email_Id=scan.nextLine();
					    flag=1;
					
				}while(flag==1);
				System.out.println("Enter Password:");
				String password=scan.nextLine();
				
				 
			        if(!(password.matches("[a-z0-9]+[@][0-9]+"))) 
			        {
				    	System.out.println("Password is not Match");
				    	System.exit(0);
				    	
			        }
				 
				User user=new User(name,Email_Id,password);
				userDao.insertUser(user);
				break;
				
				

			case 2:
			userDao=new UserDao();
			System.out.println("User Login");
			System.out.println("Enter the registered mail ID");
			Email_Id=scan.nextLine();
			System.out.println("Enter Email_Id :");
		    
			do {
				
				if(Email_Id.matches("[A-Za-z0-9]+[@][a-zA-Z]+[.][a-z]+")) 
				{
					flag=0;
					break;
				}
				else
				    System.out.println("Enter Valid Email");
				    Email_Id=scan.nextLine();
				    flag=1;
				
			}while(flag==1);
			System.out.println("Enter Password:");
		    password=scan.nextLine();
			
			do { 
		        if(!(password.matches("[a-z0-9]+[@][0-9]+"))) 
		        {
		        	flag=0;
		        	break;
		        }
		        else
			    	System.out.println("Password is not Match");
			    	System.out.println("Enter valid password");
			    	password=scan.nextLine();
			    	flag=1;
			    	
			}while(flag==1);
			
			User user1= UserDao.validateUser(Email_Id,password);
			if(user1!=null) {
				System.out.println("Welcome\t"+user1.getName());
			}
				
			}
			}}
			
			
			
			    	
		        
			
			
			
			
			
			
			
			
		

	


