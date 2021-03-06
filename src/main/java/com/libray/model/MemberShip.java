package com.libray.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.libray.dao.ConnectionUtil;
import com.libray.dao.MemberUpdate;
import com.libray.logic.MemberCheck;

public class MemberShip {
	private static Logger log= LogManager.getLogger(MemberShip.class);
	public static void membershipregister() throws Exception
{
	Scanner sc = new Scanner(System.in);
	log.info("Enter Your Name : ");
	String memberName=sc.nextLine();
	log.info("Enter Your Email ");
	String memberEmail=sc.next();
	log.info("Enter Your Password  ");
	String memberPassWord=sc.next();
	log.info("Enter Your Mobile Number  ");
	String memberMobile=sc.next();
	int num= (int)(Math.random()*(5000-8000+1)+5000);
	log.info("Enter Your UserId here it is  "+num);
	int  memberId=sc.nextInt();
	Registration member = new Registration();
	member.setMemberName(memberName);
	member.setMemberEmail(memberEmail);
	member.setMemberPassword(memberPassWord);
	member.setMemberMobile(memberMobile);
	member.setMemberId(memberId);
	int count=0;
	try
	{
		MemberCheck.UserValidation(member);
	}
	catch(Exception e)
	{
		log.info("Once again registered");
		
		count++;
		log.error("ERROR : " +e.getMessage());
		membershipregister();
		
	}
	if(count==0)
	{
		MemberUpdate.InsertMember(member);
		MemberProcess.Memberbook(num);
	}
	
}
public static void Memberlogin() {
	Scanner sc = new Scanner(System.in);
	log.info("1. login MemberShip");
	log.info("2. login user");
	int number = sc.nextInt();
	if(number==1)
	{
		memberCheck();
	}
	else if(number==2)
	{
		UserFree.userlogin();
	}
}
public static void memberCheck() {
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
		
		log.error( e.getMessage());
		memberCheck();
		
	}
}

public static  void loginValidator(String email,String password) throws Exception
{
Connection connection;
PreparedStatement statement;
connection=ConnectionUtil.sqlConnection();
ResultSet rs = null;
String query = "SELECT email,password,member_Id FROM Library_Membership_Details WHERE email= ? or  member_Id= ? ";
statement = connection.prepareStatement(query);
statement.setString(1,email);
statement.setString(2,email);
rs = statement.executeQuery();
String mail = null;
String Password=null;
int memberId= 0;
String number=null;
while(rs.next())
{
mail=rs.getString("email");
Password=rs.getString("password");
memberId=rs.getInt("member_Id");
number=rs.getString("member_Id");

}
if(mail==null)
{
throw new Exception("No Records Found");
}

else if(Password.equals(password))
{
	log.info("Successfully login");
	MemberProcess.Memberbook(memberId);
	
}
else
{
throw new Exception("Invalid Credentials");
}
}
}
