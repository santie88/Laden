package com.example.laden.UnitTest;

import com.example.laden.logic.CustomerLogic;
import com.example.laden.model.Customer;
import com.example.laden.repository.CustomerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerLogicTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerLogic customerLogic;

    @Test
    public void findAll(){
        //GIVEN
        when(customerRepository.findAll()).thenReturn(Collections.emptyList());

        //WHEN
        List<Customer> customers = customerLogic.findAll();

        //THEN
        Assert.assertEquals(customers, Collections.emptyList());
        verify(customerRepository, times(1)).findAll();
    }

    @Test
    public void create(){
        //GIVEN
        Customer customer = new Customer(1,"John");

        when(customerRepository.save(customer)).thenReturn(customer);

        //WHEN
        Customer customerCreated = customerLogic.create(customer);

        //THEN
        Assert.assertEquals(customerCreated, customer);
        verify(customerRepository, times(1)).save(customer);

    }

}
