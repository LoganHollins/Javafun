package p1;

public class Grades {

	public static void main(String[] args) {
		Student student1 = new Student("Mary"); //declares student names
		Student student2 = new Student("Mike");
		
		student1.inputGrades(); //asks to input test grade for student 1
		System.out.println(student1.getName() + "\'s average grade was: "
		+ student1.getAverage()); //prints name and average grade for student 1
		//Hollins_Logan_A00801672_Set1B_Lab4
		
		System.out.println();
		student2.inputGrades(); //asks to input test grade for student 2
		System.out.println(student2.getName() + "\'s average grade was: "
		+ student2.getAverage()); //prints name and average grade for student 2
		
		System.out.println(student1); //prints out toString
	}

}
