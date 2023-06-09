package com.stl.aritra.telecomapp.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stl.aritra.telecomapp.model.Customer;
import com.stl.aritra.telecomapp.repository.CustomerRepository;
import com.stl.aritra.telecomapp.service.CustomerService;



@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer saveCustomer(Customer customer) {
		logger.info("Customer Service Implementation : savePolicy() method");
		return repo.save(customer);
	}

	@Override
	public Customer saveEmployee(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
}
