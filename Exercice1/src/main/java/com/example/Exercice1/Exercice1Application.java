package com.example.Exercice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercice1Application.class, args);
	}

	@RestController
	public class HelloWorldController {

		@GetMapping("/hello")
		public Mono<String> hello() {
			return Mono.just("Hello World!");
		}
	}	
}
