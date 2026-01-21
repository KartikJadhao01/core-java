package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class firstjdbc {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//1.load and register driver
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("1. JDBC Driver Loaded Successfully");
	
	String url="jdbc:mysql://localhost:3306/16thjandb";
	String username="root";
	String password="";
	
	Connection cn = DriverManager.getConnection(url, username, password);
	System.out.println("2. Connection Created");
	
	Statement st=cn.createStatement();
	System.out.println("3. Statemenet is Created");
	
	String create_table="create table login(username varchar(100), password varchar(100))";
	
	st.execute(create_table);
	System.out.println("4. Query Executed");
	
	cn.close();
	System.out.println("5. Connection Closed");
}
}

