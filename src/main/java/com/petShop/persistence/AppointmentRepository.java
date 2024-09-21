//package com.petShop.persistence;
//
//import com.petShop.persistence.crud.AppointmentCruedRepository;
//import com.petShop.persistence.entity.Appointment;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.List;
//@Repository
//public class AppointmentRepository {
//    private AppointmentCruedRepository appointmentCruedRepository;
//
//
//
//    // Query Methods
//    public List<Appointment> getByDate(LocalDate date) {
//        return appointmentCruedRepository.findByDate(date);
//    }
//
//    public List<Appointment> getByVeterinarianId(Long veterinarianId) {
//        return appointmentCruedRepository.findByVeterinarianId(veterinarianId);
//    }
//
//    public List<Appointment> getByPetId(Long petId) {
//        return appointmentCruedRepository.findByPetId(petId);
//    }
//
//    public List<Appointment> getByDateAfterOrdered(LocalDate date) {
//        return appointmentCruedRepository.findByDateAfterOrderByDateAsc(date);
//    }
//
//    // Native Queries
//    public List<Appointment> findAppointmentsByDate(LocalDate date) {
//        return appointmentCruedRepository.findAppointmentsByDate(date);
//    }
//
//    public List<Appointment> findAppointmentsByPetId(Long petId) {
//        return appointmentCruedRepository.findAppointmentsByPetId(petId);
//    }
//
//    public List<Appointment> findAppointmentsByVeterinarianId(Long veterinarianId) {
//        return appointmentCruedRepository.findAppointmentsByVeterinarianId(veterinarianId);
//    }
//
//    public List<Appointment> findAppointmentsAfterDate(LocalDate date) {
//        return appointmentCruedRepository.findAppointmentsAfterDate(date);
//    }
//
//    // CRUD Operations
//    public Appointment saveAppointment(Appointment appointment) {
//        return appointmentCruedRepository.save(appointment);
//    }
//
//    public void deleteAppointment(Integer appointmentId) {
//        appointmentCruedRepository.deleteById(appointmentId);
//    }
//
//    public boolean existsAppointment(Integer appointmentId) {
//        return appointmentCruedRepository.existsById(appointmentId);
//    }
//
//    public long countAll() {
//        return appointmentCruedRepository.count();
//    }
//}
