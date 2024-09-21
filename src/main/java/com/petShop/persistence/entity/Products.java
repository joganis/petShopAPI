//package com.petShop.persistence.entity;
//
//import jakarta.persistence.*;
//        import lombok.Data;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//@Table (name = "products")
//
//public class Products {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column (name = "id_products")
//    private  Long idProducts;
//
//    @Column(name = "name_products")
//    private String nameProducts;
//
//    @Column(name = "price_products")
//    private Double priceProducts;
//    @Column(name= "description_products")
//    private String descriptionProducts;
//
//    @Column(name = "stock_products")
//    private Integer stockProducts;
//
//    @ManyToMany(mappedBy = "products")
//    private List<Invoice> invoices = new ArrayList<>();
//
//    @ManyToMany
//    @JoinTable(
//            name = "ProductSupplier",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "supplier_id")
//    )
//    private List<Suppliers> suppliers = new ArrayList<>();
//
//}
