package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class stud_info{
		Connection cn;
		PreparedStatement ps;
		
		stud_info() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password = "";
			
			cn = DriverManager.getConnection(url, username, password);
			
			String insert = "insert into studentinfo values(?, ? ,?, ?)";
			ps = cn.prepareStatement(insert);
		}
	}

class stud_input extends stud_info{
	
	stud_input() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void insert(int roll_no, String name, String city, int mobile) throws SQLException{
		ps.setInt(1, roll_no);
		ps.setString(2, name);
		ps.setString(3, city);
		ps.setInt(4, mobile);
		
		ps.executeUpdate();
		 
		cn.close();
	}
}


public class Student {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Scanner sc = new Scanner(System.in);
	
	stud_input si = new stud_input();
	
	System.out.println("Enter Roll No.: ");
	int roll_no = sc.nextInt();
	
	System.out.println("Enter Name of Student: ");
	String name = sc.next();
	
	System.out.println("Enter City Name: ");
	String city = sc.next();
	
	System.out.println("Enter Student Mobile No.: ");
	int mobile = sc.nextInt();
	
	sc.close();
	
	si.insert(roll_no, name, city, mobile);
	System.out.println("Inserted Successfully");
}
}
