package com.zoo.Controllers;

import com.zoo.Models.Animal;
import com.zoo.Repositories.AnimalRepository;
import com.zoo.Services.AnimalService;
import com.zoo.Views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController
{
    @Autowired
    AnimalService animalService;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getCount()
    {
       List<AnimalCounts> myList = animalService.count();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
