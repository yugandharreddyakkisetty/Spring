package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Alian;

@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")

public interface AlianRepo extends JpaRepository <Alian,Integer> {

}
