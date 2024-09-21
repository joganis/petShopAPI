//package com.petShop.persistence.crud;
//
//import com.petShop.persistence.entity.Invoice;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.List;
//
//public interface InvoiceCrudRepository extends CrudRepository<Invoice, Integer> {
//    // Query Methods
//    List<Invoice> findByStatus(Boolean status);
//
//    List<Invoice> findByAmountGreaterThanEqual(Double amount);
//
//    List<Invoice> findByDateOrderByDateDesc(String date);
//
//    List<Invoice> findByCustomerId(Long customerId);
//
//    // Native Queries
//    @Query(value = "SELECT * FROM invoices WHERE status = ?1", nativeQuery = true)
//    List<Invoice> findInvoicesByStatus(Boolean status);
//
//    @Query(value = "SELECT * FROM invoices WHERE amount >= ?1", nativeQuery = true)
//    List<Invoice> findInvoicesWithAmountGreaterThanOrEqual(Double amount);
//
//    @Query(value = "SELECT * FROM invoices WHERE customer_id = ?1", nativeQuery = true)
//    List<Invoice> findInvoicesByCustomerId(Long customerId);
//
//    @Query(value = "SELECT * FROM invoices WHERE date = ?1", nativeQuery = true)
//    List<Invoice> findInvoicesByDate(String date);
//
//}
