class Country {
	String name; //name of country
	int population; //population of country
	int area; //area of country
	int dogs; //number of owned dogs in country

	//Constructor below 
	Country(String n, int p, int a, int d) {
		name = n;
		population = p;
		area = a;
		dogs = d;
	}
	
	void Density(){ //population density
		System.out.println("The population density of " + name + " is " + population/area + " people per square mile.");
	}
	
	void DogDensity(){ //population density of dogs
		if(dogs/area > 1) //I need an if here b/c there's only one dog per square mile in Canada
		System.out.println("The population density of dogs in " + name + " is " + dogs/area + " dogs per square mile.");
		else
		System.out.println("The population density of dogs in " + name + " is " + dogs/area + " dog per square mile.");
	}
	
	//Area of the countries
	int getArea() {
		return area;
	}
	
	//Population of countries
	int getPopulation() {
		return population;
	}
	
	//Population of dogs in the countries
	int getDogs() {
		return dogs;
	}
}

class TwoCountries { 
public static void main(String args[]) {
	//Data for the returns stated below
	Country US = new Country("United States", 317000000, 3794000, 75000000);
	Country Canada = new Country("Canada", 35000000, 3855000, 6000000);
	
	//Print out everything for U.S. 
	System.out.println("Name of the country: " + US.name);
	System.out.println("Population of country: " + US.getPopulation());
	System.out.println("Population of dogs in country: " + US.getDogs());
	System.out.println("Area of country: " + US.getArea());
	US.Density();
	US.DogDensity();
	
	//Print out everything for Canada
	System.out.println("Name of the country: " + Canada.name);
	System.out.println("Population of country: " + Canada.getPopulation());
	System.out.println("Population of dogs in country: " + Canada.getDogs());
	System.out.println("Area of country: " + Canada.getArea());
	Canada.Density();
	Canada.DogDensity();
}
}