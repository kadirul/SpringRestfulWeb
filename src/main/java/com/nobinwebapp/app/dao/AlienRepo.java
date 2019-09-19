package com.nobinwebapp.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nobinwebapp.app.model.Alien;
@Component
@Repository
public interface AlienRepo extends JpaRepository<Alien, Integer>{

	
}
