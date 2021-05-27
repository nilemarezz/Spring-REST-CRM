package com.nile.springrestcrm.dao;

import com.nile.springrestcrm.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        List<Customer> customerList = session.createQuery("from Customer ").getResultList();
        return customerList;
    }

    @Override
    public Customer getCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class , id);
        return customer;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        try {
            System.out.println(customer + "======");
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(customer);
        }catch(Exception e){
            System.out.println(e);
        }
        return customer;
    }

    @Override
    public int deleteCustomer(int id) {
        System.out.println(id);
        Session session = sessionFactory.getCurrentSession();
        Query theQuery =
                session.createQuery("delete from Customer where id=:customerId");
        theQuery.setParameter("customerId", id);

        theQuery.executeUpdate();
        return id;
    }
}
