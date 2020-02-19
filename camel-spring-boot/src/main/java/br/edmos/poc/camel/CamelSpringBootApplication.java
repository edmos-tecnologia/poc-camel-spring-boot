package br.edmos.poc.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author db2admin
 *
 */
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class CamelSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelSpringBootApplication.class, args);
	}
}
