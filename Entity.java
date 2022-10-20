package com.example.backendDevTest;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@SuppressWarnings("unused")
public class Entity {
	
	   @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="id")
	    private int id;
	   
	   @Column(name="name")
	    private String name;
	   
	   @Column(name="price")
	    private Number price;
	   
	   @Column(name="availability")
	    private Boolean availability;
	   
	   public Entity() {}
	   
	   public Entity(int id, String name, Number price, Boolean availability) {
		  
		   this.id = id;
		   this.name = name;
		   this.price = price;
		   this.availability = availability;
		   
	   }

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(Number price) {
		this.price = price;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	
	
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", price=" + price + ", availability=" + availability
                 + "]";
    }
	
	

}
