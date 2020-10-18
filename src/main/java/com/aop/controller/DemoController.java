package com.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aop.service.DemoService;
import com.app.vo.DemoVo;



@RestController
public class DemoController {

	@Autowired
	DemoService service;
	
	@GetMapping("/details")
	public List<DemoVo>   getDetails() {
		
	List<DemoVo>	detail = service.findAll();
		System.out.println("details are fetching.....");
		return detail;
		
	}
	@GetMapping("/hi")
	public String getHi() {
		return "Hiii";
	}
	
	@GetMapping ("/welcome/{name}")
	public String greet(@PathVariable ("name") String name) {
		return "Hello"+" "+name;
	}
}
