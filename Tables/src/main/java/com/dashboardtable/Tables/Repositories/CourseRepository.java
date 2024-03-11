package com.dashboardtable.Tables.Repositories;

import com.dashboardtable.Tables.Models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Courses,Integer> {
}
