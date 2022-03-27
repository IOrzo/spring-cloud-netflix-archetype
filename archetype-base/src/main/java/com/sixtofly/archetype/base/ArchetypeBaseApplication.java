package com.sixtofly.archetype.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ArchetypeBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchetypeBaseApplication.class, args);
	}

}
