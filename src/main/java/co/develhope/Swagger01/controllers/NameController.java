package co.develhope.Swagger01.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value = "")
    public String defaultMessage(){
        return "Welcome, this is the Swagger01 exercise";
    }

    @GetMapping(value = "/name")
    public String name(){
        return "My name is Chiara";
    }

    @GetMapping(value = "/name/{yourName}")
    public String paramName (@PathVariable String yourName){
        return "Hello " + yourName + "!";
    }

}

