package edu.deborupa.spring.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.sql.Timestamp;

import edu.deborupa.spring.Constants;

public class AddFieldFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		String username = req.getParameter(Constants.USER_ID_PARAM);
		String password = req.getParameter(Constants.PASSWORD_PARAM);
		Date date= new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		
		String timestamp =ts.toString();
	
		req.setAttribute(Constants.USER_NAME_PARAM, username);
		req.setAttribute(Constants.PASSWORD_PARAM, password);
		req.setAttribute(Constants.TIMESTAMP_PARAM, timestamp);
		
		req.getRequestDispatcher("LoginServlet").forward(req,resp);
		
	}

	@Override
	public void destroy() {
		
		
	}

}
