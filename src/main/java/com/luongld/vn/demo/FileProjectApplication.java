package com.luongld.vn.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FileProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileProjectApplication.class, args);
	}

}
