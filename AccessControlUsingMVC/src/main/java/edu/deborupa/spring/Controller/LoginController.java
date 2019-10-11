package edu.deborupa.spring.Controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.deborupa.spring.Bean.LoginBean;


@Controller

public class LoginController {
	
	@RequestMapping(value= {"/","/login"} , method = RequestMethod.GET)
	public String login()
	{
		return "Loginpage";
	}
	
	@RequestMapping(value="/userAuthentication" , method = RequestMethod.POST)
	public String authenticateUser(HttpServletRequest request,HttpServletResponse response, HttpSession session)
	{
		/* Accept the username and password from request, create a bean obj and set the value to it. 
		 * Send it to some validation . */
		LoginBean obj = new LoginBean();
		
		/*Assuming following set of data is valid */
		String username="deborupa";
		obj.setusername("deborupa");
		obj.setpassword("123");
		
		/* get the page list from database first*/
		ArrayList<String> pages = new ArrayList<String>();
		pages.add("PAGE1");
		pages.add("PAGE2");
		obj.setpagelist(pages);
		/* call this only if authentication has been true. Else return the error page name. */
		addUserToSession(obj,session);
		return "welcomepage";
	}
	
	private void addUserToSession(LoginBean obj, HttpSession session)
	{
		/* setting session value */
		session.setAttribute("username", obj.getusername());
		session.setAttribute("pages", obj.getpages());
	}
	
	@RequestMapping(value="/PAGE1" , method = RequestMethod.GET)
	public String gotoPAGE1()
	{
		return "links/PAGE1";
	}
	@RequestMapping(value="/PAGE2" , method = RequestMethod.GET)
	public String gotoPAGE2()
	{
		return "links/PAGE2";
	}
	@RequestMapping(value="/PAGE3" , method = RequestMethod.GET)
	public String gotoPAGE3()
	{
		return "links/PAGE3";
	}
	
	@RequestMapping(value="/welcomepage" , method = RequestMethod.GET)
	public String gotoMenuPage()
	{
		return "welcomepage";
	}
	
	@RequestMapping(value="/error" , method = RequestMethod.GET)
	public String gotoError()
	{
		return "error";
	}
	
	
}
