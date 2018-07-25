package com.expedia.www.hackathon.backpackersPool.repositories;

import com.expedia.www.hackathon.backpackersPool.models.Trip;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TripRepository extends CrudRepository<Trip, Long> {

}