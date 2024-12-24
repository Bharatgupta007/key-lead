package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Entity
@Data
@ToString
//@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;
    private String phone;
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

}