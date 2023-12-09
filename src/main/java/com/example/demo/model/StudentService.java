package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.update(student);
    }

    public void deleteStudent(int id) {
        studentRepository.delete(id);
    }
}
