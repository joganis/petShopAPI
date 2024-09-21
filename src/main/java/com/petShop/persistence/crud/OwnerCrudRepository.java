//package com.petShop.persistence.crud;
//
//import com.petShop.persistence.entity.Owner;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.List;
//
//public interface OwnerCrudRepository extends CrudRepository<Owner, Integer> {
//
//
//    // Query Methods
//
//    List<Owner> findByLastName(String lastName);
//
//    List<Owner> findByEmail(String email);
//
//    List<Owner> findByPhone(String phone);
//
//    List<Owner> findByCityOrderByLastNameAsc(String city);
//
//    // Native Queries
//    @Query(value = "SELECT * FROM owners WHERE city = ?1", nativeQuery = true)
//    List<Owner> findOwnersByCity(String city);
//
//    @Query(value = "SELECT * FROM owners WHERE email LIKE %?1%", nativeQuery = true)
//    List<Owner> findOwnersWithEmailLike(String email);
//
//    @Query(value = "SELECT * FROM owners WHERE last_name = ?1", nativeQuery = true)
//    List<Owner> findOwnersByLastName(String lastName);
//
//    @Query(value = "SELECT * FROM owners WHERE phone = ?1", nativeQuery = true)
//    List<Owner> findOwnersByPhone(String phone);
//}
