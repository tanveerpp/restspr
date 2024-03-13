package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "Emp",path = "emp")
public interface MyRepo extends JpaRepository<Emp, Integer> {

}
