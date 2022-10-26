package com.telran2022.student.service;

import com.telran2022.student.dto.StudentCreateDto;
import com.telran2022.student.dto.StudentDto;
import com.telran2022.student.dto.StudentExamDto;
import com.telran2022.student.dto.StudentUpdateDto;

import java.util.List;

public interface StudentService {
    Boolean addStudent(StudentCreateDto studentCreateDto);
    StudentDto findStudent(Integer id);
    StudentDto removeStudent(Integer id);
    StudentCreateDto updateStudent(Integer id, StudentUpdateDto studentUpdateDto);

    Boolean addScore (Integer id, StudentExamDto studentExamDto);

    List<StudentDto>findStudentsByName(String name);

    Integer studentsQuantity(List<String> names);

    List<StudentDto> findStudentsByMinScore(String exam, int score);
}
