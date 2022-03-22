package com.libray.logic;

import com.libray.model.Registration;

public class MemberCheck {
static int count=0;
	
	public static void UserValidation(Registration member) throws Exception
	{
	UserNameCheck(member.getMemberName());
	UserEmailCheck(member.getMemberEmail());
	UserPasswordCheck(member.getMemberPassword());
	UserMobileCheck(member.getMemberMobile());
	UserIdCheck(member.getMemberId());

	}
	public static void UserNameCheck(String MemberName) throws Exception
	{
		if(MemberName==null)
		throw new Exception("Enter Vaild Name");
		else
			count++;
		
	}
	public static void UserEmailCheck(String MemberEmail) throws Exception
	{
		if(!MemberEmail.contains("@"))
		throw new Exception("Enter Vaild Email");
		else
			count++;
		
	}
	public static void UserPasswordCheck(String  MemberPassword) throws Exception
	{
		if(MemberPassword.length()<8 || MemberPassword.length()>16)
		throw new Exception("Enter Vaild PassWord");
		else
			count++;
		
	}
	public static void UserMobileCheck(String MemberMobile) throws Exception
	{
	int count1=0;
		char[] mobile=MemberMobile.toCharArray();
		if(MemberMobile.length()>10||MemberMobile.length()<10)
		{
			
		throw new Exception("Enter Only 10 Number33 ");
		
		}
		else
			count1++;
		for(char i:mobile)
		{
			if(Character.isAlphabetic(i))
			{
				//count++;
				throw new Exception("Enter Only Numeric Value");
				
				
			}
			else
				count1++;
		
		}
		if(count1==11)
		{
			count++;
		}
		
		
	}
	public static void UserIdCheck(int MemberId) throws Exception
	{
		if(MemberId==0)
		{
		throw new Exception("Enter Vaild Id");
		}
		else
		{
			
			count++;
		}
	
	if(count==5)
	{
		System.out.println("Registration is Completed .....  Welcome");
		
		
	}
	
}
}
