package edu.deborupa.spring.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AccessControlFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
	
		
		HttpSession session = req.getSession(false);
		
		if(session == null ) {
			
			req.getRequestDispatcher("login").forward(req,res);
		}
		else
		{
			
			ArrayList<String> Pages = new ArrayList<String>();
			Pages =(ArrayList<String>)(session.getAttribute("pages"));
			String url = req.getRequestURL().toString();
			/*use get paramtere*/ 
			String page_requested = url.substring(url.length()-6, url.length()-1);
			
				if (Pages.contains(page_requested)) 
					req.getRequestDispatcher("/"+page_requested).forward(req,res);
				else
				    req.getRequestDispatcher("/error").forward(req,res);
				
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
