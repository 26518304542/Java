package FactoryMethodPattern;

public class Dog implements Animal{

	@Override
	public void preferredAciton() {

		System.out.println("Barking");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("how how");
	}

	
}
