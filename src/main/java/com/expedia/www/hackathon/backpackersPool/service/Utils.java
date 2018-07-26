package com.expedia.www.hackathon.backpackersPool.service;

import com.expedia.www.hackathon.backpackersPool.models.Customer;
import com.expedia.www.hackathon.backpackersPool.models.Trip;
import com.expedia.www.hackathon.backpackersPool.repositories.CustomerRepository;
import com.expedia.www.hackathon.backpackersPool.repositories.TripRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class Utils {

    public List<String> groupTrip(Integer tid, TripRepository tripRepository, CustomerRepository customerRepository){

        List<Trip> finalGroup = finalGroups(tid, tripRepository);
//        List<Customer> cotravellers = new ArrayList<>();
        List<String> pointOfContacts = new ArrayList<>();
        for(Trip temp:finalGroup){
            Integer tuid = temp.getTuid();
            Customer customer = customerRepository.findById(tuid).get();
//            cotravellers.add(customer);
            if(fbLinkPresent()){
                pointOfContacts.add("Facebook : " + customer.getFbID());
            }else if(googliLinkPresent()){
                pointOfContacts.add("Google+ : " + customer.getGoogleID());
            }else if(phoneNumberPresent()){
                pointOfContacts.add("Phone or Whatsapp : " + customer.getPhone());
            }else{
                pointOfContacts.add("Email : " + customer.getEmailID());
            }

        }

    }

    private List<Trip> finalGroups(Integer tid, TripRepository tripRepository){
            Optional<Trip> existTrip = tripRepository.findById(tid);
            if (existTrip.isPresent()){
                Trip trip = existTrip.get();
                String currentLocation = trip.getLocation();
                Date currentInitDate = trip.getInitialDate();
                Date currentFinalDate = trip.getFinalDate();
                List<Trip> tripsSameLoc = tripRepository.findByLocation(currentLocation);
                List<Trip> group = new ArrayList<>();
                for(Trip temp:tripsSameLoc){
                    if(currentInitDate.before(temp.getFinalDate()) && currentFinalDate.after(temp.getInitialDate())){
                        group.add(temp);
                    }
                }


                //Now Filters. Till now a tentative group has been made.
                List<Trip> finalGroup = filterGroups(group);
                return finalGroup;
            }
    }

}
