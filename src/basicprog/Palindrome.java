package basicprog;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="nun";
		String rev = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if (str.equals(rev) ){
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}
	}
}
