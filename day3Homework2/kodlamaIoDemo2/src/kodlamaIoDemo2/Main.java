package kodlamaIoDemo2;

public class Main {

	public static void main(String[] args) {
		
		
		Student ogrenci1=new Student();
		ogrenci1.setFirstName("SÝbel");
		ogrenci1.setLastName("KAHYA");
		ogrenci1.setAge(29);
		ogrenci1.setFavoriteCourse("JavaScript");
		ogrenci1.setId(1);
		ogrenci1.setDeleted(true);
		
		UserManager userManager=new UserManager();
		userManager.add(ogrenci1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.addFavoriteCourse(ogrenci1);
		
		
		
		Instructor egitmen=new Instructor();
		egitmen.setId(2);
		egitmen.setFirstName("Engin ");
		egitmen.setLastName("DEmiroð");
		egitmen.setSalary(25.450);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(egitmen);
		instructorManager.getSalary(egitmen);
		
		
	}

}
