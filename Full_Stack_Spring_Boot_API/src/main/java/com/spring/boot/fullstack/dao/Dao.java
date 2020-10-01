package com.spring.boot.fullstack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.fullstack.model.Employee;


@Repository
public interface Dao extends JpaRepository<Employee,Long>{

}

