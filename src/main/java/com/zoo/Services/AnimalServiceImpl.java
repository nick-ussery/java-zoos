package com.zoo.Services;

import com.zoo.Repositories.AnimalRepository;
import com.zoo.Views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalRepository;
    @Override
    public List<AnimalCounts> count() {
      List<AnimalCounts> myList = animalRepository.findAnimalCounts();
        return myList;

    }
}
