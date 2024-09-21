//package com.petShop.persistence.crud;
//
//import com.petShop.persistence.entity.Appointment;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public interface AppointmentCruedRepository  extends CrudRepository<Appointment, Integer> {
//    // Query Methods
//    List<Appointment> findByDate(LocalDate date);
//
//    List<Appointment> findByVeterinarianId(Long veterinarianId);
//
//    List<Appointment> findByPetId(Long petId);
//
//    List<Appointment> findByDateAfterOrderByDateAsc(LocalDate date);
//
//    // Native Queries
//    @Query(value = "SELECT * FROM appointments WHERE date = ?1", nativeQuery = true)
//    List<Appointment> findAppointmentsByDate(LocalDate date);
//
//    @Query(value = "SELECT * FROM appointments WHERE pet_id = ?1", nativeQuery = true)
//    List<Appointment> findAppointmentsByPetId(Long petId);
//
//    @Query(value = "SELECT * FROM appointments WHERE veterinarian_id = ?1", nativeQuery = true)
//    List<Appointment> findAppointmentsByVeterinarianId(Long veterinarianId);
//
//    @Query(value = "SELECT * FROM appointments WHERE date > ?1", nativeQuery = true)
//    List<Appointment> findAppointmentsAfterDate(LocalDate date);
//}
