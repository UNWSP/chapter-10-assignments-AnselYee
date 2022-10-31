package ch10assignment;

public class CollegeCourse {

	String Department;
	int CourseNum;
	int Credit;
	int Fee;
	public CollegeCourse(String dep, int crnum,int cr)
	{
		Department=dep;
		CourseNum=crnum;
		Credit=cr;
		Fee=cr*120;
	}
	
	public void display(){
		System.out.print("The department is: "+Department+"\nThe course number is: "+CourseNum+"\nThe Credit is: "+Credit+"\nThe fee is: $"+Fee);
		
	}
}