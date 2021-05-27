package com.nile.springrestcrm.controller;

import com.nile.springrestcrm.exception.CustomerNotFoundException;
import com.nile.springrestcrm.model.Customer;
import com.nile.springrestcrm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomerlist();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable int id){
        Customer customer = customerService.getCustomer(id);
        if(customer == null){
            throw new CustomerNotFoundException("Customer Not Found - " + id);
        }
        return customer ;
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        customer.setId(0);
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/customer/{id}")
    public int deleteCustomer(@PathVariable int id){
        Customer customer = customerService.getCustomer(id);
        if(customer == null){
            throw new CustomerNotFoundException("Customer not fount");
        }
        return customerService.deleteCustomer(id);
    }
}
