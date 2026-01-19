package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class setup1{
	Connection cn;
	void jdbcsetup() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "";
		
		cn = DriverManager.getConnection(url, username, password);
	}
}

class operation extends setup1{
PreparedStatement ps;
Scanner sc = new Scanner(System.in);
void insert() throws SQLException {
	
	System.out.println("Enter No. of Students: ");
	int count = sc.nextInt();
	
	String ins = "insert into studentinfo values(?, ?, ?, ?)";
	ps = cn.prepareStatement(ins);
	
	for(int i = 1; i <= count; i++) {
		System.out.println("Enter Roll No.: ");
		int roll_no = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter City name: ");
		String city = sc.next();
		
		System.out.println("Enter mobile No.: ");
		int mobile = sc.nextInt();
		
		ps.setInt(1, roll_no);
		ps.setString(2, name);
		ps.setString(3, city);
		ps.setInt(4, mobile);
		
		ps.executeUpdate();
	}
//	cn.close();
}

void delete() throws SQLException {
	System.out.println("Enter No. of delete count: ");
	int count = sc.nextInt();
	
	String del = "delete from studentinfo where roll_no = ?";
	ps = cn.prepareStatement(del);
	
	for(int i = 1; i <= count; i++) {
		System.out.println("Enter Roll No.: ");
		int roll_no = sc.nextInt();
		
		ps.setInt(1, roll_no);
		
		ps.executeUpdate();
	}
//	cn.close();
}

void update() throws SQLException {
	System.out.println("Enter No. of update count: ");
	int count = sc.nextInt();
	
	String upd = "update studentinfo set roll_no = ? where name = ?";
	ps = cn.prepareStatement(upd);
	
	for(int i = 1; i <= count; i++) {
		System.out.println("Enter Roll No.: ");
		int roll_no = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		ps.setInt(1, roll_no);
		ps.setString(2, name);
		
		ps.executeUpdate();
	}
	cn.close();
}
}


public class jdbctask{
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	operation ob = new operation();
	ob.jdbcsetup();
//	ob.insert();
//	ob.delete();
	ob.update();
}


}
