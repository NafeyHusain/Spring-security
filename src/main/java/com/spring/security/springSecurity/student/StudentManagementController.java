package com.spring.security.springSecurity.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
    public static final List<Student> students= Arrays.asList(
            new Student(1,"James Bons"),
            new Student(2,"Maria jones"),
            new Student(3,"Anna Smit")
    );

    @GetMapping
    public List<Student> getAllStudent(){
        return students;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println(student);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println(studentId);
    }

    @PutMapping(path="{studentId}")
    public void updateStudent(@PathVariable("studentId")Integer studentId,@RequestBody Student student){
        System.out.printf("%s %s%n",studentId,student);
    }
}
