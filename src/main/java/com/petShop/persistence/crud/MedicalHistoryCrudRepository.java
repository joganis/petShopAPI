//package com.petShop.persistence.crud;
//
//import com.petShop.persistence.entity.MedicalHistory;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.List;
//
//public interface MedicalHistoryCrudRepository extends CrudRepository<MedicalHistory, Long> {
//
//    // Query Methods
//    List<MedicalHistory> findByPetId(Long petId);
//
//    List<MedicalHistory> findByVeterinarianId(Long veterinarianId);
//
//    List<MedicalHistory> findByDiagnosisContaining(String diagnosis);
//
//    List<MedicalHistory> findByVisitDateOrderByVisitDateDesc(String visitDate);
//
//    // Native Queries
//    @Query(value = "SELECT * FROM medical_history WHERE pet_id = ?1", nativeQuery = true)
//    List<MedicalHistory> findMedicalHistoriesByPetId(Long petId);
//
//    @Query(value = "SELECT * FROM medical_history WHERE diagnosis LIKE %?1%", nativeQuery = true)
//    List<MedicalHistory> findMedicalHistoriesWithDiagnosisLike(String diagnosis);
//
//    @Query(value = "SELECT * FROM medical_history WHERE veterinarian_id = ?1", nativeQuery = true)
//    List<MedicalHistory> findMedicalHistoriesByVeterinarianId(Long veterinarianId);
//
//    @Query(value = "SELECT * FROM medical_history WHERE visit_date = ?1", nativeQuery = true)
//    List<MedicalHistory> findMedicalHistoriesByVisitDate(String visitDate);
//}
