package hw6Q2IfElseCondition;

import java.util.Scanner;

public class VoterWithScanner {

	private static Scanner sc;

	public static void main(String[] args) {
		int age;
		sc = new Scanner(System.in);
		System.out.println("Input Age to Continue: ");
		age = sc.nextInt();

		if (age == 18) {
			System.out.println("I am a Voter");
		} else if (age < 18) {
			System.out.println("I am not a Voter");
		} else if (age >= 18) {
			System.out.println("I am a Voter");
		} else {
			System.out.println("Please add a valid age");
		}

	}
}