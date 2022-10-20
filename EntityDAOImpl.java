package com.example.backendDevTest;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.backendDevTest.Entity;

@Repository
public class EntityDAOImpl {
	
	@Autowired
    private EntityManager entityManager;
	
	//  @Override
	    public List<Entity> findAll() {
	        Session currentSession = entityManager.unwrap(Session.class);

	        Query<Entity> theQuery = currentSession.createQuery("from Entity", Entity.class);

	        List<Entity> entities = theQuery.getResultList();

	        return entities;

	    }
	    
	  //  @Override
	    public Entity findById(int id) {
	        Session currentSession = entityManager.unwrap(Session.class);

	        Entity entity = currentSession.get(Entity.class, id);

	        return entity;
	    }
	    
	 //   @Override
	    public void save(Entity entity) {
	        Session currentSession = entityManager.unwrap(Session.class);

	        currentSession.saveOrUpdate(entity);  

	    }
	    
	//    @Override
	    public void deleteById(int id) {
	        Session currentSession = entityManager.unwrap(Session.class);

	        Query<Entity> theQuery = currentSession.createQuery("delete from Entity where id=:idEntity");

	        theQuery.setParameter("idEntity", id);
	        theQuery.executeUpdate();

	    }
	
	

}
