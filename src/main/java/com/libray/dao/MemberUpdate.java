package com.libray.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.libray.model.Registration;

public class MemberUpdate {
	public static void InsertMember(Registration member) throws Exception {
		Connection connection;
		PreparedStatement statement;
		connection=ConnectionUtil.sqlConnection();
		String query="insert into Library_Membership_Details(name,email,password,mobile,member_Id)values(?,?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setString(1, member.getMemberName());
		statement.setString(2, member.getMemberEmail());

		statement.setString(3, member.getMemberPassword());

		statement.setString(4, member.getMemberMobile());
		statement.setInt(5, member.getMemberId());
		
		int rows = statement.executeUpdate();
		System.out.println("No of rows inserted:"+rows);
		
		}
}
