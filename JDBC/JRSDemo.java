package JDBC;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo 
{
	public static void main(String[] args) 
	{
		try {
			JdbcRowSet jrs=new OracleJDBCRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			jrs.setUsername("system");
			jrs.setPassword("tiger");
			jrs.setCommand("select * from student");
			jrs.execute();
			
			while(jrs.next())
			{
				System.out.print(jrs.getInt("rollno")+"\t");
				System.out.print(jrs.getString("name")+"\t");
				System.out.print(jrs.getInt("marks")+"\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
