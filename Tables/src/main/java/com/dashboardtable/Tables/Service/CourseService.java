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

        public void updateCumulativeTotal(double newTotal) {        }
        public void delete(int id){
             courseRepository.deleteById(id);
        }
        public void search(int id){
            courseRepository.findById(id);
        }




    }

