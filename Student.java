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
       studentRef.display();
    }

    public void display()
    {
       System.out.println("Roll No: "+rollNo);
       System.out.println("Name: "+name);
       System.out.println("Age: "+age);
       System.out.println("course: "+course);
    }
}