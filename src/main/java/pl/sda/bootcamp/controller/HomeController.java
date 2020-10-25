package pl.sda.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    //odpala stronkę pusta pod adresem localhost:8080/home
//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String home(){
//        return "home";


    //przekierowuje od razu do kurs/lista i wyświetla tabele z kursami.
@RequestMapping(value = "/")
    public String home(){
        return "redirect:kurs/lista";
    }
}
