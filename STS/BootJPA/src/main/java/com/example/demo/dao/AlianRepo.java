package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alian;

public interface AlianRepo extends JpaRepository<Alian,Integer> {

	@Override 
	List <Alian> findAll();
	List<Alian> findByAname(String a);
	
	List<Alian> findByAidGreaterThan(int aid);
	
	@Query("from Alian where aname = ?1 ")
	List<Alian> findByAnameSorted(String a);
	
}
