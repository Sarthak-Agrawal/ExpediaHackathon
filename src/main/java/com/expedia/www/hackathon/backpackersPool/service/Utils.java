package com.expedia.www.hackathon.backpackersPool.service;

import com.expedia.www.hackathon.backpackersPool.models.Customer;
import com.expedia.www.hackathon.backpackersPool.models.Trip;
import com.expedia.www.hackathon.backpackersPool.repositories.CustomerRepository;
import com.expedia.www.hackathon.backpackersPool.repositories.TripRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Utils {

    public List<String> groupTrip(Integer tid, TripRepository tripRepository, CustomerRepository customerRepository) {

        List<Trip> finalGroup = finalGroups(tid, tripRepository);
//        List<Customer> cotravellers = new ArrayList<>();
        List<String> pointOfContacts = new ArrayList<>();
        for (Trip temp : finalGroup) {
            Integer tuid = temp.getTuid();
            Customer customer = customerRepository.findById(tuid).get();
//            cotravellers.add(customer);
            if (customer.getFbID()!=null) {
                pointOfContacts.add("Facebook : " + customer.getFbID());
            } else if (customer.getGoogleID()!=null) {
                pointOfContacts.add("Google+ : " + customer.getGoogleID());
            } else if (customer.getPhone()!=null) {
                pointOfContacts.add("Phone or Whatsapp : " + customer.getPhone());
            } else {
                pointOfContacts.add("Email : " + customer.getEmailID());
            }

        }

        return pointOfContacts;
    }



    private List<Trip> finalGroups(Integer tid, TripRepository tripRepository){
            Optional<Trip> existTrip = tripRepository.findById(tid);
            if (existTrip.isPresent()){
                Trip trip = existTrip.get();
                String currentLocation = trip.getLocation();
                Date currentInitDate = trip.getInitialDate();
                Date currentFinalDate = trip.getFinalDate();
                List<Trip> tripsSameLoc = tripRepository.findByLocation(currentLocation);
                ArrayList<Trip> group = new ArrayList<>();
                for(Trip temp:tripsSameLoc){
                    if(currentInitDate.before(temp.getFinalDate()) && currentFinalDate.after(temp.getInitialDate())){
                        group.add(temp);
                    }
                }


                //Now Filters. Till now a tentative group has been made.
                List<Trip> finalGroup = filterGroups(trip,group);
                return finalGroup;
            }

            return null;

    }

    private List<Trip> filterGroups(Trip user_trip, ArrayList<Trip> group) {

        Dictionary<String, Boolean> user_dict = new Hashtable<String, Boolean>();
        // put() method
        user_dict.put("trekking", user_trip.isTrekking());
        user_dict.put("religious",user_trip.isReligious() );
        user_dict.put("localinteraction",user_trip.isLocalInteraction() );
        user_dict.put("sightseeing", user_trip.isSightseeing());
        user_dict.put("smoking", user_trip.isSmoking());
        user_dict.put("sports", user_trip.isSports());


        int no_of_ones=0;
        for(int i=0;i<user_dict.size();i++)
        {
            if(user_dict.get(i).toString()=="1")
                no_of_ones++;
        }

        HashMap<Trip, String> group_interest = new HashMap<Trip, String>();
        for (int i=0;i<group.size();i++) {
            int count_match = 0;
            Trip inst = group.get(i);
            if ((inst.isSmoking() == Boolean.parseBoolean(user_dict.get("smoking").toString())) && (inst.getAge()==user_trip.getAge()) && (inst.getLanguage()==user_trip.getLanguage())) {
                if (Boolean.parseBoolean(user_dict.get("trekking").toString()) == inst.isTrekking())
                    count_match++;
                if (Boolean.parseBoolean(user_dict.get("religious").toString()) == inst.isReligious())
                    count_match++;
                if (Boolean.parseBoolean(user_dict.get("sports").toString()) == inst.isSports())
                    count_match++;
                if (Boolean.parseBoolean(user_dict.get("localinteraction").toString()) == inst.isLocalInteraction())
                    count_match++;
                if (Boolean.parseBoolean(user_dict.get("sightseeing").toString()) == inst.isSightseeing())
                    count_match++;
                if (count_match == no_of_ones - 2) {
                    group_interest.put(inst, String.valueOf(count_match));
                }

            }

        }

        int cnt=0;
        List<Trip> flist=new ArrayList<>();
        for(Map.Entry m:group_interest.entrySet()){
            if(m.getValue()=="5")
            {
                flist.add((Trip)m.getKey());
                cnt++;
                if(cnt>9)
                    break;
            }
            if(m.getValue()=="4")
            {
                flist.add((Trip)m.getKey());
                cnt++;
                if(cnt>9)
                    break;
            }
            if(m.getValue()=="3")
            {
                flist.add((Trip)m.getKey());
                cnt++;
                if(cnt>9)
                    break;
            }
            if(m.getValue()=="2")
            {
                flist.add((Trip)m.getKey());
                cnt++;
                if(cnt>9)
                    break;
            }
            if(m.getValue()=="1")
            {
                flist.add((Trip)m.getKey());
                cnt++;
                if(cnt>9)
                    break;
            }
        }



        return flist;
    }

}
