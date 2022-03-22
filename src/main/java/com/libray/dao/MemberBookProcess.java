package com.libray.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class MemberBookProcess {
	public static void bookprocessMember() throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		//String valuable="Available";
		
		String query1 = "SELECT Book_id,Books_Name,Status_Book FROM books_library ";
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
		while (rsm.next()) {
			System.out.println(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name")+"                       ------->          \t" +rsm.getString("Status_book"));

		}
	}
	public static void Author() throws Exception {
		System.out.println("Enter book Author ");
		Scanner sc = new Scanner(System.in);
		String BookAuthor = sc.nextLine();
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query2 = "select Book_id,Author FROM books_library WHERE Author = '" + BookAuthor + "' order by Author" ;
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
		while (rsm.next()) {
			System.out.println(rsm.getString("Book_id")+  " \t" +rsm.getString("Author"));

	}
	}
	public static void BookName() throws Exception
	{
		
			System.out.println("Enter book Name ");
			Scanner sc = new Scanner(System.in);
			String BookAuthor = sc.nextLine();
			Connection connection;
			connection=ConnectionUtil.sqlConnection();
			String query2 = "select Book_id,Books_Name FROM books_library WHERE Books_Name = '" + BookAuthor + "' order by Books_Name " ;
			Statement stm = connection.createStatement();
			ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
			while (rsm.next()) {
				System.out.println(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name"));

		}
		}
	public static void  Dept() throws Exception
	{
		
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		
		System.out.println("Enter dept like EEE ");
		Scanner sc = new Scanner(System.in);
		String BookAuthor = sc.nextLine();
		
		String query1 = "SELECT Book_id,Books_Name,Dept FROM books_library WHERE Dept = '" + BookAuthor + "'  " ;
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
		while (rsm.next()) {
			System.out.println(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name")+"                       ------->          \t" +rsm.getString("Dept"));

	}
	}
	public static void TakeBookMember(int student) throws Exception
	{
		
		String name="Unavailable";
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		
		System.out.println("Enter book id");
		int name1 = sc.nextInt();
		String query1="UPDATE books_library SET Status_Book='"+name+"' WHERE Book_id = '"+name1+"'" ;
		
		Statement stm = connection.createStatement();
		stm.executeUpdate(query1);
		System.out.println("yeah success fully taken");
		addId(student,name1);
		
		}
	public static void addId(int student,int name1) throws Exception
	{
		String name2="not return";
		LocalDate date=LocalDate.now();
		String query1="insert into book_register (member_id,book_id,book_taken_date,book_status)values('"+student+"','"+name1+"','"+date+"','"+name2+"')" ;
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		Statement stm = connection.createStatement();
		stm.executeUpdate(query1);
		
	}
	public static void ReturnBook() throws Exception
	{
		
		
		String name="Available";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter book_id ");
		int name1 = sc.nextInt();
		String query2="UPDATE books_library SET Status_Book='"+name+"' WHERE Book_id = '"+name1+"'" ;
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		Statement stm = connection.createStatement();
		stm.executeUpdate(query2);
		System.out.println("yeah success fully Return");
		Return(name1);
	}
		public static void Return(int name1) throws Exception
		{
			Connection connection;
			connection=ConnectionUtil.sqlConnection();
			String name2="return";
			LocalDate date=LocalDate.now();
			String query1="update book_register set book_status='"+name2+"' , book_return_date ='"+date+"' where book_id='"+name1+"' ";
			
			Statement stm = connection.createStatement();
			stm.executeUpdate(query1);
			
		}
		public static void TodayIndianNews() throws Exception
		{
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Enter book id");
			LocalDate number1= LocalDate.now();
			String value="null";
			Connection connection;
			connection=ConnectionUtil.sqlConnection();
			String query1 = "SELECT Indian_Express FROM Daily_News_Papers where News_Date = '"+ number1+"' and  Indian_Express<>'"+value+"'";
			Statement st = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
				System.out.println("Indian Expression  -->"+rs.getString("Indian_Express"));
			
	}
			System.out.println("Take Today newsPapers");
	}
		public static void TodayHinduNews() throws Exception
		{
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Enter book id");
			LocalDate number1= LocalDate.now();
			String value="null";
			Connection connection;
			connection=ConnectionUtil.sqlConnection();
			String query1 = "SELECT Hindu FROM Daily_News_Papers where News_Date = '"+ number1+"'and  Hindu<>'"+value+"'";
			Statement st = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
				
				System.out.println("The Hindu  -->"+rs.getString("Hindu"));
				
	}
			System.out.println("Take Today newsPapers");
	}
		public static void TodayDinamalarNews() throws Exception
		{
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Enter book id");
			LocalDate number1= LocalDate.now();
			String value="null";
			Connection connection;
			connection=ConnectionUtil.sqlConnection();
			String query1 = "SELECT Dinamalar FROM Daily_News_Papers where News_Date = '"+ number1+"'and Dinamalar<>'"+value+"'";
			Statement st = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
			
				System.out.println("Dinamalar  -->"+rs.getString("Dinamalar"));
	}
			System.out.println("Take Today newsPapers");
	}
		public static void DateIndianNews() throws Exception
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter date like ' 2022-03-13 --> year-mon-day' ");
			String number1=sc.next();
			Connection connection;
			String value="null";
			connection=ConnectionUtil.sqlConnection();
			String query1 = "SELECT Indian_Express FROM Daily_News_Papers where News_Date = '"+ number1+"' and  Indian_Express<>'"+value+"'";
			Statement st = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
				System.out.println("Indian Expression  -->"+rs.getString("Indian_Express"));
		
	}
			System.out.println("Take Today newsPapers");
	}
		public static void DateHinduNews() throws Exception
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter date like ' 2022-03-13 --> year-mon-day' ");
			String number1=sc.next();
			Connection connection;
			String value="null";
			connection=ConnectionUtil.sqlConnection();
			String query1 = "SELECT Hindu FROM Daily_News_Papers where News_Date = '"+ number1+"'and  Hindu<>'"+value+"'";
			Statement st = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
				
				System.out.println("The Hindu  -->"+rs.getString("Hindu"));
			
	}
			System.out.println("Take Today newsPapers");
	}
		public static void DateDinamalarNews() throws Exception
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter date like ' 2022-03-13 --> year-mon-day' ");
			String number1=sc.next();
			Connection connection;
			String value="null";
			connection=ConnectionUtil.sqlConnection();
			String query1 = "SELECT Dinamalar FROM Daily_News_Papers where News_Date = '"+ number1+"'and  Dinamalar<>'"+value+"'";
			Statement st = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
				
				System.out.println("Dinamalar  -->"+rs.getString("Dinamalar"));
	}
			System.out.println("Take Today newsPapers");
	}
		public static void Memberprocess(int faculty) throws Exception{

			String value="not return";
			Connection connection;
			connection=ConnectionUtil.sqlConnection();
			String query = "SELECT * FROM book_register WHERE book_status='"+value+"' and member_id='"+faculty+"' ";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
			
			int count=0;
			
			while(rs.next())
			{
				count++;
			}
			System.out.println("You have  taken "+ count+" book");
			
			System.out.println("You need to return "+ count +" book");
			connect(faculty);
		}
		public static void connect(int id) throws Exception
		{
			
			Connection connection;
			connection=ConnectionUtil.sqlConnection();
			String query1="select member_id,book_id,book_taken_date,book_return_date,book_status from book_register where member_id='"+id+"'" ;

			Statement st = connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
			while (rs.next()) {
					System.out.println(rs.getString("member_id")+ "\t" +rs.getString("book_id") + "\t" + rs.getString("book_taken_date")+ "\t" + rs.getString("book_return_date")+ "\t" + rs.getString("book_status"));

				}

	}
		public static void ReferenceWebsite() throws Exception 
		{
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter booK_id for E-book ");
				int  number1=sc.nextInt();
				Connection connection;
				connection=ConnectionUtil.sqlConnection();
				String query1 = "SELECT Reference_Website FROM books_library where Book_id = '"+ number1+"'";
				Statement stm = connection.createStatement();
				ResultSet rst = ((java.sql.Statement) stm).executeQuery(query1);
				while (rst.next()) {
					System.out.println(rst.getString("Reference_Website"));
				
				}
				System.out.println("Take your E-book");
		}
		public static void ReferenceVideo() throws Exception 
		{
		
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter book id");
				int number1=sc.nextInt();
				Connection connection;
				connection=ConnectionUtil.sqlConnection();
				String query1 = "SELECT Reference_Video FROM books_library where Book_id = '"+ number1+"'";
				Statement st = connection.createStatement();
				ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
				while (rs.next()) {
					System.out.println(rs.getString("Reference_Video"));
		}
				System.out.println("Take your video tutorial");
		}
	
	
	}


