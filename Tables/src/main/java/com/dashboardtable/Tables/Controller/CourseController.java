package com.dashboardtable.Tables.Controller;


import com.dashboardtable.Tables.Models.Courses;
import com.dashboardtable.Tables.Repositories.CourseRepository;
import com.dashboardtable.Tables.Service.CourseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;
    private CourseRepository courseRepository;



    @Transactional
    @PostMapping("/save-course")
    public ResponseEntity<String> saveCourse(@RequestBody Courses courses) {
        try {
            courseService.saveCourse(courses);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.TEXT_PLAIN);
            double assessmentWeight = courses.getAssessmentWeight();

            // Save the course
            courseService.saveCourse(courses);

            // Calculate cumulative total (you might want to retrieve the existing total from the database)
            double currentTotal = courseService.calculateCumulativeTotal();

            // Update the cumulative total based on the new assessment
            currentTotal += (assessmentWeight / 100);

            // Update the cumulative total in the database (you might want to have a method for this in the service)
            courseService.updateCumulativeTotal(currentTotal);
            return new ResponseEntity<>("Save was a success", headers, HttpStatus.OK);
        } catch (Exception e) {
            // Log the exception or print the stack trace
            e.printStackTrace();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.TEXT_PLAIN);
            return new ResponseEntity<>("Save failed: " + e.getMessage(), headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


        @GetMapping("/getCourses")
        public List<Courses>getCourses(Courses courses){

        return courseRepository.findAll();
        }


    @DeleteMapping("delete/{id}")
    public String deleteUser(Courses course){
       courseRepository.deleteById(course.getId());
        return "deleted...";
    }

}
