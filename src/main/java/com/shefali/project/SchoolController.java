package com.shefali.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SchoolController {
    List<String> school_name = new ArrayList<>();

    public SchoolController() {
        school_name.add("SVM");
        school_name.add("VVHS");
        school_name.add("HFCHS");
        school_name.add("JBL");
    }

    @GetMapping("/java")
    public String shefali() {
        return "I love java";
    }

    @PostMapping("/java")
    public String monday(@RequestParam String weekday) {
        return "Day of the week is " + weekday;
    }

    @PostMapping("/schoolname")
    public String newschool(@RequestParam String newschool) {
        school_name.add(newschool);
        return "School was added";
    }

    @GetMapping("/schoolname")
    public List<String> CallSchool() {
        return school_name;
    }
}

