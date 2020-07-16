package com.zoo.Services;

import com.zoo.Models.Animal;
import com.zoo.Views.AnimalCounts;

import java.util.List;

public interface AnimalService
{
    List<AnimalCounts> count();
}
