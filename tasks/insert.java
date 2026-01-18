package task;

import java.sql.SQLException;

public class insert extends setup{
void query() throws SQLException {
	String ins="insert into login values('admin', 'admin@123')";
//	st.execute(ins);
	System.out.println("4.insert query executed");
	
	
}

void delete() throws SQLException {
	String del="delete from login where username='admin'";
//	st.execute(del);
	cn.close();
}

public static void main(String[] args) throws ClassNotFoundException, SQLException {
	insert ob=new insert();
	ob.dbsetup();
//	ob.query();
//	ob.delete();
}
}
