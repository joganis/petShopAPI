//package com.petShop.persistence.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.List;
//
//@Data
//@Entity
//@Table (name = "appointment")
//public class Appointment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_appointment")
//    private Long idAppointment;
//
//    private LocalDate date;
//
//    private LocalTime time;
//
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "pet_id")
//    private Pet pet;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "veterinarian_id")
//    private Veterinarian veterinarian;
//
//    @OneToOne(mappedBy = "appointment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Invoice invoice;
//
//
//    private Double price;
//
//    private String notes;
//
//}
