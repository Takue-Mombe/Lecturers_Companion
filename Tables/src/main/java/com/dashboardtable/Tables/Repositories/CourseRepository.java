package com.dashboardtable.Tables.Repositories;

import com.dashboardtable.Tables.Models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Courses,String> {
}
