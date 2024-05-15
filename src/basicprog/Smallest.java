package basicprog;

public class Smallest {

	static void min(int arr[]) {
		int min=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
				System.out.println("Smallest Number in List : "+min);
			}
		}
	}
	
	public static void main(String[] args) {
		int a[]= {12,34,6,78,90};
		min(a);
	}
}
