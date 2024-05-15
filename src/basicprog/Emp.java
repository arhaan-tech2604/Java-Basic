package basicprog;

class Address{
	String name;
	String city;
	String country;
	
	Address(String name,String city,String country){
		this.name=name;
		this.city=city;
		this.country=country;
	}
}

public class Emp {

	int emp_Id;
	int phone_No;
	Address ad;
	
	public Emp(int emp_Id,int phone_No,Address ad) {
		this.emp_Id=emp_Id;
		this.phone_No=phone_No;
		this.ad=ad;
	}
	
	void display() {
		System.out.println(emp_Id+" "+phone_No);
		System.out.println(ad.name+" "+ad.city+" "+ad.country);
	}
	
	public static void main(String[] args) {
		Address ad=new Address("Arhan Siddiqui", "Mumbai", "India");
		Address ad1=new Address("Shoaib Soiddiqui", "UP", "India");
		
		Emp em=new Emp(1, 876542341, ad);
		Emp em1=new Emp(2, 345678877, ad1);
		
		em.display();
		em1.display();
	}
}
