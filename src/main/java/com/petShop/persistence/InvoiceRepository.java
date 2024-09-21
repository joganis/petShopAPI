//package com.petShop.persistence;
//
//import com.petShop.persistence.crud.InvoiceCrudRepository;
//import com.petShop.persistence.entity.Invoice;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//public class InvoiceRepository {
//    private InvoiceCrudRepository invoiceCrudRepository;
//
//
//
//    // Query Methods
//    public List<Invoice> getByStatus(Boolean status) {
//        return invoiceCrudRepository.findByStatus(status);
//    }
//
//    public List<Invoice> getByAmountGreaterThanEqual(Double amount) {
//        return invoiceCrudRepository.findByAmountGreaterThanEqual(amount);
//    }
//
//    public List<Invoice> getByDateOrdered(String date) {
//        return invoiceCrudRepository.findByDateOrderByDateDesc(date);
//    }
//
//    public List<Invoice> getByCustomerId(Long customerId) {
//        return invoiceCrudRepository.findByCustomerId(customerId);
//    }
//
//    // Native Queries
//    public List<Invoice> findInvoicesByStatus(Boolean status) {
//        return invoiceCrudRepository.findInvoicesByStatus(status);
//    }
//
//    public List<Invoice> findInvoicesWithAmountGreaterThanOrEqual(Double amount) {
//        return invoiceCrudRepository.findInvoicesWithAmountGreaterThanOrEqual(amount);
//    }
//
//    public List<Invoice> findInvoicesByCustomerId(Long customerId) {
//        return invoiceCrudRepository.findInvoicesByCustomerId(customerId);
//    }
//
//    public List<Invoice> findInvoicesByDate(String date) {
//        return invoiceCrudRepository.findInvoicesByDate(date);
//    }
//
//    // CRUD Operations
//    public Invoice saveInvoice(Invoice invoice) {
//        return invoiceCrudRepository.save(invoice);
//    }
//
//    public void deleteInvoice(Integer invoiceId) {
//        invoiceCrudRepository.deleteById(invoiceId);
//    }
//
//    public boolean existsInvoice(Integer invoiceId) {
//        return invoiceCrudRepository.existsById(invoiceId);
//    }
//
//    public long countAll() {
//        return invoiceCrudRepository.count();
//    }
//}
