package com.example.dao;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    private List<Customer> customerList = new ArrayList<>();

    public void createCustomer(Customer customer){
        customerList.add(customer);
        System.out.println("Customer " + customer + "was added !");
    }

}
