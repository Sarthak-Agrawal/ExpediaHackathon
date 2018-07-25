package com.expedia.www.hackathon.backpackersPool;

import com.expedia.www.hackathon.backpackersPool.models.Customer;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}