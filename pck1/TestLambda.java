package pck1;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLambda test = new TestLambda();
		test.setAction1(()->System.out.println("Action1"));
		test.setAction2((e)->System.out.print(e + " "));
		System.out.println(test.getValue((e1,e2) -> e1+e2));
	}

	public void setAction1(T1 t) {
		// TODO Auto-generated method stub
		t.m1();
	}
	
	public void setAction2(T2 t) {
		// TODO Auto-generated method stub
		t.m2(4.5);
	}
	public int getValue(T3 t){
		
		return t.m3(4,5);
	}
	
	@FunctionalInterface
	interface T1{
		public void m1();
	}
	
	@FunctionalInterface
	interface T2{
		public void m2(double t);
	}
	
	@FunctionalInterface
	interface T3{
		public int m3(int n,int a);
	}
	

}
