package com.redditclone;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedditcloneApplication {

	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(RedditcloneApplication.class, args);

		System.out.println("Welcome to Reddit clone using spring boot");



	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			System.out.println("Printing all the bean names in the application context.");
			System.out.println("------------------------------------------------------");
			String [] beans = this.applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);
			for(String bean: beans){
				System.out.println(bean);
			}
		};
	}

}
