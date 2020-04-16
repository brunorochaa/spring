package rocha.bruno.exemploHelloWorldLombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Agora sim, com lombok sou dev já ";
    }
}
