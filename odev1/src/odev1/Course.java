package odev1;

public class Course {
	int id;
	String courseType;
	String courseName;
	int courseDuration;
	public Course() {
		
		System.out.println("�al��t�m");
	}
    public Course(int id,String courseType,String courseName,int courseDuration) {
    	
    	this.id=id;
    	this.courseType=courseType;
    	this.courseName=courseName;
    	this.courseDuration=courseDuration;
    	
    	
    	
    }
}
