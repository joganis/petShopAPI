//
//
//
//
//
//
//package com.petShop.persistence;
//
//import com.petShop.persistence.crud.PetCrudRepository;
//import com.petShop.persistence.entity.Pet;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public class PetRepository {
//    private PetCrudRepository petCrudRepository;
//
//    // Query methods
//    public List<Pet> getPets() {
//        return (List<Pet>) petCrudRepository.findAll();
//    }
//
//    public List<Pet> getBySpecie(String species) {
//        return petCrudRepository.findBySpeciesOrderByNameAsc(species);
//    }
//
//    public List<Pet> getByName(String name) {
//        return petCrudRepository.findByName(name);
//    }
//
//    public List<Pet> getByAgeGreaterThan(int age) {
//        return petCrudRepository.findByAgeGreaterThan(age);
//    }
//
//    public List<Pet> getBySpeciesAndBreed(String species, String breed) {
//        return petCrudRepository.findBySpeciesAndBreed(species, breed);
//    }
//
//    // Native query methods
//    public List<Pet> getOlderThan(int age) {
//        return petCrudRepository.findPetsOlderThan(age);
//    }
//
//    public List<Pet> getBySpeciesAndBreedNative(String species, String breed) {
//        return petCrudRepository.findPetsBySpeciesAndBreed(species, breed);
//    }
//
//    public Pet getByIdNative(String gender) {
//        return (Pet) petCrudRepository.findPetsByGender(gender);
//    }
//
//    public List<Pet> countBySpeciesNative(String name) {
//        return petCrudRepository.findPetsWithNameLike(name);
//    }
//
//    public void save(Pet pet){
//        petCrudRepository.save(pet);
//    }
//
//    public void delete(int id){
//        petCrudRepository.deleteById( id);
//    }
//
//    public boolean exitsPet(int id) {
//        return petCrudRepository.existsById( id);
//    }
//
//    public long countAll(){
//        return petCrudRepository.count();
//    }
//}
