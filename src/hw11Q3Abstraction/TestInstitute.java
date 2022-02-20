package hw11Q3Abstraction;

public class TestInstitute {
	public static void main(String[] args) {

		System.out.println("\n------------------ Columbia University Regular class ---------------------\n");
		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.aeronauticalInfo();
		cu.anatomyLab();
		cu.anthropology();
		cu.biochemistryLab();
		cu.biology();
		cu.cafeteria();
		cu.caring();
		cu.classSize();
		cu.commonRoom();
		cu.computerLab();
		cu.dorm();
		cu.emergencyRoom();
		cu.gymnasium();
		cu.hygiene();
		cu.laboratory();
		cu.languageClub();
		cu.lawInfo();
		cu.maths();
		cu.mechanicalLab();
		cu.morgue();
		cu.playground();
		cu.surgeryRoom();
		cu.teacher();
		cu.vocationalInfo();
		//Static methods
		ColumbiaUniversity.columbiaUniversity();
		MedicalSchool.medicalSchool();
		University.library();
		College.studyRoom();

		System.out.println("\n--------------------- University Interface ------------------------\n");
		University un = new ColumbiaUniversity();
		un.surgeryRoom();
		un.emergencyRoom();
		un.cafeteria();
		un.languageClub();
		un.laboratory();
		un.commonRoom();
		un.teacher();
		un.playground();
		un.classSize();
		un.gymnasium();
		// static method of universuty interface is only accessed as University.library (not possible by object)
		University.library();
		// Static method from college interface is called by College itself
		College.studyRoom();
		un.dorm();
		un.morgue();
		// Static method from Hospital interface is called by Hospital itself
		Hospital.pharmacy();

		System.out.println("\n--------------------- Medical School Abstract class ------------------------\n");
		MedicalSchool ms = new ColumbiaUniversity();
		ms.biochemistryLab();
		MedicalSchool.medicalSchool();
		ms.caring();
		ms.maths();
		ms.aeronauticalInfo();
		ms.mechanicalLab();
		ms.computerLab();
		ms.anthropology();
		ms.anatomyLab();
		ms.hygiene();
		ms.lawInfo();
	}
}
