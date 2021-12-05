package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	public List<Customer> findByName(String name);

	public List<Customer> findByPhone(Long phone);

	@Query(value = "select * from emp_tbl", nativeQuery = true)
	public List<Customer> fetchAll();

}
