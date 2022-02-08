package hw4Q2JavaVariables;

import javax.swing.event.TableColumnModelListener;

import hw5Q2Constructor.Computer;

public class AboutMeTest {

	public static void main(String[] args) {
		System.out.println("\n*************** Information about MySelf *****************\n");
		AboutMe awalElixir = new AboutMe(); // Constructor initialized
		awalElixir.name = "Awal"; // variables initialized
		awalElixir.age = 30;
		awalElixir.myRent = 30000;
		awalElixir.mySalary = 500000;
		awalElixir.myBalance = 686872685648l;
		awalElixir.sex = 'M';
		awalElixir.myHeight = 1.78f;
		awalElixir.myGrade = 3.20588845;
		awalElixir.usCitizen = false;
		awalElixir.aboutMe(); // method initialized
				
		System.out.println("\n*************** Information about Alex *****************\n");
		AboutMe myInfo2 = new AboutMe(); // Constructor initialized
		myInfo2.name = "Alex";// variables initialized
		myInfo2.age = 32;
		myInfo2.myRent = 21000;
		myInfo2.mySalary = 450000;
		myInfo2.myBalance = 756872685648l;
		myInfo2.sex = 'M';
		myInfo2.myHeight = 1.87f;
		myInfo2.myGrade = 2.82073657348;
		myInfo2.usCitizen = true;
		myInfo2.aboutMe(); // method initialized
	}
}