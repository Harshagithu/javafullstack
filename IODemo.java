import java.util.Scanner;
public class IODemo
{
  public static void main(String args[])
  {
  	Scanner Sc=new Scanner(System.in);
    System.out.print("Enter your First name: ");
    String firstname=Sc.next();
    System.out.print("Enter your Last name: ");
    String lastname=Sc.next();
    System.out.print("please enter your age: ");
    int age=Sc.nextInt();
    System.out.print("Enter your course: ");
    String course=Sc.next();
    System.out.println();
    System.out.println("your first name is: "+firstname);
    System.out.println("your last name is: "+lastname);
    System.out.println("your age is: "+age);
    System.out.println("Your course is: "+course);
  }
}