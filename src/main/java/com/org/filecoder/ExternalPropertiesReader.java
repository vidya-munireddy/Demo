package com.org.filecoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertiesReader implements CommandLineRunner {
   
    @Value("${key}")
	private String key;
//	
	@Value("${key1}")
	private String key1;
	@Override
	public void run(String... args) {
		System.out.println("Value from external properties file:   "+ key +" , " + key1);
	} 
}