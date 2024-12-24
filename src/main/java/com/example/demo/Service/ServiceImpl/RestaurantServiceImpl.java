package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Contact;
import com.example.demo.Model.Restaurant;
import com.example.demo.Repository.RestaurantRepo;
import com.example.demo.Service.RestaurentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RestaurantServiceImpl implements RestaurentService {

    private final RestaurantRepo restaurantRepo;

    public RestaurantServiceImpl(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    @Override
    @Transactional
    public Restaurant saveRestaurant(Restaurant restaurant) {

        System.out.println(restaurant);
        restaurant.getContacts().forEach(contact -> contact.setRestaurant(restaurant));
        return restaurantRepo.save(restaurant);
    }
}
