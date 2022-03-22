package com.library.test;

import java.util.Scanner;

import com.libray.model.Admin;
import com.libray.model.MemberShip;
import com.libray.model.UserFree;

public class LibraryTest {

	public static void main(String[] args) throws Exception {
	
			back();
		}
		
		
	public static void back() throws Exception
	{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome.....!! to   LIBRARY");
			System.out.println("1--> Register / Sign up");
			System.out.println("2--> Login / sign in");
			System.out.println("3--> Admin / sign in");
			
			int number = sc.nextInt();
			if(number ==1)
			{
				UserFree.UserFreeRegister();
			}
			else if(number ==2)
			{
				MemberShip.Memberlogin();
			}
			else if(number ==3)
			{
				Admin.adminlogin();
			}
			else
			{
				System.out.println(" Enter only given Option");
				back();
				
			}
			
			
			
		

	}
	}
