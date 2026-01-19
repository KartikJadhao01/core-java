package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


 class jdbcsetup {
	Connection cn;
	PreparedStatement ps;
	
	jdbcsetup() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC Driver Loaded");
		
		String url = "jdbc:mysql://localhost:3306/fortune";
		String username = "root";
		String password = "";
		
		cn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Crated");
		
		String query = "insert into student values(?,?,?)";
		ps = cn.prepareStatement(query);
		
		String update = "update student set mobile = ? WHERE name = ?";
		ps = cn.prepareStatement(update);
		
		String delete = "delete from student WHERE id = ?";
		ps = cn.prepareStatement(delete);
	}
 }
	
	class operation extends jdbcsetup{

		operation() throws ClassNotFoundException, SQLException {
			super();
			// TODO Auto-generated constructor stub
		}
		
		void insert() throws SQLException {
			ps.setInt(1, 5);
			ps.setString(2,"Purvesh");
			ps.setInt(3, 947461312);
			ps.executeUpdate();
		}
		
		void update() throws SQLException {
			ps.setInt(1, 978431254);
			ps.setString(2, "Akshay");
			ps.executeUpdate();
		}
		
		void delete() throws SQLException {
			ps.setInt(1, 5);
			ps.executeUpdate();
			System.out.println("Successfully DEleted");
		}
	}


public class fortune {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	operation o = new operation();
//	o.insert();
//	o.update();
	o.delete();
}
}

