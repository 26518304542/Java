package FactoryMethodPattern;

public class Tiger implements Animal{

	@Override
	public void preferredAciton() {

		System.out.println("Hunting");
		
	}

	@Override
	public void speak() {

		System.out.println("Harrrr");
	}

}
