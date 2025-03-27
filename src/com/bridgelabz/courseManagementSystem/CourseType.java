package com.bridgelabz.courseManagementSystem;

abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return instructor;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + " | Instructor: " + instructor);
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor){
        super(courseName, instructor);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor){
        super(courseName, instructor);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor){
        super(courseName, instructor);
    }
}