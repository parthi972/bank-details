package org.info;

public class Switch extends StudentInfo {
public static void main(String[]args) {
	String info = "StudentDept-ECE";
	switch(info) {
	case "StudentName-Parthi":
		Stdname();
		break;
	case "StudentDept-ECE":
		Stddpt();
		break;
	case "StudentGender-Male":
		Stdgnd();
		break;
	case "StudentCity-Pondicherry":
	Stdcity();
	break;
	default:
		System.out.println("None");
	}
}
	
}
