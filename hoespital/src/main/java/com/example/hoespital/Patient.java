package com.example.hoespital;

public class Patient {
    private String name;
    private String id;
    private String gender;
    private String medicalHistory;
    private String date;
    private String treatment;
    private String insurance;

    public Patient(String name, String id, String gender, String medicalHistory, String date, String treatment, String insurance) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.medicalHistory = medicalHistory;
        this.date = date;
        this.treatment = treatment;
        this.insurance = insurance;
    }

    // Getters and setters for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
}