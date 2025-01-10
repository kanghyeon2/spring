package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mapper.EmployeesMapper;
//@RestController 리턴값을 json형식으로 자동 
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeesMapper employeesMapper;
	
	
	@GetMapping("/emp") 
	public String list(Model model){
		model.addAttribute("empList", employeesMapper.findAll());
		return "empList";
	}
	
	@GetMapping("/dept") 
	public String listDept(Model model){
		model.addAttribute("deptList", employeesMapper.findAllDept());
		return "deptList";
	}
	
	@ResponseBody //데이터값 json으로
	@GetMapping("/")
	public String hello() {
		return "hello ~~~";	
	}
}
