package com.library.test;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.libray.model.Admin;
import com.libray.model.MemberShip;
import com.libray.model.UserFree;

public class LibraryTest {
	private static Logger log= LogManager.getLogger(LibraryTest.class);

	public static void main(String[] args) throws Exception {
	
			back();
		}
		
		
	public static void back() throws Exception
	{
			
			Scanner sc = new Scanner(System.in);
			log.info("Welcome.....!! to   LIBRARY");
			log.info("1--> Register / Sign up");
			log.info("2--> Login / sign in");
			log.info("3--> Admin / sign in");
			log.info("4--> Exit");
			
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
			else if(number ==4)
			{
				
			}
			else
			{
				log.warn(" Enter only given Option");
				back();
				
			}
			
			
			
		

	}
	}
