package com.loreguy.demo.debezium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDebeziumKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDebeziumKafkaApplication.class, args);
	}

}
