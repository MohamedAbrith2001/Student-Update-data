package com.mysqldata.Springmysql.Controller;

import com.mysqldata.Springmysql.Entity.Student;
import com.mysqldata.Springmysql.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {
        return studentService.saveDetails(student);

    }

    @PutMapping("/updateStudent")
    public Student updateDetails(@RequestBody Student student) {
        return studentService.updateDetails(student);
    }
}
