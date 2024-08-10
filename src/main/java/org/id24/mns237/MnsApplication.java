package org.id24.mns237;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootpplication;


import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "org.id24.mns237")

@ComponentScan(basePackages = "org.id24.mns237.dao")

@SpringBootApplication

public class MnsApplication {
	public static void main(String[] args){
		SpringBootApplication.run(MnsApplication.class, args);
	}
}