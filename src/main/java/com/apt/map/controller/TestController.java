package com.apt.map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.apt.map.domain.Customer;
import com.apt.map.repository.CustomerRepository;

@RestController
public class TestController {

	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/")
	public ModelAndView mainView(Model model) {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/map")
	public ModelAndView mapView() {
		List<Customer> customerList = customerRepository.findAll();
		return new ModelAndView("map/map","list",customerList);
	}

	@RequestMapping("/customer")
	public List<Customer> findCustomerList() {
		List<Customer> customerList = customerRepository.findAll();
		return customerList;
	}

	@RequestMapping("/customer/{id}")
	public String findCustomer(@PathVariable String id) {
		Customer customer = customerRepository.findOne(id);
		return customer.toString();
	}

}
