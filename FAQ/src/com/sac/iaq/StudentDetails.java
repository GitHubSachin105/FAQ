package com.sac.iaq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int sno;
	private String sname;
	private String sAddrs;
	public Student(int sno, String sname, String sAddrs) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sAddrs = sAddrs;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsAddrs() {
		return sAddrs;
	}
	public void setsAddrs(String sAddrs) {
		this.sAddrs = sAddrs;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sAddrs=" + sAddrs + "]";
	}
	
}

class SortBySno implements Comparator<Student> {
	// Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.sno - b.sno; 
    } 

}
public class StudentDetails{
	
	public static void main(String[] args) {
		Student s1=new Student(1,"Sachin","Kanpur");
		Student s2=new Student(3,"Abhishek","Mumbai");
		Student s3=new Student(2,"Bharat","Bhopal");
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		Collections.sort(al, new SortBySno()); 
		  
        System.out.println("\nSorted by rollno");
        System.out.println(al);

	}

}
