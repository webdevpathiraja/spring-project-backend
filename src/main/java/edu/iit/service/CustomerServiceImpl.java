package edu.iit.service;

import edu.iit.dto.Customer;
import edu.iit.entity.CustomerEntity;
import edu.iit.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;


    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteCustomerById(Integer id) {

    }

    @Override
    public Customer searchCustomerById(Integer id) {
        return null;
    }

    @Override
    public void updateCustomerById(Customer customer) {

    }
}
