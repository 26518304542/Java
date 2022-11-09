package FactoryMethodPattern;

public class TigerFactory extends AnimalFactory{

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Tiger();
	}

}
