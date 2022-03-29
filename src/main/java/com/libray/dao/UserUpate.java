package com.libray.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.libray.model.Registration;

public class UserUpate {
	private static Logger log= LogManager.getLogger(UserUpate.class);
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
		log.info("No of rows inserted:"+rows);
		
		}
	}


