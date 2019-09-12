package edu.deborupa.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller


public class StudentController {
	
	@RequestMapping(value="/student" , method = RequestMethod.GET)
	public ModelAndView student()
	{
		return new ModelAndView("student","command",new Student());
	}
	
	@RequestMapping(value="/addStudent" , method= RequestMethod.POST )
	public String addStudent(Student student, ModelMap model)
	{
		
		model.addAttribute("name", student.getname());
		model.addAttribute("age", student.getage());
		model.addAttribute("id", student.getid());
		
		return "result";
	}
	
	
	
}
