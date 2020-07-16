package com.zoo.Services;

import com.zoo.Models.Zoo;

import java.util.List;

public interface ZooService
{
    List<Zoo> getZoos();
    Zoo getZooById(long id);
}
