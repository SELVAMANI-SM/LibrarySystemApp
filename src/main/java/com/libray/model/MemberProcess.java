package com.libray.model;

import java.util.Scanner;

import com.libray.dao.MemberBookProcess;

public class MemberProcess {
	public static void Memberbook(int id) throws Exception
	{
		System.out.println("1. Display all Books");
		System.out.println("2. Search book by Author");
		System.out.println("3. search book by book Name");
		System.out.println("4. serach book by dept");
		System.out.println("5. take Book");
		System.out.println("6. return Book");
		System.out.println("7. Take E-books");
		System.out.println("8. Take books Tutorial");
		System.out.println("9. display Todays Indian Express news");
		System.out.println("10. display Todays Hindu news");
		System.out.println("11. display Todays Dinamalar news");
		System.out.println("12. display Indian Expression news find by date");
		System.out.println("13. display hindu news find by date");
		System.out.println("14. display Dinamalar news find by date");
		System.out.println("15. Display how many book taken and how many want to return");
		System.out.println("16. logout");
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
			System.out.println("Your sucessfully log out");
		}
		
	}
	}


