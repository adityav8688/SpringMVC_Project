package com.aditya.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.aditya.model.Alien;

@Component
public class AliensDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createAliens(Alien aliens)
	{
		this.hibernateTemplate.save(aliens);
	}
	
	//get all aliens
	public List<Alien> getAliens()
	{
		List<Alien> aliens = this.hibernateTemplate.loadAll(Alien.class);
		return aliens;
	}
	
	//del a alien
	@Transactional
	public void deleteAlien(int aid)
	{
		Alien a = this.hibernateTemplate.load(Alien.class, aid);
		this.hibernateTemplate.delete(a);
	}
		
	//get a single alien
	public Alien getAlien(int aid)
	{
		return this.hibernateTemplate.get(Alien.class, aid);
	}
}
