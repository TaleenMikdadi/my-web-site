package com.example.dm.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dm.models.property;
@Repository
@Transactional
public interface propertyDAO extends JpaRepository<property, Integer> {

}
