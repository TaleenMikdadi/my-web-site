package com.example.dm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dm.DAO.propertyDAO;
import com.example.dm.models.property;

@Service
public class propertyService {
	@Autowired
	propertyDAO pdao;
	
	public property addProperty(property p)
	{
		return pdao.save(p);
	}
	public Collection<property> getAll()
	{
		return pdao.findAll();
	}
	public void removeP(int id)
	 {
		 pdao.deleteById(id);
	 }
}
