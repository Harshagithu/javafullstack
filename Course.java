package com.codegnan.methoddemo;
class Course
{
   // instance variables;
   int courseId;
   String courseName;
   int courseDuration;

    public static void main(String args[])
    {
       //Course object 1
       Course courseRef1=new Course();
       courseRef1.courseId=1234;
       courseRef1.courseName="Java Full Stack";
       courseRef1.courseDuration=100;
       courseRef1.display();

       //Course object 2
       Course courseRef2=new Course();
       courseRef2.courseId=4321;
       courseRef2.courseName="Python Full Stack";
       courseRef2.courseDuration=100;
       courseRef2.display();
    }

    // instance method
    public void display()
    {
       System.out.println();
       System.out.println("Course Id: "+courseId);
       System.out.println("Course Name: "+courseName);
       System.out.println("course Duration: "+courseDuration);
    }
}
