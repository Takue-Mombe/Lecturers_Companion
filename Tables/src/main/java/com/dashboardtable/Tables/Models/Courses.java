package com.dashboardtable.Tables.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Courses")
public class Courses {


    @Id
    @Column
    private String courseId;
    @Column
    private String courseName;
    @Column
    private AssessmentType assessmentType;
    @Column
    private double assessmentWeight;


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
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
