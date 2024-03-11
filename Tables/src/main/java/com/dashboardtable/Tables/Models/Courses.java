package com.dashboardtable.Tables.Models;


import jakarta.persistence.*;

@Entity(name = "coursedetails")
public class Courses {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column
    private String courseName;
    @Column
    private AssessmentType assessmentType;
    @Column
    private double assessmentWeight;
    @Column
    private String courseId;



    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public AssessmentType getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(AssessmentType assessmentType) {
        this.assessmentType = assessmentType;
    }

    public double getAssessmentWeight() {
        return assessmentWeight;
    }

    public void setAssessmentWeight(double assessmentWeight) {
        this.assessmentWeight = assessmentWeight;
    }
}
