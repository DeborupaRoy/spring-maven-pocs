package edu.deborupa.spring.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.deborupa.spring.Constants;
import edu.deborupa.spring.dao.LoginDAO;
import edu.deborupa.spring.html.builder.HtmlBuilder;
import edu.deborupa.spring.loginbean.LoginBean;




public class LoginServlet extends HttpServlet{
	
	public LoginServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter(Constants.USER_ID_PARAM);
		String password = request.getParameter(Constants.PASSWORD_PARAM);
		String timestamp = (String) request.getAttribute(Constants.TIMESTAMP_PARAM);
		
		PrintWriter out = response.getWriter();
		
		LoginBean beanobj = new LoginBean();
		beanobj.setusername(username);
		beanobj.setpassword(password);
		
		LoginDAO daoobj = new LoginDAO();
		String flag=daoobj.authenticate(beanobj);
		if(flag.equals("VALID"))
		{
			request.setAttribute(Constants.USER_NAME_PARAM, username);
			
			request.setAttribute(Constants.TIMESTAMP_PARAM, timestamp);
			request.getRequestDispatcher("Welcome.jsp").forward(request,response);
		}
		else
		{
			out.println(new HtmlBuilder("<body onload=\"alert('ERROR. TRY AGAIN')\"></body>").addHeadTag().addHtmlTag().build());
		    out.println(new HtmlBuilder("<meta http-equiv='refresh' content='3;URL=Login.jsp'>").build());
		}
	}
}
