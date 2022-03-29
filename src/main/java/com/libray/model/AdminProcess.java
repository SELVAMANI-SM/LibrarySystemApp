package com.libray.model;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.libray.dao.AdminBookProcess;
import com.libray.dao.MemberBookProcess;

public class AdminProcess {
	private static Logger log= LogManager.getLogger(AdminProcess.class);
	public static void AdminProcessBook() throws Exception
	{
		log.info("1. Add books");
		log.info("2. Delete by bookId");
		log.info("3. Delete by book Author ");
		log.info("4. Delete by Dept");
		log.info("5. AddNews Indian Expresion E-Paper ");
		log.info("6. AddNews the Hindu E-paper");
		log.info("7. AddNews Dinamalar E-paper");
		log.info("8. Show User Process");
		log.info("9. Show MemberShip process");
		log.info("10. Display all books");
		log.info("11. logout");
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number==1) {
			AdminBookProcess.add();
			AdminProcess.AdminProcessBook();
		}
		else if(number==2)
		{
			AdminBookProcess.deleteBookId();
			AdminProcess.AdminProcessBook();
		}
		else if(number==3)
		{
			AdminBookProcess.DeleteBookAuthor();
			AdminProcess.AdminProcessBook();
		}
		else if(number==4)
		{	
			AdminBookProcess.DeleteBookDept();
			AdminProcess.AdminProcessBook();
		}
		else if(number==5)
		{
			AdminBookProcess.NewsIndianPaper();
			AdminProcess.AdminProcessBook();
		}
		else if(number==6)
		{
			AdminBookProcess.NewsHinduPaper();
			AdminProcess.AdminProcessBook();
		}
		else if(number == 7)
		{
			AdminBookProcess.NewsDinamalarPaper();
			AdminProcess.AdminProcessBook();
		}
		else if(number==8)
		{
			AdminBookProcess.UserId();
			AdminProcess.AdminProcessBook();
		}
		else if(number==9)
		{
			AdminBookProcess.Memberid();
			AdminProcess.AdminProcessBook();
		}
		
		else if(number ==10)
		{
			MemberBookProcess.bookprocessMember();
			AdminProcess.AdminProcessBook();
		}
		else
		{
			log.info("Your sucessfully log out");
		}
	}
	}



