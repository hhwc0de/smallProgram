package com.example.helloworld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import java.lang.Thread;


@MapperScan("com.example.helloworld.mapper")
@SpringBootApplication
public class HelloworldApplication {

    @RestController
    class HelloworldController {
         @GetMapping("/")
          String hello() {
             return "Hello, gg !";
          }
    }



	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
