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
       System.out.println("Course1 Id: "+courseRef1.courseId);
       System.out.println("Course1 Name: "+courseRef1.courseName);
       System.out.println("course1 Duration: "+courseRef1.courseDuration);

       //Course object 2
       Course courseRef2=new Course();
       courseRef2.courseId=4321;
       courseRef2.courseName="Python Full Stack";
       courseRef2.courseDuration=100;
       System.out.println("\nCourse2 Id: "+courseRef2.courseId);
       System.out.println("Course2 Name: "+courseRef2.courseName);
       System.out.println("course2 Duration: "+courseRef2.courseDuration);
    }
}