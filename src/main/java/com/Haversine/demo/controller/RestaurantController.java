package com.Haversine.demo.controller;


import com.Haversine.demo.entity.LocationEntity;
import com.Haversine.demo.entity.NearestRestaurantWithDistance;
import com.Haversine.demo.entity.RestaurantEntity;
import com.Haversine.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/all")
    public List<RestaurantEntity> getAll(){
        return restaurantService.getAll();
    }

    @GetMapping("/ID/{RES_ID}")
    public RestaurantEntity getByID(@PathVariable Integer RES_ID){
        return restaurantService.getRestaurantByID(RES_ID);
    }

    @GetMapping("/rating/{RATING}")
    public List<RestaurantEntity> getByRating(@PathVariable Double RATING){
        return restaurantService.getByRating(RATING);
    }

    @GetMapping("/nearest/")
    public List<NearestRestaurantWithDistance> getNearest(@RequestBody LocationEntity locationEntity){
        return restaurantService.getNearest(locationEntity);
    }

}
