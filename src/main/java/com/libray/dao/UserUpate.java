package com.libray.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.libray.model.Registration;

public class UserUpate {
	public static void InsertUser(Registration user) throws Exception {
		Connection connection;
		PreparedStatement statement;
		connection=ConnectionUtil.sqlConnection();
		String query="insert into  library_User_Details(name,email,password,mobile,user_Id)values(?,?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setString(1, user.getUserName());
		statement.setString(2, user.getUserEmail());

		statement.setString(3, user.getUserPassword());

		statement.setString(4, user.getUserMobile());
		statement.setInt(5, user.getUserId());
		
		int rows = statement.executeUpdate();
		System.out.println("No of rows inserted:"+rows);
		
		}
	}


