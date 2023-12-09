package com.example.demo.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public List<Student> findAll() {
        return students;
    }

    public Student findById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    public void save(Student student) {
        students.add(student);
    }

    public void update(Student student) {
        int index = findStudentIndexById(student.getId());
        if (index != -1) {
            students.set(index, student);
        }
    }

    public void delete(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    // Дополнительный метод для поиска индекса студента по ID
    private int findStudentIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
