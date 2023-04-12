package com.cg.matrimonysite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.cg.matrimonysite")
public class MatrimonysiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrimonysiteApplication.class, args);
	}

}
