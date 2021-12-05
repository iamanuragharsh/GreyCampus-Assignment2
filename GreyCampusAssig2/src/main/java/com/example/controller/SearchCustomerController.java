package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@Controller
@RequestMapping(path = "/search")
public class SearchCustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public String welcome() {
		return "search.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView fetchuser(Customer customer, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("search.jsp");
			return modelAndView;
		}
		List<Customer> list = customerService.fetchuser(customer);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("searchsuccessful.jsp");
		modelAndView.addObject("cust", list);
		return modelAndView;
	}

}
