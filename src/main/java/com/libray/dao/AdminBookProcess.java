package com.libray.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class AdminBookProcess {
	private static Logger log= LogManager.getLogger(AdminBookProcess.class);
	public static void add() throws Exception {
		@SuppressWarnings("resource")
		Scanner rm = new Scanner(System.in);
		log.info("Enter Book_id");
		int bookIdNumber = rm.nextInt();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		log.info("Enter BooksName");
		String bookName = sc.nextLine();
		log.info("Enter dept");
		String deptment = sc.nextLine();
		// log.info("Enter Student_Staff");
		// String studentsStaff = sc.nextLine();
		log.info("Enter Author");
		String suthors = sc.nextLine();
		log.info("Enter Status");
		String specify = sc.nextLine();
		log.info("Enter Website Link ");
		String website = sc.nextLine();
		log.info("Enter VIdeo link ");
		String video = sc.nextLine();

		String query = "insert into books_library (Book_id,Books_Name,Dept,Author,Status_Book,reference_Website,Reference_Video) values ('"+bookIdNumber+"','"
				+ bookName + "','" + deptment + "','" + suthors + "','" + specify + "','" + website + "','" + video
				+ "')";
		Connection connection;
		connection=ConnectionUtil.sqlConnection();

		Statement st = connection.createStatement();
		st.executeUpdate(query);

	}
	public static void deleteBookId() throws Exception
	{
		log.info("Enter book id ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query1 = "DELETE FROM books_library WHERE Book_id ='" + number + "'";
		Statement stm = connection.createStatement();
		stm.executeUpdate(query1);
	}
	public static void DeleteBookAuthor() throws Exception
	{
	log.info("Enter book Author ");
	Scanner sc = new Scanner(System.in);
	String BookAuthor = sc.nextLine();
	Connection connection;
	connection=ConnectionUtil.sqlConnection();
	String query2 = "DELETE FROM books_library WHERE Author = '" + BookAuthor + "'";

	Statement stt = connection.createStatement();
	stt.executeUpdate(query2);
}
	public static void DeleteBookDept() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String BookDept = sc.nextLine();
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query3 = "DELETE FROM books_library WHERE Dept = '" + BookDept + "'";
		Statement st3 = connection.createStatement();
		st3.executeUpdate(query3);
	}
	public static void Memberid() throws Exception {
		String name="null";
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query1="select member_id,book_id,book_taken_date,book_return_date,book_status from book_register where member_id<>'"+name+ "'" ;

		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
		while (rs.next()) {
				log.info(rs.getString("member_id")+ "\t" +rs.getString("book_id") + "\t" + rs.getString("book_taken_date")+ "\t" + rs.getString("book_return_date")+ "\t" + rs.getString("book_status"));

			}

}
	public static void UserId() throws Exception {
		String name="null";
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query1="select user_id,book_id,book_taken_date,book_return_date,book_status from book_register where user_id<>'"+name+ "'" ;

		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
		while (rs.next()) {
				log.info(rs.getString("user_id")+ "\t" +rs.getString("book_id") + "\t" + rs.getString("book_taken_date")+ "\t" + rs.getString("book_return_date")+ "\t" + rs.getString("book_status"));

			}

}
public static void NewsIndianPaper() throws Exception {
		
		Scanner sc=new Scanner(System.in);
		LocalDate date=LocalDate.now();
			log.info("Enter Indain_news");
			String indianNews = sc.nextLine();
		

			String query = "insert into Daily_News_Papers(News_Date,Indian_Express) values ('"+date+"','" + indianNews+ "')";
			Connection connection;
			connection=ConnectionUtil.sqlConnection();

			Statement st1 = connection.createStatement();
			st1.executeUpdate(query);
	}
public static void NewsHinduPaper() throws Exception {
	
	Scanner sc=new Scanner(System.in);
	LocalDate date=LocalDate.now();
		
		log.info("Enter Hindu_news E- paper");
		String hinduNews = sc.nextLine();
		
		String query = "insert into Daily_News_Papers(News_Date,Hindu) values ('"+date+"','" + hinduNews + "')";
		Connection connection;
		connection=ConnectionUtil.sqlConnection();

		Statement st1 = connection.createStatement();
		st1.executeUpdate(query);
}
public static void NewsDinamalarPaper() throws Exception {
	
	Scanner sc=new Scanner(System.in);
	LocalDate date=LocalDate.now();

		log.info("Enter Dinamalar news E-paper ");
		String Dinamalar = sc.nextLine();

		String query = "insert into Daily_News_Papers(News_Date,Dinamalar) values ('"+date+"','" + Dinamalar + "')";
		Connection connection;
		connection=ConnectionUtil.sqlConnection();

		Statement st1 = connection.createStatement();
		st1.executeUpdate(query);
}
}
