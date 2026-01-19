package com.Haversine.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NearestRestaurantWithDistance {
    private String name;
    private Integer id;
    private double distance;
}
