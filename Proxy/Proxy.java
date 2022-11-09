package Proxy;

public class Proxy implements Subject{

	static Subject subject;
	
	@Override
	public void doSomeWork() {

		if(subject == null) {
		
			subject = new ConcreteSubject();
		}
		subject.doSomeWork();
	}
	

}
