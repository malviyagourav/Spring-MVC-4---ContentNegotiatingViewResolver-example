package com.boraji.tutorial.spring.controller;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boraji.tutorial.spring.model.Student;

@Controller
public class StudentController {

   @GetMapping("/")
   public String index() {
      return "index";
   }

   // Handler method to render the PDF, EXCEL, JSON, RSS and JSP views
   @GetMapping("/student")
   public String getStudent(Model model) {

      Student student = new Student();
      student.setId(006);
      student.setName("GOURAV MALVIYA");
      student.setDob(LocalDate.of(1990, Month.DECEMBER, 06));
      student.setEmail("gouravmalviya006@gmail.com");

      model.addAttribute("student", student);
      return "student";
   }

}
