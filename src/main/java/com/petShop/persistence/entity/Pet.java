package com.petShop.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table (name = "mascotas")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    private String species;

    private int age;

    private String gender;

    private String breed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

//    @ManyToMany
//    @JoinTable(
//            name = "PetVeterinarian",
//            joinColumns = @JoinColumn(name = "pet_id"),
//            inverseJoinColumns = @JoinColumn(name = "veterinarian_id")
//    )
//    private List<Veterinarian> veterinarians = new ArrayList<>();
//
//    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<MedicalHistory> medicalHistory = new ArrayList<>();

}