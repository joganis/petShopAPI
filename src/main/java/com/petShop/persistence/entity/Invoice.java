//package com.petShop.persistence.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//@Table(name = "invoice")
//public class Invoice {
//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
//    @Column(name = "id_invoice")
//    private Long idInvoice;
//
//    private Double amount;
//
//    private  Boolean status;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "appointment_id")
//    private Appointment appointment;
//
//    @ManyToMany
//    @JoinTable(
//            name = "InvoiceProduct",
//            joinColumns = @JoinColumn(name = "invoice_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id")
//    )
//    private List<Products> products = new ArrayList<>();
//}
