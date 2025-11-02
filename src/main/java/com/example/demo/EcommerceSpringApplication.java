package com.example.demo;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class EcommerceSpringApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();//loads the .env file from root path
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue())
		);//set system proprties from env variables and set them.
		SpringApplication.run(EcommerceSpringApplication.class, args);
	}
}
