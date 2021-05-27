package com.nile.springrestcrm.service;

import com.nile.springrestcrm.dao.CustomerDAO;
import com.nile.springrestcrm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("customerService")
public class CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Transactional
    public List<Customer> getCustomerlist() {
        return customerDAO.getCustomers();
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerDAO.getCustomer(id);
    }

    @Transactional
    public Customer saveCustomer(Customer customer) {
        return customerDAO.saveCustomer(customer);
    }

    @Transactional
    public int deleteCustomer(int id) {
        return customerDAO.deleteCustomer(id);
    }


}
