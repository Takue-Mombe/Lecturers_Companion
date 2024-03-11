package com.dashboardtable.Tables.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseController {

    @PostMapping("/save-course")
    public String greetings(){
        return "Hello User";
    }
}
