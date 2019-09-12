package edu.deborupa.spring.connection;

import java.sql.Connection;
import java.sql.DriverManager;



public class dbConnection {
	  
	public Connection getConnection() {
		Connection con=null;
	try
	{  
	//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	//step2 create  the connection object  
		con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@172.16.30.14:1521:d112cr1","gvhk_dwh_source_sbi","gvhk_dwh_source_sbi");  
	}
	catch(Exception e){ System.out.println(e);}  
	return con;  
	}  
	}


