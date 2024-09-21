//package com.petShop.persistence;
//
//import com.petShop.persistence.crud.MedicalHistoryCrudRepository;
//import com.petShop.persistence.entity.MedicalHistory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//
//@Repository
//public class MedicalHistoryRepository {
//
//        private MedicalHistoryCrudRepository medicalHistoryCrudRepository;
//
//
//
//        // Query Methods
//        public List<MedicalHistory> getByPetId(Long petId) {
//            return medicalHistoryCrudRepository.findByPetId(petId);
//        }
//
//        public List<MedicalHistory> getByVeterinarianId(Long veterinarianId) {
//            return medicalHistoryCrudRepository.findByVeterinarianId(veterinarianId);
//        }
//
//        public List<MedicalHistory> getByDiagnosisContaining(String diagnosis) {
//            return medicalHistoryCrudRepository.findByDiagnosisContaining(diagnosis);
//        }
//
//        public List<MedicalHistory> getByVisitDateOrdered(String visitDate) {
//            return medicalHistoryCrudRepository.findByVisitDateOrderByVisitDateDesc(visitDate);
//        }
//
//        // Native Queries
//        public List<MedicalHistory> findMedicalHistoriesByPetId(Long petId) {
//            return medicalHistoryCrudRepository.findMedicalHistoriesByPetId(petId);
//        }
//
//        public List<MedicalHistory> findMedicalHistoriesWithDiagnosisLike(String diagnosis) {
//            return medicalHistoryCrudRepository.findMedicalHistoriesWithDiagnosisLike(diagnosis);
//        }
//
//        public List<MedicalHistory> findMedicalHistoriesByVeterinarianId(Long veterinarianId) {
//            return medicalHistoryCrudRepository.findMedicalHistoriesByVeterinarianId(veterinarianId);
//        }
//
//        public List<MedicalHistory> findMedicalHistoriesByVisitDate(String visitDate) {
//            return medicalHistoryCrudRepository.findMedicalHistoriesByVisitDate(visitDate);
//        }
//
//        // CRUD Operations
//        public MedicalHistory saveMedicalHistory(MedicalHistory medicalHistory) {
//            return medicalHistoryCrudRepository.save(medicalHistory);
//        }
//
//        public void deleteMedicalHistory(Long id) {
//            medicalHistoryCrudRepository.deleteById(id);
//        }
//
//        public boolean existsMedicalHistory(Long id) {
//            return medicalHistoryCrudRepository.existsById(id);
//        }
//
//        public long countAll() {
//            return medicalHistoryCrudRepository.count();
//        }
//}

