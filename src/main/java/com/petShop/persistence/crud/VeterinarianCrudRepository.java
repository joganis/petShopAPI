//package com.petShop.persistence.crud;
//
//import com.petShop.persistence.entity.Veterinarian;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.List;
//
//public interface VeterinarianCrudRepository extends CrudRepository<Veterinarian, Integer> {
//    // Query Methods
//    List<Veterinarian> findBySpecialization(String specialization);
//
//    List<Veterinarian> findByPhoneNumber(String phoneNumber);
//
//    List<Veterinarian> findByEmail(String email);
//
//    List<Veterinarian> findByClinicNameOrderByLastNameAsc(String clinicName);
//
//    // Native Queries
//    @Query(value = "SELECT * FROM veterinarians WHERE specialization = ?1", nativeQuery = true)
//    List<Veterinarian> findVeterinariansBySpecialization(String specialization);
//
//    @Query(value = "SELECT * FROM veterinarians WHERE clinic_name = ?1", nativeQuery = true)
//    List<Veterinarian> findVeterinariansByClinicName(String clinicName);
//
//    @Query(value = "SELECT * FROM veterinarians WHERE email LIKE %?1%", nativeQuery = true)
//    List<Veterinarian> findVeterinariansWithEmailLike(String email);
//
//    @Query(value = "SELECT * FROM veterinarians WHERE phone_number = ?1", nativeQuery = true)
//    List<Veterinarian> findVeterinariansByPhoneNumber(String phoneNumber);
//}
//
