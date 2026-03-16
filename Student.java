package com.codegnan.methoddemo;
class Student
{
	int rollNo;
	String name;
	int age;
	String course;

    public static void main(String args[])
    {
       //Student object
       Student studentRef=new Student();
       studentRef.rollNo=100;
       studentRef.name="HarshaVardhan";
       studentRef.age=22;
       studentRef.course="Java Full Stack";
       System.out.println("Roll No: "+studentRef.rollNo);
       System.out.println("Name: "+studentRef.name);
       System.out.println("Age: "+studentRef.age);
       System.out.println("course: "+studentRef.course);
    }
}