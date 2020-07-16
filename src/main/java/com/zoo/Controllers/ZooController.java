package com.zoo.Controllers;

import com.zoo.Models.Zoo;
import com.zoo.Repositories.ZooRepository;
import com.zoo.Services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController
{
    @Autowired
    private ZooService zooService;

    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> getZoos()
    {
        List<Zoo> myList = zooService.getZoos();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    @GetMapping(value = "/zoo/{id}", produces = "application/json")
    public ResponseEntity<?> getZooById(@PathVariable long id)
    {
        Zoo myZoo = zooService.getZooById(id);
         return new ResponseEntity<>(myZoo, HttpStatus.OK);
    }
}
