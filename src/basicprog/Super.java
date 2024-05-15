package basicprog;

class Duper{
	int Id;
	String Name;
	String Address;
	
	Duper(int Id,String Name,String Address){
		this.Id=Id;
		this.Name=Name;
		this.Address=Address;
	}
}

class Upper extends Duper{
	float Salary;
	
	public Upper(int Id,String Name,String Address,float Salary) {
		super(Id, Name, Address);
		this.Salary=Salary;
	}
	
	void display() {
		System.out.println(Id+" "+Name+" "+Address+" "+Salary);
	}
}

public class Super {
	public static void main(String[] args) {
		Upper up=new Upper(1, "Arhan Siddiqui", "Powai", 50000);
		up.display();
	}
}
