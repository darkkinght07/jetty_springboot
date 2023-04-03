package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/home")
    public ResponseEntity home() {
        return new ResponseEntity("Hello World!", HttpStatus.OK) ;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }

}
