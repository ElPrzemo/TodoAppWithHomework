package pl.sda.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/html")
    public String helloWorldFromHtml() {
        return "helloworld";
    }

    // GET todo/{id}
    // GET todo
    // POST todo
    // PUT/POST todo/{id}
}