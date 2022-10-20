package com.example.backendDevTest;

import java.util.List;

import com.example.backendDevTest.Entity;

public interface EntityDAO {
	
	   public List<Entity> findAll();

	    public Entity findById(String id);

	    public void save(Entity entity);

	    public void deleteById(String id);

}
