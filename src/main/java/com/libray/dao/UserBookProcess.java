package com.libray.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserBookProcess {
	private static Logger log= LogManager.getLogger(UserBookProcess.class);
public static void bookprocessUser() throws Exception {
	Scanner sc = new Scanner(System.in);
	Connection connection;
	connection=ConnectionUtil.sqlConnection();
	//String valuable="Available";
	
	String query1 = "SELECT Book_id,Books_Name,Status_Book FROM books_library ";
	Statement stm = connection.createStatement();
	ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
	while (rsm.next()) {
		log.info(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name")+"                       ------->          \t" +rsm.getString("Status_book"));

	}
}
public static void Author() throws Exception {
	log.info("Enter book Author ");
	Scanner sc = new Scanner(System.in);
	String BookAuthor = sc.nextLine();
	Connection connection;
	connection=ConnectionUtil.sqlConnection();
	String query2 = "select Book_id,Author FROM books_library WHERE Author = '" + BookAuthor + "' order by Author" ;
	Statement stm = connection.createStatement();
	ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
	while (rsm.next()) {
		log.info(rsm.getString("Book_id")+  " \t" +rsm.getString("Author"));

}
}
public static void BookName() throws Exception
{
	
		log.info("Enter book Name ");
		Scanner sc = new Scanner(System.in);
		String BookAuthor = sc.nextLine();
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query2 = "select Book_id,Books_Name FROM books_library WHERE Books_Name = '" + BookAuthor + "' order by Books_Name " ;
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
		while (rsm.next()) {
			log.info(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name"));

	}
	}
public static void  Dept() throws Exception
{
	
	Connection connection;
	connection=ConnectionUtil.sqlConnection();
	
	log.info("Enter dept like EEE ");
	Scanner sc = new Scanner(System.in);
	String BookAuthor = sc.nextLine();
	
	String query1 = "SELECT Book_id,Books_Name,Dept FROM books_library WHERE Dept = '" + BookAuthor + "'  " ;
	Statement stm = connection.createStatement();
	ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
	while (rsm.next()) {
		log.info(rsm.getString("Book_id")+ "\t" + rsm.getString("Books_Name")+"                       ------->          \t" +rsm.getString("Dept"));

}
}
public static void TakeBook(int student) throws Exception
{
	
	String name="Unavailable";
	
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	Connection connection;
	connection=ConnectionUtil.sqlConnection();
	
	log.info("Enter book id");
	int name1 = sc.nextInt();
	String query1="UPDATE books_library SET Status_Book='"+name+"' WHERE Book_id = '"+name1+"'" ;
	
	Statement stm = connection.createStatement();
	stm.executeUpdate(query1);
	log.info("yeah success fully taken");
	addId(student,name1);
	
	}
public static void addId(int student,int name1) throws Exception
{
	String name2="not return";
	LocalDate date=LocalDate.now();
	String query1="insert into book_register (user_id,book_id,book_taken_date,book_status)values('"+student+"','"+name1+"','"+date+"','"+name2+"')" ;
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
	
	
	log.info("Enter book_id ");
	int name1 = sc.nextInt();
	String query2="UPDATE books_library SET Status_Book='"+name+"' WHERE Book_id = '"+name1+"'" ;
	Connection connection;
	connection=ConnectionUtil.sqlConnection();
	Statement stm = connection.createStatement();
	stm.executeUpdate(query2);
	log.info("yeah success fully Return");
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
	public static void TodayNews() throws Exception
	{
		//Scanner sc = new Scanner(System.in);
		//log.info("Enter book id");
		LocalDate number1= LocalDate.now();
		Connection connection;
		String value="null";
		connection=ConnectionUtil.sqlConnection();
		String query1 = "SELECT Dinamalar FROM Daily_News_Papers where News_Date = '"+ number1+"'and Dinamalar<>'"+value+"'";
		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
		while (rs.next()) {
		
			log.info("Dinamalar  -->"+rs.getString("Dinamalar"));
}
		log.info("Take Today newsPapers");
}
	public static void DateNews() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		log.info("Enter date like ' 2022-03-13 --> year-mon-day' ");
		String number1=sc.next();
		Connection connection;
		String value="null";
		connection=ConnectionUtil.sqlConnection();
		String query1 = "SELECT Dinamalar FROM Daily_News_Papers where News_Date = '"+ number1+"'and Dinamalar<>'"+value+"'";
		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
		while (rs.next()) {
			
			log.info("Dinamalar  -->"+rs.getString("Dinamalar"));
}
		log.info("Take Today newsPapers");
}
	public static void Studentprocess(int faculty) throws Exception{

		String value="not return";
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query = "SELECT * FROM book_register WHERE book_status='"+value+"' and user_id='"+faculty+"' ";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		
		int count=0;
		
		while(rs.next())
		{
			count++;
		}
		log.info("You have  taken "+ count+" book");
		
		log.info("You need to return "+ count +" book");
		connect(faculty);
}
	public static void connect(int id) throws Exception
	{
		
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query1="select user_id,book_id,book_taken_date,book_return_date,book_status from book_register where user_id='"+id+"'" ;

		Statement st = connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query1);
		while (rs.next()) {
				log.info(rs.getString("user_id")+ "\t" +rs.getString("book_id") + "\t" + rs.getString("book_taken_date")+ "\t" + rs.getString("book_return_date")+ "\t" + rs.getString("book_status"));

			}
}
}
