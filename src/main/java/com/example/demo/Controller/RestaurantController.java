package com.example.demo.Controller;

import com.example.demo.Model.Restaurant;
import com.example.demo.Service.RestaurentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurentService restaurentService;

    public RestaurantController(RestaurentService restaurentService) {
        this.restaurentService = restaurentService;
    }

    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {

        System.out.println(restaurant);
        Restaurant savedRestaurant = restaurentService.saveRestaurant(restaurant);
//        return ResponseEntity.created(URI.create("/api/restaurants/" + savedRestaurant.getId()))
//                .body(savedRestaurant);
        return null;
    }

}
