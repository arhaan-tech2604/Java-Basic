package basicprog;

public class Reverse {

	public static void main(String[] args) {
		
		int number=876543,reverse=0;
		while (number != 0) {
			int reminder=number % 10;
			reverse=reverse*10 + reminder;
			number=number/10;
		}
		System.out.println("Reverse of given number : "+reverse);
	}
}
