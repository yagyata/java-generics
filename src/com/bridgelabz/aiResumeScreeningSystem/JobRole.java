package com.bridgelabz.aiResumeScreeningSystem;

abstract class JobRole {
    private String candidateName;
    private String skills;

    public JobRole(String candidateName, String skills) {
        this.candidateName = candidateName;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getSkills() {
        return skills;
    }

    public abstract void evaluate();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating Software Engineer Resume for: " + getCandidateName());
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating Data Scientist Resume for: " + getCandidateName());
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String skills) {
        super(candidateName, skills);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating Product Manager Resume for: " + getCandidateName());
    }
}