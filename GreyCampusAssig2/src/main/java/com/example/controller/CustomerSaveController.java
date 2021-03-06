package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@Controller
@RequestMapping(path = "/save")
public class CustomerSaveController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public String welcome() {
		return "save.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String display(Customer customer) {
		customerService.save(customer);
		return "savesuccessful.jsp";
	}

}
