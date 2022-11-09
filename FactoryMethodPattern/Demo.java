package FactoryMethodPattern;

public class Demo {

	public static void main(String[] args) {

		
		AnimalFactory t = new TigerFactory();
		
		AnimalFactory d = new DogFactory();
		
		Animal a = t.createAnimal();
		
		Animal b = d.createAnimal();
		
		
		a.speak();
		
		a.preferredAciton();
		
		b.speak();
		
		b.preferredAciton();
		
		
		
	}

}
