package com.expedia.www.hackathon.backpackersPool.repositories;

import com.expedia.www.hackathon.backpackersPool.models.Customer;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}