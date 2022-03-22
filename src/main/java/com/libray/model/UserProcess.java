package com.libray.model;

import java.util.Scanner;

import com.libray.dao.UserBookProcess;

public class UserProcess {
public static void userbook(int id) throws Exception
{
	System.out.println("1. Display all Books");
	System.out.println("2. Search book by Author");
	System.out.println("3. search book by book Name");
	System.out.println("4. serach book by dept");
	System.out.println("5. take Book");
	System.out.println("6. return Book");
	System.out.println("7. display Todays Dinamalar news");
	System.out.println("8. display Dinamalar news find by date");
	System.out.println("9. Display how many book taken and how many want to return");
	System.out.println("10. logout");
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
		System.out.println("Your sucessfully log out");
	}
}
}
