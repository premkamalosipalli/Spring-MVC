package com.spring.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class HomeController {
	
	@RequestMapping("/showForm")
	/*public String showForm() {
		return "main-menu";
	}*/
	
	public String showFormForm(Model model) {
		Student theStudent=new Student();
		model.addAttribute("student",theStudent);
		return "main-menu";
	}
	
	@RequestMapping("/processForm")
	/*public String processForm(HttpServletRequest request,Model model) {
		String data=request.getParameter("studentName").toUpperCase();
		String result="The upper casse data:"+data;
		model.addAttribute("message", result);
		return "studentData";
	}*/
	
	/*public String processForm(@RequestParam("studentName") String theName,Model model) {
		theName=theName.toUpperCase();
		model.addAttribute("studentName", theName);
		return "studentData";
	}*/
	
	public String processForm(@Valid @ModelAttribute("student") Student theStudent,BindingResult  theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "main-menu";
		}
		return "studentData";
	}
	
	//remove white spaces  which are considered as values when we are validating a field
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}

}
