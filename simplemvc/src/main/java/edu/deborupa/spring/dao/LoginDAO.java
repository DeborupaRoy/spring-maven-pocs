package edu.deborupa.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import edu.deborupa.spring.connection.dbConnection;
import edu.deborupa.spring.loginbean.LoginBean;

public class LoginDAO {
	public String authenticate(LoginBean beanobj) {
		//getting user insert data
		
		String username = beanobj.getname();
		String password = beanobj.getpassword();
		
		// getting database connection
		dbConnection dbobj = new dbConnection();
		Connection con = dbobj.getConnection();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		String flag="INVALID";
		try
		{
			stmt = con.prepareStatement("select 'TRUE' from LOGIN_TABLE where username=? and password =?");
			stmt.setString(1,username); 
			stmt.setString(2,password);
			rs = stmt.executeQuery();
			while(rs.next())  
				{
					if (rs.getString(1).contentEquals("TRUE"))
						return "VALID";
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
}
}
