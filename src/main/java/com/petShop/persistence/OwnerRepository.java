//package com.petShop.persistence;
//
//import com.petShop.persistence.crud.OwnerCrudRepository;
//import com.petShop.persistence.entity.Owner;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class OwnerRepository {
//    private OwnerCrudRepository ownerCrudRepository;
//
//    public List<Owner> getOwners() {
//        return (List<Owner>) ownerCrudRepository.findAll();
//    }
//
//    public List<Owner> getByLastName(String lastName) {
//        return ownerCrudRepository.findByLastName(lastName);
//    }
//
//    public List<Owner> getByEmail(String email) {
//        return ownerCrudRepository.findByEmail(email);
//    }
//
//    public List<Owner> getByPhone(String phone) {
//        return ownerCrudRepository.findByPhone(phone);
//    }
//
//    public List<Owner> getByCity(String city) {
//        return ownerCrudRepository.findByCityOrderByLastNameAsc(city);
//    }
//
//    // Native Queries
//    public List<Owner> findOwnersByCity(String city) {
//        return ownerCrudRepository.findOwnersByCity(city);
//    }
//
//    public List<Owner> findOwnersWithEmailLike(String email) {
//        return ownerCrudRepository.findOwnersWithEmailLike(email);
//    }
//
//    public List<Owner> findOwnersByLastName(String lastName) {
//        return ownerCrudRepository.findOwnersByLastName(lastName);
//    }
//
//    public List<Owner> findOwnersByPhone(String phone) {
//        return ownerCrudRepository.findOwnersByPhone(phone);
//    }
//
//    public void save(Owner owner){
//        ownerCrudRepository.save(owner);
//    }
//
//    public void delete(int id){
//        ownerCrudRepository.deleteById( id);
//    }
//
//    public boolean existsOwner(int id) {
//        return ownerCrudRepository.existsById(id);
//    }
//
//    public long countAll(){
//        return ownerCrudRepository.count();
//    }
//}
