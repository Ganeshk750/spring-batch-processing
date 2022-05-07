package com.ganesh.config;

import com.ganesh.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }

    /*Using Some Field Filter */
//    @Override
//    public Customer process(Customer customer) throws Exception {
//        if(customer.getCountry().equals("United States")){
//            return customer;
//        }
//        return null;
//    }
}
