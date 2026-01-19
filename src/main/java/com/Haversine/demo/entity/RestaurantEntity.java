package com.Haversine.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "RESTAURENT")
public class RestaurantEntity {
    @Id
    @Column(name="RES_ID")
    private Integer resID;

    @Column(name = "RES_NAME")
    private String resName;

    @Column(name = "LON")
    private Double lon;

    @Column(name = "LAT")
    private Double lat;

    @Column(name = "OPEN")
    private Integer open;

    @Column(name = "RATING")
    private Double rating;
}
