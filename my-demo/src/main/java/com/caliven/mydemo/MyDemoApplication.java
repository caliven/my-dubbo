package com.caliven.mydemo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDemoApplication {


	public static void main(String[] args) {
		
		// start embedded zookeeper server
		new EmbeddedZooKeeper(8181, false).start();

		
		SpringApplication.run(MyDemoApplication.class, args);
	}
	
}
