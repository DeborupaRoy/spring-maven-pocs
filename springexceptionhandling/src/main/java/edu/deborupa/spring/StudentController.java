package edu.deborupa.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
@RequestMapping(value="/student" , method = RequestMethod.GET)
public ModelAndView student()
{
	return new ModelAndView("student", "command", new Student());
}

@RequestMapping(value="/addStudent" , method = RequestMethod.POST)
@ExceptionHandler({SpringException.class})
public String addStudent(Student student, Model model)
{
	String err="";
	if(student.getName().isBlank()==true)
	{
		err=err+"\n NAME CANNOT BE EMPTY";
		
	}
	else
	{
		model.addAttribute("name",student.getName());
	}
	
	if(student.getAge() < 10 )
	{
		err=err+"\n AGE CANNOT BE LESS THAN 10";
	}
	else
	{
		model.addAttribute("age",student.getAge());
	}
	model.addAttribute("id",student.getId());
	if (err.length() > 0)
		throw new SpringException(err);
	return "result";
}
}
