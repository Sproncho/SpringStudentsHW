package com.telran2022.student.controller;

import com.telran2022.student.dto.StudentCreateDto;
import com.telran2022.student.dto.StudentDto;
import com.telran2022.student.dto.StudentExamDto;
import com.telran2022.student.dto.StudentUpdateDto;
import com.telran2022.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController  {
    StudentService studentService;
    @PostMapping("/student")
    public boolean addStudent(@RequestBody StudentCreateDto studentCreateDto){
        return studentService.addStudent(studentCreateDto);
    }

    @GetMapping("student/{id}")
    public StudentDto findStudent(@PathVariable Integer id) {
        return studentService.findStudent(id);
    }

    @DeleteMapping("student/{id}")
    public StudentDto removeStudent(@PathVariable Integer id) {
        return studentService.removeStudent(id);
    }

    @PutMapping("student/{id}")
    public StudentCreateDto updateStudent(@PathVariable Integer id,@RequestBody StudentUpdateDto studentUpdateDto) {
        return studentService.updateStudent(id, studentUpdateDto);
    }

    @PutMapping("/score/student/{id}")
    public Boolean addScore (@PathVariable Integer id,@RequestBody StudentExamDto studentExamDto){
        return studentService.addScore(id,studentExamDto);
    }

    @GetMapping("students/name/{name}")
    public List<StudentDto> findStudentsByName(@PathVariable String name){
        return studentService.findStudentsByName(name);
    }
    @PostMapping("quantity/students")
    public Integer studentsQuantity(@RequestBody List<String> names){
        return studentService.studentsQuantity(names);
    }
    @GetMapping("students/exam/{exam}/minscore/{score}")
    public List<StudentDto> findStudentsByMinScore(@PathVariable String exam,@PathVariable int score){
        return studentService.findStudentsByMinScore(exam,score);
    }
}
