package com.example.appengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @GetMapping("/gesture")
  public String hello() {
    return "Enter a name after /gesture e.g. /gesture/right_hand_swipe";
  }

  @RequestMapping(path="/gesture/{name}")
  public String getMessage(@PathVariable("name") String name) {

    return "Right hand swipe is performed with right hand ;)";
  }

}
