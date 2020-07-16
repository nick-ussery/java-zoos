package com.zoo.Repositories;

import com.zoo.Models.Animal;
import com.zoo.Views.AnimalCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    @Query(value = "SELECT a.animalid, a.animaltype, count(zooid) as countzoos\n" +
            " FROM zooanimals z left JOIN animal a ON z.animalid = a.animalid \n" +
            "GROUP BY a.animalid", nativeQuery = true)
    List<AnimalCounts> findAnimalCounts();
}
