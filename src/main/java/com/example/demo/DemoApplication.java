package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	    try {
		//	System.setProperty("javax.net.ssl.trustStore", "C:\\work\\examples\\democlient\\src\\main\\resources\\MyPublicKey.store");
		//	System.setProperty("javax.net.ssl.trustStorePassword", "tstapppass");
			RestTemplate restTemplate = new RestTemplate();
			for (int i=1; i<= 30 ;i++) {
				Greeting person = restTemplate.getForObject("https://localhost:7788/greeting?name=sdfsdfsd", Greeting.class, 200);
				System.out.println(person.getContent() +"  "+person.getId());
				Thread.sleep(500);
			}
		} catch (RestClientException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
