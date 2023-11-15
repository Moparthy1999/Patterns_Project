/*
 * @Author: Bhargav Krishna Moparthy
 */

package com.myClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);
	

}
