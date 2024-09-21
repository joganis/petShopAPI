//package com.petShop.persistence.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.ArrayList;
//import java.util.List;
//@Data
//@Entity
//@Table(name = "suppliers")
//public class Suppliers {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_suppliers")
//    private Long idSuppliers;
//
//    @Column (name = "supplier_name")
//    private String supplierName;
//
//    @Column(name = "supplier_contact")
//    private String supplierContac;
//
//    @Column(name = "supplier_address")
//    private String supplierAddress;
//
//    @ManyToMany(mappedBy = "suppliers")
//    private List<Products> products = new ArrayList<>();
//
//}
