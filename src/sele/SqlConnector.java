package sele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SqlConnector {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root",null); 

		java.sql.Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from skillset where role='Tester'");
		
		while(rs.next()) {
			
			int experience=rs.getInt(1);
			String role=rs.getString(2);
			String name=rs.getString(3);
			String education=rs.getString(4);
			
			System.out.println(education+" "+experience+" "+role+" "+name);
	
		}
		con.close();
	}

}
