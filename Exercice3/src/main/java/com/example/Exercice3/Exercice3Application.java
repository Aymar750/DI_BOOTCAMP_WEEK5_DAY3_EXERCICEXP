package com.example.Exercice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercice3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercice3Application.class, args);
	}
	@RestController
	public class MathController {

		@GetMapping("/add/{num1}/{num2}")
		public Mono<Double> add(@PathVariable double num1, @PathVariable double num2) {
			return Mono.just(num1 + num2);
		}
	
		@GetMapping("/subtract/{num1}/{num2}")
		public Mono<Double> subtract(@PathVariable double num1, @PathVariable double num2) {
			return Mono.just(num1 - num2);
		}
	
		@GetMapping("/multiply/{num1}/{num2}")
		public Mono<Double> multiply(@PathVariable double num1, @PathVariable double num2) {
			return Mono.just(num1 * num2);
		}
	
		@GetMapping("/divide/{num1}/{num2}")
		public Mono<Double> divide(@PathVariable double num1, @PathVariable double num2) {
			return Mono.just(num1 / num2);
		}
	
	}



}
