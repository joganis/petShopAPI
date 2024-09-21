//package com.petShop.persistence.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table (name = "productsupplier")
//public class ProductSupplier {
//    @EmbeddedId
//    private ProductSupplierpk id;
//
//    @ManyToOne
//    @MapsId("productId")
//    @JoinColumn(name = "product_id")
//    private Products product;
//
//    @ManyToOne
//    @MapsId("supplierId")
//    @JoinColumn(name = "supplier_id")
//    private Suppliers supplier;
//
//}
