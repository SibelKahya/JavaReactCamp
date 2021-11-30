package odev1;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"YAZILIM GELÝÞTÝRÝCÝ KAMPI","Temel Programlama",6);
		Course course2=new Course(2,"YAZILIM GELÝÞTÝRÝCÝ KAMPI","Java&REact ",16);
		Course course3=new Course(3,"YAZILIM GELÝÞTÝRÝCÝ KAMPI","c#&Angular",21);
		Course course4=new Course(4,"YAZILIM GELÝÞTÝRÝCÝ KAMPI","JavaScript",8);
		Course[] courses= {course1,course2,course3,course4};
		
		for(Course course: courses) {
			System.out.println("Kurs Adý :"+ course.courseName+"(Kamp Süresi :"+course.courseDuration+" hafta)");
			
		}
		
		ýnstructor instructor= new ýnstructor();
		instructor.addInstructors(course1);
		instructor.addInstructors(course2);
		instructor.addInstructors(course3);
		instructor.addInstructors(course4);
		
		
		

	}

}
