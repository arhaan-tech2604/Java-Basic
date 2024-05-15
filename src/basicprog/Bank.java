package basicprog;

abstract class TestBank{
	abstract int getRateOfInterest(); 
}

class SBI extends TestBank{
	int getRateOfInterest() {
		return 6;
	}
}

class HDFC extends TestBank{
	int getRateOfInterest() {
		return 5;	
	}
}

public class Bank {
	public static void main(String[] args) {
		TestBank tb=new SBI();
		TestBank tb1=new HDFC();
		
		System.out.println("Rate of Interest is "+tb.getRateOfInterest()+"%");
		System.out.println("Rate of Interest is "+tb1.getRateOfInterest()+"%");
	}
}
