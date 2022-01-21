package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public float grade;
	public boolean javaProgrammer;
	
	// default constructor
		public Student() {
			System.out.println("This is from default Constructor of Student class");
		}

		// parameterized constructor
		public Student(String stName, int stID, char sex, float grade, boolean javaProgrammer) {
			//generated from eclipse
			this.stName = stName;
			this.stID = stID;
			this.sex = sex;
			this.grade = grade;
			this.javaProgrammer = javaProgrammer;
			
			System.out.println("Student Name: " + stName+ ", ID: " + stID + ", Sex: " + sex +", Grade " + grade + ", and Java Programmer? Ans: " +javaProgrammer);
			//Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer? Ans: true. 
		}
		
		

		
}
