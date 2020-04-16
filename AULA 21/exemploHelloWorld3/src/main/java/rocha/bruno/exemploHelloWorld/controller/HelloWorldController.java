package rocha.bruno.exemploHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index(){
        return "Agora sim, vamo dale!";
    }
}
