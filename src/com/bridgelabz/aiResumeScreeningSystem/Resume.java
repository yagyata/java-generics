package com.bridgelabz.aiResumeScreeningSystem;
import java.util.List;
import java.util.ArrayList;

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing Resume for: " + jobRole.getCandidateName());
        jobRole.evaluate();
    }
}

// Resume screening system handling multiple roles using wildcard
class ResumeScreeningSystem {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.evaluate();
        }
    }
}

