package studentdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import studentdata.entity.Student;
import studentdata.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("student", new Student());

        model.addAttribute("students",
                studentService.getAllStudents());

        return "index";
    }
}