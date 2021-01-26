package io.github.nateacoffey.ConjugationPracticeWeb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ConjugationPracticeWeb extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(ConjugationPracticeWeb.class);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConjugationPracticeWeb.class, args);
	}

}
