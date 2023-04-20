package com.codejava;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ProductImg")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	    private String name;
	    private String brand; 
	    private Integer price;
	    private String fileName;
		@Lob
		private byte[] image;
		
		
		  
		
	  
	    

	 


}
