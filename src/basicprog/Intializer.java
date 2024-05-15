package basicprog;

class A{
	A(){
		System.out.println("Parent Class Called...");
	}
}

public class Intializer extends A{

	public Intializer() {
		super();
		System.out.println("Child class Called....");
	}
	
	public Intializer(int a) {
		super();
		System.out.println("Child class Called.. "+a);
	}
	
	{
		System.out.println("Intializer Block Called");
	}
	
	public static void main(String[] args) {
		Intializer in=new Intializer();
		Intializer in1=new Intializer(10);
	}
	
}