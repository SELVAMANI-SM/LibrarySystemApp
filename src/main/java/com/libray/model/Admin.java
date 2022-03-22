package com.libray.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.libray.dao.ConnectionUtil;

public class Admin {
	public static void adminlogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gmail / Admin_id");
		String UserGmail = sc.next();
		System.out.println("Enter your Password ");
		String UserPassword = sc.next();
		try {
			MemberValidator(UserGmail, UserPassword);
		}
		catch(Exception e)
		{
			System.out.println("Enter correctly");
			System.out.println( e.getMessage());
			adminlogin();
			
		}
	}
	public static  void MemberValidator(String email,String password) throws Exception
	{
	Connection connection;
	PreparedStatement statement;
	connection=ConnectionUtil.sqlConnection();
	ResultSet rs = null;
	String query = "SELECT email,password,admin_id FROM Admin_Login WHERE email= ? or  admin_id= ? ";
	statement = connection.prepareStatement(query);
	statement.setString(1,email);
	statement.setString(2,email);
	rs = statement.executeQuery();
	String mail = null;
	String Password=null;
	//int user_Id= 0;
	String number=null;
	if(rs.next())
	{
	mail=rs.getString("email");
	Password=rs.getString("password");
	//user_Id=rs.getInt("user_Id");
	number=rs.getString("admin_id");
	
	}
	if(mail==null||number==null)
	{
	throw new Exception("No Records Found");
	}
	
	else if(Password.equals(password))
	{
		System.out.println("Successfully login");
		 AdminProcess.AdminProcessBook();
		
	}
	else
	{
	throw new Exception("Invalid Credentials");
	}
	}
	
}
