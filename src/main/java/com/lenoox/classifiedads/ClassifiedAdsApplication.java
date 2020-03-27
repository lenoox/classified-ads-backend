package com.lenoox.classifiedads;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClassifiedAdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassifiedAdsApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ItemRepository repository) {

		return args -> {
			repository.save(new Item("Słuchawki", 34, "Nowy","black","Mało używane słuchawki w dobrym stanie"));
		};
	}

}
