package pl.sda.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/kurs")
public class CourseController {

    @GetMapping("/lista")
    public String list() {
        return "course/list";
    }
}
