package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class psstatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.load and register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. JDBC Driver Loaded");
		
		String url="jdbc:mysql://localhost:3306/16thjandb";
		String username="root";
		String password="";
		
		Connection cn = DriverManager.getConnection(url, username, password);
		System.out.println("2. Connection Created");
		
		String insert="insert into login values(?,?)";
		PreparedStatement ps=cn.prepareStatement(insert);
		System.out.println("3. Prepare Statemenet is Created");
		
		ps.setString(1, "ram");
		ps.setString(2, "r123");
		
		ps.execute();
		
		cn.close();
		System.out.println("5. Connection Closed");
	}
}
