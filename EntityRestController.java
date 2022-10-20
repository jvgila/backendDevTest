package com.example.backendDevTest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.backendDevTest.Entity;
import com.example.backendDevTest.EntityService;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
public class EntityRestController {
	
	//Implemented By Jvg.
	
    @Autowired
    private EntityService entityService;

   
    @GetMapping("/entities")
    public List<Entity> findAll(){
       
        return entityService.findAll();
    }

   
    @GetMapping("/entities/{entityId}")
    public Entity getEntity(@PathVariable int entityId){
        Entity entity = entityService.findById(entityId);

        if(entity == null) {
            throw new RuntimeException("Entity id not found -"+entityId);
        }
       
        return entity;
    }

    @PostMapping("/entities")
    public Entity addEntity(@RequestBody Entity entity) {
        entity.setId(0);

        entityService.save(entity);

        return entity;

    }
   
    @PutMapping("/entities")
    public Entity updateEntity(@RequestBody Entity entity) {

        entityService.save(entity);

        return entity;
    }

   
    @DeleteMapping("entities/{entityId}")
    public String deteteEntity(@PathVariable int entityId) {

       Entity entity = entityService.findById(entityId);

        if(entity == null) {
            throw new RuntimeException("Entity id not found -"+entityId);
        }

        entityService.deleteById(entityId);

        return "Deleted entity id - "+entityId;
    }
	
    public class IdControlelr {
    	  @GetMapping("/id")
    	  public int id() {
    	    return id();
    	  }
    	  
	
    }
	
    public class NameControlelr {
    	  @GetMapping("/name")
    	  public String name() {
    	    return "name";
    	  }
    }
    
    public class PriceControlelr {
  	  @GetMapping("/name")
  	  public Number price() {
  	    return price();
  	  }
  	  
  	  public class AvailabilityControlelr {
  	  	  @GetMapping("/availability")
  	  	  public Boolean availability() {
  	  	    return availability();
  	  	  }
      }
  	  
    }
}
