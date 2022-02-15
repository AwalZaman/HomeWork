package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee empl = new Employee();
		empl.setName("Awal Z");
		empl.setAge(32);
		empl.setSex('M');
		empl.setUsCitizen(false);

		System.out.println("Employee Details Below:\nName: " + empl.getName() + ", Age: " + empl.getAge() + ", Sex: " + empl.getSex() + ", US Citizen? : " + empl.isUsCitizen());
	}
}