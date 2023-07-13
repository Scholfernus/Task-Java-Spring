package com.example.service;

import com.example.dao.CustomerDao;
import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private EmailSender emailSender;

    private CustomerDao customerDao = new CustomerDao();

    public void addCustomer(String name, String lastName, String email) {
        Customer customer = new Customer(name, lastName, email);
        customerDao.createCustomer(customer);
        emailSender.sendEmail(email);
    }

}
