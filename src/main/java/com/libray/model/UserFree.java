package com.libray.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.libray.dao.ConnectionUtil;
import com.libray.dao.UserUpate;
import com.libray.logic.UserCheck;

public class UserFree {
	private static Logger log= LogManager.getLogger(UserFree.class);
	
	public static void UserFreeRegister() throws Exception
	{
	
	Scanner sc = new Scanner(System.in);
	log.info("1. User_free");
	log.info("2. Membership");
	int number = sc.nextInt();
	if(number == 1)
	{
		RegisterUser();
	}
	else if(number ==2)
	{
		MemberShip.membershipregister();
	}
	else 
	{
		log.warn("Enter valid Option");
		UserFreeRegister();
	}
	
	}
	public static void RegisterUser() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		log.info("Enter Your Name : ");
		String userName=sc.nextLine();
		log.info("Enter Your Email ");
		String userEmail=sc.next();
		log.info("Enter Your Password  ");
		String userPassword=sc.next();
		log.info("Enter Your Mobile Number  ");
		String userMobile=sc.next();
		int num= (int)(Math.random()*(5000-8000+1)+5000);
		log.info("Enter Your UserId here it is  "+num);
		int userId=sc.nextInt();
		Registration user = new Registration();
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);
		user.setUserMobile(userMobile);
		user.setUserId(userId);
		int count=0;
		try
		{
			UserCheck.UserValidation(user);
		}
		catch(Exception e)
		{
			log.info("Once again registered");
			count++;
			log.error("ERROR : " +e.getMessage());
			RegisterUser();
		}
		if(count==0)
		{
			UserUpate.InsertUser(user);
			UserProcess.userbook(num);
			
		}
		
		
	}
	public static void userlogin() {
		Scanner sc = new Scanner(System.in);
		log.info("Enter your Gmail ");
		String UserGmail = sc.next();
		log.info("Enter your Password ");
		String UserPassword = sc.next();
		try {
			loginValidator(UserGmail, UserPassword);
		}
		catch(Exception e)
		{
			log.info("Enter correctly");
			log.info( e.getMessage());
			userlogin();
			
		}
	}
	public static  void loginValidator(String email,String password) throws Exception
	{
	Connection connection;
	PreparedStatement statement;
	connection=ConnectionUtil.sqlConnection();
	ResultSet rs = null;
	String query = "SELECT email,Password,user_Id FROM library_User_Details WHERE email= ? or  user_Id= ? ";
	statement = connection.prepareStatement(query);
	statement.setString(1,email);
	statement.setString(2,password);
	rs = statement.executeQuery();
	String mail = null;
	String Password=null;
	int user_Id= 0;
	String number=null;
	while(rs.next())
	{
	mail=rs.getString("email");
	Password=rs.getString("Password");
	user_Id=rs.getInt("user_Id");
	number=rs.getString("user_Id");
	
	}
	if(mail==null)
	{
	throw new Exception("No Records Found");
	}
	
	else if(Password.equals(password))
	{
		log.info("Successfully login");
		UserProcess.userbook(user_Id);
		
		
		
	}
	else
	{
	throw new Exception("Invalid Credentials");
	}
	}
	
}
