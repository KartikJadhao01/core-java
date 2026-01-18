package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class setup {
	
	Connection cn;
	Statement st;
	
	void dbsetup() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. JDBC Driver Loaded");
		
		String url="jdbc:mysql://localhost:3306/16thjandb";
		String username="root";
		String password="";
		
		cn = DriverManager.getConnection(url, username, password);
		System.out.println("2. Connection Created");
		
//		st=cn.createStatement();
		String insert="insert into login values(?,?)";
		PreparedStatement ps=cn.prepareStatement(insert);
		System.out.println("3. Prepare Statemenet is Created");
	}
}
