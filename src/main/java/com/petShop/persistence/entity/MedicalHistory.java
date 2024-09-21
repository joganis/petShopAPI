//package com.petShop.persistence.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//@Data
//@Entity
//@Table(name = "medicalhistory")
//public class MedicalHistory {
//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    @Column(name = "id_history")
//    private Long  idHistory;
//
//    @Column(name = "visit_day")
//    private LocalDate visitDay;
//
//    private String diagnosis;
//
//    private String treatments ;
//
//    private String notes;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "veterinarian_id")
//    private Veterinarian veterinarian;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "pet_id")
//    private Pet pet;
//}
