package com.Haversine.demo.Repository;


import com.Haversine.demo.entity.NearestRestaurantWithDistance;
import com.Haversine.demo.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity,Integer> {
    @Query(value = "SELECT * FROM RESTAURENT WHERE RESTAURENT.RATING>=:rating",nativeQuery = true)
    List<RestaurantEntity> findByRating(@Param("rating") Double rating);

    @Query(value = """
    SELECT r.RES_NAME,r.RES_ID,
    (6371 * ACOS(
        COS(RADIANS(:lat)) * COS(RADIANS(r.LAT)) *
        COS(RADIANS(r.LON) - RADIANS(:lon)) +
        SIN(RADIANS(:lat)) * SIN(RADIANS(r.LAT))
      )) as DISTANCE FROM RESTAURENT r
        ORDER BY DISTANCE 
    """,
            nativeQuery = true)
    List<NearestRestaurantWithDistance> findNearestRestaurant(
            @Param("lat") Double lat,
            @Param("lon") Double lon
    );

}
