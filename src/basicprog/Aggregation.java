package basicprog;

class Aggregation1{
	int square(int a) {
		return a*a;	
	}
}

public class Aggregation{
	
	Aggregation1 aggregation1;
	double pi=3.14;
	
	double radius(int area) {
		Aggregation1 aggregation1=new Aggregation1();
		int rsquare=aggregation1.square(area);
		return pi*rsquare;	
	}
	
	public static void main(String[] args) {
		Aggregation aggregation=new Aggregation();
		double result=aggregation.radius(26);
		System.out.println(result);
	}
}

