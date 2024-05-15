package com.Exception;

class AgeException extends Exception {

	AgeException(String msg) {
		super(msg);
	}
}

public class UnderAgeException {
	public static void main(String[] args) {
		try {
			int a = 15;

			if (a < 18) {
				throw new AgeException("Not Eligible for Voting");
			} else {
				System.out.println("Eligible for Voting");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
