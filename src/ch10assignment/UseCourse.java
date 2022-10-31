package ch10assignment;

import java.util.Scanner;


public class UseCourse {

	public static void main(String[] args) {
		Scanner infor=new Scanner(System.in);
		System.out.println("Enter the department");
		String department=infor.next();
		System.out.println("Enter the course number");
		int Num=infor.nextInt();
		System.out.println("Enter the credit");
		int Credit=infor.nextInt();
		if(department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY"))
	    {

	       LabCourse labCourse = new LabCourse(department, Num, Credit);
	       labCourse.display();
	    }
		else {
			CollegeCourse collegeCourse = new CollegeCourse(department, Num, Credit);
	    	collegeCourse.display();
		}
		
	}

}
