package com.bridgelabz.aiResumeScreeningSystem;
import java.util.List;
import java.util.ArrayList;

public class ResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice", "Java, Spring Boot"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob", "Python, Machine Learning"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie", "Leadership, Agile"));

        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer("Dave", "C++, Algorithms"));
        resumes.add(new DataScientist("Eve", "R, Deep Learning"));
        resumes.add(new ProductManager("Frank", "Strategy, UX"));

        System.out.println("\nScreening all resumes:");
        ResumeScreeningSystem.screenResumes(resumes);
    }
}
