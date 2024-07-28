package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepo;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/req")
	public String reg() {
		return "reg";
	}
	
	@RequestMapping(value="/reg",method= RequestMethod.POST)
	public String EmployeeRegister(Employee emp,Model m) {
		repo.save(emp);
		return "result";
	}
	
	@RequestMapping(value="/view",method= RequestMethod.GET)
	public String viewEmployee(Model m) {
		m.addAttribute("emps",repo.findAll());
		return "view";
	}
	@RequestMapping(value="/delete/{ename}",method=RequestMethod.GET)
	public String deleteEmp(@PathVariable String ename) {
		repo.deleteById(ename);
		return "redirect:/view";
	}
	
	@RequestMapping(value="/edit/{ename}")
	public String update(@PathVariable String ename,Model m) {
		Employee emp=repo.findById(ename).get();
		m.addAttribute("command", emp);
		return "edit";
	}
	
	@RequestMapping(value="/edit",method = RequestMethod.GET)    
    public String editsave(@RequestParam String ename,
    		@RequestParam String desg,
    		@RequestParam Double salary,
    		@RequestParam String email,
    		@RequestParam Long phno,
    		@RequestParam String qualification,
    		@RequestParam String manager,
    		@RequestParam String gender,Employee emp,Model model){    
    		repo.save(emp);    
    		return "redirect:/view";    
    } 
	
	
	
}
