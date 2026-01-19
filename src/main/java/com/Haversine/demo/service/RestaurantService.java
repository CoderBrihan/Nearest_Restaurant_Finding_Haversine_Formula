package com.Haversine.demo.service;


import com.Haversine.demo.Repository.RestaurantRepository;
import com.Haversine.demo.entity.LocationEntity;
import com.Haversine.demo.entity.NearestRestaurantWithDistance;
import com.Haversine.demo.entity.RestaurantEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;


    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public RestaurantEntity getRestaurantByID(int RES_ID){
        return restaurantRepository.getById(RES_ID);
    }

    public List<RestaurantEntity> getAll(){
        return restaurantRepository.findAll();
    }

    public List<RestaurantEntity> getByRating(Double rating){
        return restaurantRepository.findByRating(rating);
    }

    public List<NearestRestaurantWithDistance> getNearest(LocationEntity locationEntity){
        return restaurantRepository.findNearestRestaurant(locationEntity.getLat(), locationEntity.getLon());
    }
}
