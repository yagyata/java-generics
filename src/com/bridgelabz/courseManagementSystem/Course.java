package com.bridgelabz.courseManagementSystem;
import java.util.List;
import java.util.ArrayList;

class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public void displayCourses() {
        for (T course : courseList) {
            course.displayCourseDetails();
        }
    }
}

//display courses using wildcards
class CourseManager {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for(CourseType course : courses) {
            course.displayCourseDetails();
        }
    }
}




