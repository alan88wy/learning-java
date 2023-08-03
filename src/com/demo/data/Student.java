package com.demo.data;

public class Student {
    // variable declarations
    int id; 
    public String name; 
    String gender = "male";

    // Constructors
    public Student(int id, String name) {
        this(name); // Invoking overloaded constructor. If present, should be first statement
	    this.id = id;
    }

    Student(String name) {
	this.name = name;
    }

    // method definitions
    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
}
