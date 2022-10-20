package com.example.backendDevTest;

import java.util.List;

import com.example.backendDevTest.Entity;

public interface EntityService {
	
	public List<Entity> findAll();

    public Entity findById(int id);

    public void save(Entity entity);

    public void deleteById(int id);

	Entity findById(String id);

	void deleteById(String id);

}
