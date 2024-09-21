//package com.petShop.persistence.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//@Table ( name = "veterinarian")
//public class Veterinarian {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Long id;
//
//    private String name;
//
//    private String specialization;
//
//    @Column (name = "phone_number")
//    private String phoneNumber;
//
//    private String email;
//
//    @ManyToMany(mappedBy = "veterinarians")
//    private List<Pet> pets = new ArrayList<>();
//
//}
