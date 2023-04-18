package com.tap.Pojo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaImp implements StudentDa {

	private static final String SAVE_QUERY = "INSERT INTO class_24.Student (sid, name, email, phone ) VALUES(?,?,?,?)";
	
	private static final String UPDATE_QUERY = "UPDATE Student set email = ? WHERE sid = ? ";

	private static final String DELETE_QUERY = "DELETE FROM class_24.Student WHERE sid = ? ";

	private static final String READ_QUERY = "SELECT * FROM class_24.Student";
	
	private Connection connection;

	
	public StudentDaImp() {
// connection releated 
		
		String url = "jdbc:mysql://localhost:3306/class_24";
		String user = "root";
		String password = "ROOT";
		
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@Override
	public int save() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet retreive() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
