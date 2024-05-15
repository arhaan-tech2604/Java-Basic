package basicprog;

class Account {

	private long Account_No;
	private String Name, Email;
	private float Ammount;

	public long getAccount_No() {
		return Account_No;
	}

	public void setAccount_No(long account_No) {
		this.Account_No = account_No;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public float getAmmount() {
		return Ammount;
	}

	public void setAmmount(float ammount) {
		this.Ammount = ammount;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Account a=new  Account();
		a.setAccount_No(7560504000L);
		a.setName("Arhan Siddiqui");
		a.setEmail("arhan@gmail.com");
		a.setAmmount(1000000);
		
		System.out.println("Account No :"+a.getAccount_No());
		System.out.println("Name : "+a.getName());
		System.out.println("Email : "+a.getEmail());
		System.out.println("Amount : "+a.getAmmount());
	}
}
