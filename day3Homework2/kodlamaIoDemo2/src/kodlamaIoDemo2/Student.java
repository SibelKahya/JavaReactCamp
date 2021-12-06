package kodlamaIoDemo2;

public class Student extends User{
	private String favoriteCourse;
	
	public Student() {
		
	}

	public Student(String favoriteCourse) {
		super();
		this.favoriteCourse = favoriteCourse;
	}

	public String getFavoriteCourse() {
		return favoriteCourse;
	}

	public void setFavoriteCourse(String favoriteCourse) {
		this.favoriteCourse = favoriteCourse;
	}
}
