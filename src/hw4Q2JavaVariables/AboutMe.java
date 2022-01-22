package hw4Q2JavaVariables;

public class AboutMe {
	// declared variables
	public String name;
	public byte age;
	public short myRent;
	public int mySalary;
	public long myBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	// declaring constructor
	public AboutMe() {
		System.out.println("This is all about me:");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("My Name is " + name + "\nI am " + age + "\nMy HouseRent: " + myRent + "\nYearly Salary: "
				+ mySalary + "\nMy Bank Balance : " + myBalance + "\nSex: " + sex + "\nMy Height: " + myHeight
				+ " Meter" + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}