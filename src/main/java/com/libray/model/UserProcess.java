package com.libray.model;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.libray.dao.UserBookProcess;

public class UserProcess {
	private static Logger log= LogManager.getLogger(UserProcess.class);
public static void userbook(int id) throws Exception
{
	log.info("1. Display all Books");
	log.info("2. Search book by Author");
	log.info("3. search book by book Name");
	log.info("4. serach book by dept");
	log.info("5. Take Book");
	log.info("6. Return Book");
	log.info("7. display Todays Dinamalar news");
	log.info("8. display Dinamalar news find by date");
	log.info("9. Display how many book taken and how many want to return");
	log.info("10. logout");
	int number2=id;
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number==1) {
		UserBookProcess.bookprocessUser();
		UserProcess.userbook(number2);
	}
	else if(number==2)
	{
		UserBookProcess.Author();
		UserProcess.userbook(number2);
	}
	else if(number==3)
	{
		UserBookProcess.BookName();
		UserProcess.userbook(number2);
	}
	else if(number==4)
	{
		UserBookProcess.Dept();
		UserProcess.userbook(number2);
	}
	else if(number==5)
	{
		UserBookProcess.TakeBook(id);
		UserProcess.userbook(number2);
	}
	else if(number==6)
	{
		UserBookProcess.ReturnBook();
		UserProcess.userbook(number2);
	}
	else if(number==7)
	{
		UserBookProcess.TodayNews();
		UserProcess.userbook(number2);
	}
	else if(number ==8)
	{
		UserBookProcess.DateNews();
		UserProcess.userbook(number2);
	}
	else if(number==9)
	{
		UserBookProcess.Studentprocess( id); 
		UserProcess.userbook(number2);
	}
	else
	{
		log.info("Your sucessfully log out");
	}
}
}
