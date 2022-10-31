package ch10assignment;

public class LabCourse extends CollegeCourse {
	
	public LabCourse(String dep, int crnum, int cr) {
		super(dep, crnum, cr);
		Fee+=50;
	}
	public void display(){
		System.out.print("The department is: "+Department+"\nThe course number is: "+CourseNum+"\nThe Credit is: "+Credit+"\nThe fee for lab course is: $"+Fee);

}
}
