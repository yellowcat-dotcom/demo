package com.example.demo.Сontroller;

import com.example.demo.model.Group;
import com.example.demo.model.GroupService;
import com.example.demo.model.Student;
import com.example.demo.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private GroupService groupService;

    @GetMapping("/groups")
    public List<Group> getAllGroups(){
        return groupService.getAllGroups();
    }

    // Получить всех студентов
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Получить студента по ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // Добавить нового студента
    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    // Обновить информацию о студенте
    @PutMapping("/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id); // Устанавливаем ID из пути в объект Student
        studentService.updateStudent(student);
    }

    // Удалить студента по ID
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}
