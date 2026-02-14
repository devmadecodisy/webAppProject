package com.klu;
public class Student {
    private Course course;

    //Setter is REQUIRED for XML autowiring
    public void setCourse(Course course) {
        this.course = course;
    }

    public void display() {
        System.out.println("Course: " + course.getCourseName());
    }
}