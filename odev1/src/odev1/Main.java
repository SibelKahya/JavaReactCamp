package odev1;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"YAZILIM GEL��T�R�C� KAMPI","Temel Programlama",6);
		Course course2=new Course(2,"YAZILIM GEL��T�R�C� KAMPI","Java&REact ",16);
		Course course3=new Course(3,"YAZILIM GEL��T�R�C� KAMPI","c#&Angular",21);
		Course course4=new Course(4,"YAZILIM GEL��T�R�C� KAMPI","JavaScript",8);
		Course[] courses= {course1,course2,course3,course4};
		
		for(Course course: courses) {
			System.out.println("Kurs Ad� :"+ course.courseName+"(Kamp S�resi :"+course.courseDuration+" hafta)");
			
		}
		
		�nstructor instructor= new �nstructor();
		instructor.addInstructors(course1);
		instructor.addInstructors(course2);
		instructor.addInstructors(course3);
		instructor.addInstructors(course4);
		
		
		

	}

}
