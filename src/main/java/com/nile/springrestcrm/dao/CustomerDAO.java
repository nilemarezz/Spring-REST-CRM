package com.nile.springrestcrm.dao;

import com.nile.springrestcrm.model.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
    public Customer getCustomer(int id);
    public Customer saveCustomer(Customer customer);
    public int deleteCustomer(int id);
}
