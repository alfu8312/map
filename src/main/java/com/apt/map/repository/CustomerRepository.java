package com.apt.map.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apt.map.domain.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{

}
