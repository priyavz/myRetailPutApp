package com.myretail.put;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.myretail.common.dao")
@ComponentScan("com.myretail.put.controller")
@ComponentScan("com.myretail.put.service")
@ComponentScan("com.myretail.common.dao")
@ComponentScan("com.myretail.common.exception")
@Slf4j
public class MyRetailPutServiceApplication {
	//TODO : Implement some app server caching using redis for example in order to cache the response and avoid db hits every request.

	public static void main(String[] args) {
		SpringApplication.run(MyRetailPutServiceApplication.class, args);
		log.info("MyRetailPutServiceApplication started successfully...");

	}

}
