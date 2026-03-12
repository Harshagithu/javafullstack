import java.util.*;
class Exercise1
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter studentName: ");
		String sname=Sc.next();
		System.out.print("Enter age: ");
		int age=Sc.nextInt();
		System.out.print("Enter grade: ");
		String grade=Sc.next();
		System.out.print("Enter marks: ");
		int marks=Sc.nextInt();
		System.out.print("Passed (true/false): ");
		boolean isPassed=Sc.nextBoolean();
		System.out.println("\n ---Student Details--- ");
	    System.out.println("Student Name: "+sname);
	    System.out.println("age: "+age);
	    System.out.println("grade: "+grade);
	    System.out.println("marks: "+marks);
	    System.out.println("result: "+isPassed);
	}
}