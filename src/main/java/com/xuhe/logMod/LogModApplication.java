package com.xuhe.logMod;

import org.apache.log4j.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogModApplication {

	private static final Logger logger=LogManager.getLogger(LogModApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(LogModApplication.class, args);
		BasicConfigurator.configure();
		
	}
	public static int counter=0;
	
	@RequestMapping("/xuhe")
	public String returnXuhe() {		
		logger.info("should to file"+ counter);
		return "xuhe Created" + counter++;	
	}
	
	@RequestMapping("/erring")
	public String returnErr() {
		logger.info("error - oops");
		return "error - oops";
	}
	
}
