package com.example.backendDevTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backendDevTest.EntityDAO;
import com.example.backendDevTest.Entity;

@Service
public class EntityServiceImpl implements EntityService {
	
	 @Autowired
	    private EntityDAO entityDAO;
	 
	 @Override
	    public List<Entity> findAll() {
	        List<Entity> listUsers= entityDAO.findAll();
	        return listUsers;
	    }
	 
	 @Override
	    public Entity findById(String id) {
	        Entity entity = entityDAO.findById(id);
	        return entity;
	    }
	 
	 @Override
	    public void save(Entity entity) {
	        entityDAO.save(entity);

	    }
	 
	    @Override
	    public void deleteById(String id) {
	        entityDAO.deleteById(id);
	    }

		@Override
		public Entity findById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteById(int id) {
			// TODO Auto-generated method stub
			
		}
	
	
	//PAQUETE CONTROLLER PENDIENTE.

}
