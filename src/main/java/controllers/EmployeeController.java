package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.EmployeeService;

@Controller
public class EmployeeController {
//display list of employees
	@Autowired
	private EmployeeService  employeeService;
	
	//@GetMapping or Requstmapping
	@RequestMapping("/")
	public String veiwHomePage(Model model) {
		model.addAttribute("listEmployees",employeeService.getAllEmployeeS());
		return "index";
	}
}
