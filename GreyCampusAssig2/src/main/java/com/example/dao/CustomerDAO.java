package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;
import com.example.repo.CustomerRepo;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerRepo customerRepo;

	public void save(Customer customer) {
		customerRepo.save(customer);
	}

	public void update(Customer customer) {
		customerRepo.save(customer);
	}

	public void delete(int cid) {
		customerRepo.deleteById(cid);
	}

	public List<Customer> fetchbycid(Customer customer) {
		Customer customer2 = customerRepo.findById(customer.getCid()).get();
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(customer2);
		return list;
	}

	public List<Customer> fetchbyname(Customer customer) {
		List<Customer> list = customerRepo.findByName(customer.getName());
		return list;
	}

	public List<Customer> fetchall() {
		Iterable<Customer> userlist = customerRepo.findAll();
		return (List<Customer>) userlist;
	}

}
