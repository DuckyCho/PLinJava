package studentManagementSystem;

public class Main {
	
	public static void main(String args[]){
	
		Student s1 = new Student("이승기","math",95,20);
		Student s2 = new Student("김수현","english",90,100);
		Student s3 = new Student("주원","math",76,60);
		Student s4 = new Student("김우빈","math",85,89);
		Student s5 = new Student("이민호","english",90,95);
		Evaluate.evaluateStudent(s1);
		Evaluate.evaluateStudent(s2);
		Evaluate.evaluateStudent(s3);
		Evaluate.evaluateStudent(s4);
		Evaluate.evaluateStudent(s5);
		
		System.out.println(s1.getStudentInfo());
		System.out.println(s2.getStudentInfo());
		System.out.println(s3.getStudentInfo());
		System.out.println(s4.getStudentInfo());
		System.out.println(s5.getStudentInfo());
	}
	

}
