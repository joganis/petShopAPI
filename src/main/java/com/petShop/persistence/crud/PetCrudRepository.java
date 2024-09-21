//package com.petShop.persistence.crud;
//
//import com.petShop.persistence.entity.Pet;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.List;
//
//public interface PetCrudRepository extends CrudRepository<Pet, Integer> {
//    // Query Methods
//    List<Pet> findBySpeciesOrderByNameAsc(String species);
//
//    List<Pet> findByName(String name);
//
//    List<Pet> findByAgeGreaterThan(int age);
//
//    List<Pet> findBySpeciesAndBreed(String species, String breed);
//
//    // Native Queries
//    @Query(value = "SELECT * FROM pets WHERE age > ?1", nativeQuery = true)
//    List<Pet> findPetsOlderThan(int age);
//
//    @Query(value = "SELECT * FROM pets WHERE species = ?1 AND breed = ?2", nativeQuery = true)
//    List<Pet> findPetsBySpeciesAndBreed(String species, String breed);
//
//    @Query(value = "SELECT * FROM pets WHERE gender = ?1", nativeQuery = true)
//    List<Pet> findPetsByGender(String gender);
//
//    @Query(value = "SELECT * FROM pets WHERE name LIKE %?1%", nativeQuery = true)
//    List<Pet> findPetsWithNameLike(String name);
//}
