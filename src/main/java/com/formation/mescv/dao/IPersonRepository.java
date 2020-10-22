package com.formation.mescv.dao;

import com.formation.mescv.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IPersonRepository extends JpaRepository<Person, Long> {
}
