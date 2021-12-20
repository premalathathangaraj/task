package com.projectflowershop.main;

import java.util.Scanner;
import java.util.List;
import com.projectflowershop.dao.productDao;
import com.projectflowershop.dao.orderDao;
import com.projectflowershop.dao.UserDao;
import com.projectflowershpo.model.Product;
import com.projectflowershpo.model.User;

public class TestMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("\tWelcome to Online Flower Shop");
		System.out.println("\n1.Register\n2.Login\nEnter your Choice :");
		int choice = Integer.parseInt(scan.nextLine());

		switch (choice) {
		case 1:
			UserDao userDao = new UserDao();
			System.out.println("Enter User Name:");
			String name = scan.nextLine();
			int flag = 0;
			do {
				if (name.matches("[A-Za-z]+")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter valid name");
				name = scan.nextLine();
				flag = 1;
			} while (flag == 1);

			System.out.println("Enter Email_Id :");
			String emailId = scan.nextLine();

			do {

				if (emailId.matches("[A-Za-z0-9]+[@][a-zA-Z]+[.][a-z]+")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter Valid Email");
				emailId = scan.nextLine();
				flag = 1;

			} while (flag == 1);
			System.out.println("Enter Password:");
			String password = scan.nextLine();
			do {

				if (password.matches("[a-z0-9]+{8}+")) {
					flag = 0;
					break;

				} else
					System.out.println("Password is not Match");
				System.out.println("Enter valid password");
				password = scan.nextLine();
				flag = 1;

			} while (flag == 1);

			System.out.println("Enter Your Address");
			String address = scan.nextLine();
			do {
				if (address.matches("[A-za-z0-9]")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter valid address");
				address = scan.nextLine();
			} while (flag == 1);

			System.out.println("Enter Your Mobile Number");
			String mobileNumber = scan.nextLine();
			do {
				if (mobileNumber.matches("[0-9]+{10}")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter valid mobileNumber");
				mobileNumber = scan.nextLine();
			} while (flag == 1);
			Long mobilenumber = Long.parseLong(mobileNumber);

			User user = new User(name, emailId, password, address, mobilenumber);
			userDao.insertUser(user);

		case 2:
			userDao = new UserDao();
			System.out.println("User Login");
			System.out.println("Enter Email_Id :");
			emailId = scan.nextLine();

			do {

				if (emailId.matches("[A-Za-z0-9]+[@][a-zA-Z]+[.][a-z]+")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter Valid Email");
				emailId = scan.nextLine();
				flag = 1;

			} while (flag == 1);
			System.out.println("Enter Password:");
			password = scan.nextLine();

			do {
				if (password.matches("[a-z0-9]{8}+")) {
					flag = 0;
					break;
				} else
					System.out.println("Password is not Match");
				System.out.println("Enter valid password");
				password = scan.nextLine();
				flag = 1;

			} while (flag == 1);

			User user1 = UserDao.validateUser(emailId, password);

			if (user1 != null) {
				System.out.println("Login Successfully");

				System.out.println("Welcome\t" + user1.getName());
			}

//			// show product
//
//			switch (choice) {
//			case 1:
//				productDao proDao = new productDao();
//				orderDao order = new orderDao();
//
//				List<Product> productList = (List<Product>) proDao.showProduct();
//
//				for (int i = 0; i < productList.size(); i++) {
//					System.out.println(productList.get(i));
//
//				}
//
//				System.out.println("\n1.Order Product\n2.View Orders");
//
//				int orderChoice = Integer.parseInt(scan.nextLine());
//
//				Product product = null;
//				String check = null;
//				String checkChoice = null;
//
//				switch (orderChoice) {
//
//				case 1:
//
//					do {
//						for (int i = 0; i < productList.size(); i++) {
//							System.out.println(productList.get(i));
//
//						}
//						System.out.println("Enter the Product Name:");
//						String productName = scan.nextLine();
//						
//
//						for (int i = 0; i < productList.size(); i++) {
//
//							if ((((com.projectflowershpo.model.Product) productList.get(i)).getFlowerName()
//									.equals(productName))) {
//								product = productList.get(i);
//							}
//						}
//
//						System.out.println("enter no of  products needed ");
//						int noOf = Integer.parseInt(scan.nextLine());
//
//						float amount = (float) (noOf * product.getRetailPrice());
//
//						System.out.println("Your total amount is:" + amount);
//                            
//						System.out.println("Do you want to buy more products(y/n)");
//						check = scan.nextLine();
//
//					} while(check.charAt(0) == 'y');
//					System.out.println("Thank You !!!");
//					break;
//
//				}
//			}
	}

	}
}
