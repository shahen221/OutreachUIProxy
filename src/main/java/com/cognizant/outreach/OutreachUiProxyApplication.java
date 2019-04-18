package com.cognizant.outreach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class OutreachUiProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutreachUiProxyApplication.class, args);
	}

}
