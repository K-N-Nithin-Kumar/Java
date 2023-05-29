package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TeluskoChallengeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TeluskoChallengeApplication.class, args);
//		Random random = new Random();
//		UrlService service = context.getBean(UrlService.class);
//
//		String ourl = "https://www.youtube.com/watch?v=2Gik4bFYJbM";
//
//		System.out.println(service.generateUrl(ourl));
	}
}
