package com.zoo.Repositories;

import com.zoo.Models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{

}
