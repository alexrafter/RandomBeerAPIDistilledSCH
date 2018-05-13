package ie.distilledsch.model;

public class Beer {

	private int id;
	private String name; 
	private String description;
	private float alcoholPercentage;
	private String breweryLocation;
	
	public Beer(){} 
	    
	public Beer(int id, String name, String description, float alcoholPercentage, String breweryLocation){  
		this.id = id; 
		this.name = name; 
		this.description = description;
		this.alcoholPercentage = alcoholPercentage;
		this.breweryLocation = breweryLocation;
	} 
	   
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public float getAlcoholPercentage() {
		return alcoholPercentage;
	}

	public void setAlcoholPercentage(float alcoholPercentage) {
		this.alcoholPercentage = alcoholPercentage;
	}

	public String getBreweryLocation() {
		return breweryLocation;
	}
	
	public void setBreweryLocation(String breweryLocation) {
		this.breweryLocation = breweryLocation;
	}
   
	  
}
