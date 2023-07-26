package com.mysqldata.Springmysql.Repository;

import com.mysqldata.Springmysql.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
