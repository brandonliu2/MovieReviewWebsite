package dev.cl.Movies_Review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MoviesReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesReviewApplication.class, args);
	}


}
