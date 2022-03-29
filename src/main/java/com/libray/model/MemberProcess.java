package com.libray.model;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.libray.dao.MemberBookProcess;

public class MemberProcess {
	private static Logger log= LogManager.getLogger(MemberProcess.class);
	public static void Memberbook(int id) throws Exception
	{
		log.info("1. Display all Books");
		log.info("2. Search book by Author");
		log.info("3. search book by book Name");
		log.info("4. serach book by dept");
		log.info("5. Take Book");
		log.info("6. Return Book");
		log.info("7. Take E-books");
		log.info("8. Take books Tutorial");
		log.info("9. display Todays Indian Express news");
		log.info("10. display Todays Hindu news");
		log.info("11. display Todays Dinamalar news");
		log.info("12. display Indian Expression news find by date");
		log.info("13. display hindu news find by date");
		log.info("14. display Dinamalar news find by date");
		log.info("15. Display how many book taken and how many want to return");
		log.info("16. logout");
		int number2=id;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number==1) {
			MemberBookProcess.bookprocessMember();
			MemberProcess.Memberbook(number2);
		}
		else if(number==2)
		{
			MemberBookProcess.Author();
			MemberProcess.Memberbook(number2);
		}
		else if(number==3)
		{
			MemberBookProcess.BookName();
			MemberProcess.Memberbook(number2);
		}
		else if(number==4)
		{	
			MemberBookProcess.Dept();
			MemberProcess.Memberbook(number2);
		}
		else if(number==5)
		{
			MemberBookProcess.TakeBookMember(id);
			MemberProcess.Memberbook(number2);
		}
		else if(number==6)
		{
			MemberBookProcess.ReturnBook();
			MemberProcess.Memberbook(number2);
		}
		else if(number == 7)
		{
			MemberBookProcess.ReferenceWebsite();
			MemberProcess.Memberbook(number2);
		}
		else if(number==8)
		{
			MemberBookProcess.ReferenceVideo();
			MemberProcess.Memberbook(number2);
		}
		else if(number==9)
		{
			MemberBookProcess.TodayIndianNews();
			MemberProcess.Memberbook(number2);
		}
		else if(number ==10)
		{
			MemberBookProcess.TodayHinduNews();
			MemberProcess.Memberbook(number2);
		}
		else if(number==11)
		{

			MemberBookProcess.TodayDinamalarNews();
			MemberProcess.Memberbook(number2);
		}
		else if(number ==12)
		{
			MemberBookProcess.DateIndianNews();
			MemberProcess.Memberbook(number2);
		}
		else if(number ==13)
		{
			MemberBookProcess.DateHinduNews();
			MemberProcess.Memberbook(number2);
		}
		else if(number==14)
		{
			MemberBookProcess.DateDinamalarNews();
			MemberProcess.Memberbook(number2);
		}
		else if(number==15)
		{
			MemberBookProcess.Memberprocess(id); 
			MemberProcess.Memberbook(number2);
		}
		else 
		{
			log.info("Your sucessfully log out");
		}
		
	}
	}


