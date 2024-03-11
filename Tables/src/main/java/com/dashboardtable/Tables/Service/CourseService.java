package com.dashboardtable.Tables.Service;


import com.dashboardtable.Tables.Models.Courses;
import com.dashboardtable.Tables.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class CourseService {

        @Autowired
        private CourseRepository courseRepository;

        public void saveCourse(Courses course) {
            // Perform any additional logic before saving, if needed
            courseRepository.save(course);
        }

        public double calculateCumulativeTotal() {
            List<Courses> allCourses = courseRepository.findAll();

            // Assuming you have a field in your Courses entity for assessmentWeight
            double cumulativeTotal = allCourses.stream()
                    .mapToDouble(Courses::getAssessmentWeight)
                    .sum();

            return cumulativeTotal;
        }

        // You may need to update this method based on your actual entity structure
        public void updateCumulativeTotal(double newTotal) {
            // Perform any logic needed to update the cumulative total in the database
            // This could involve updating a specific record or storing the total in a separate entity
            // Make sure to handle this according to your application's data structure
        }

        // Other methods related to your business logic



    }

