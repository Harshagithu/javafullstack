package com.codegnan.methoddemo;
class Course
{
   // instance variables;
	int courseId;
	String courseName;
	int courseDuration;

    public static void main(String args[])
    {
       //Course object
       Course courseRef=new Course();
       courseRef.courseId=200;
       courseRef.courseName="Java Full Stack";
       courseRef.courseDuration=100;
       System.out.println("Course Id: "+courseRef.courseId);
       System.out.println("Course Name: "+courseRef.courseName);
       System.out.println("course Duration: "+courseRef.courseDuration);
    }
}