package com.libray.model;

import java.util.Scanner;

import com.libray.dao.AdminBookProcess;
import com.libray.dao.MemberBookProcess;

public class AdminProcess {
	public static void AdminProcessBook() throws Exception
	{
		System.out.println("1. Add books");
		System.out.println("2. Delete by bookId");
		System.out.println("3. Delete by book Author ");
		System.out.println("4. Delete by Dept");
		System.out.println("5. AddNews Indian Expresion E-Paper ");
		System.out.println("6. AddNews the Hindu E-paper");
		System.out.println("7. AddNews Dinamalar E-paper");
		System.out.println("8. Show User Process");
		System.out.println("9. Show MemberShip process");
		System.out.println("10. Display all books");
		System.out.println("11. logout");
	
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
			System.out.println("Your sucessfully log out");
		}
	}
	}



