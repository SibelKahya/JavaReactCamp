package kodlamaIoDemo2;

public class StudentManager extends UserManager {
	
	public void addFavoriteCourse(Student student) {
		
		System.out.println("Se�ili kurs Favorilere eklendi  :"+student.getFavoriteCourse());
	}

}
