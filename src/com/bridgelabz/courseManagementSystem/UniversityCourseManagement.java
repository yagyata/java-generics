package com.bridgelabz.courseManagementSystem;
import java.util.List;
import java.util.ArrayList;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics", "Dr. Smith"));
        examCourses.addCourse(new ExamCourse("Physics", "Prof. Johnson"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("History", "Dr. Brown"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Machine Learning", "Dr. Williams"));

        System.out.println("--- Exam-Based Courses ---");
        examCourses.displayCourses();

        System.out.println("\n--- Assignment-Based Courses ---");
        assignmentCourses.displayCourses();

        System.out.println("\n--- Research-Based Courses ---");
        researchCourses.displayCourses();

        // Using wildcard method to display all courses
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse("Chemistry", "Dr. White"));
        allCourses.add(new AssignmentCourse("Philosophy", "Prof. Black"));
        allCourses.add(new ResearchCourse("AI Ethics", "Dr. Green"));

        System.out.println("\n--- Displaying All Courses Using Wildcards ---");
        CourseManager.displayAllCourses(allCourses);
    }
}
