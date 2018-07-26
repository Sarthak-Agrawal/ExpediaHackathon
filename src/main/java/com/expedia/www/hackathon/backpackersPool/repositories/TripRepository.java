package com.expedia.www.hackathon.backpackersPool.repositories;

import com.expedia.www.hackathon.backpackersPool.models.Trip;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface TripRepository extends CrudRepository<Trip, Integer> {

    public List<Trip> findByLocation(String location);
}