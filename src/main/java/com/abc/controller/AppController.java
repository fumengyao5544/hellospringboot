package com.abc.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dao.EmployeeDao;
import com.abc.entity.Employees;

@RestController
@RequestMapping("/hello")
public class AppController {
	@Autowired
	private EmployeeDao EmployeeDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello(){
		return "hello spring boot";
	}
	@RequestMapping(value="{input}",method=RequestMethod.GET)
	public String helloByInput(@PathVariable("input")String inputString){
		return "hello "+inputString;
	}
	@RequestMapping(value="employee",method=RequestMethod.GET)
	public Collection<Employees> getEmployees(){
		return EmployeeDao.getEmployee();
	}
	
}
