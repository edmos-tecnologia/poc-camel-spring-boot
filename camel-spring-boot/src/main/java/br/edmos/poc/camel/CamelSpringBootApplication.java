package br.edmos.poc.camel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelSpringBootApplication {

	@Value("${poc-camel.api.path}")
	String contextPath;

	public static void main(String[] args) {
		SpringApplication.run(CamelSpringBootApplication.class, args);
	}

//	protected ServletRegistrationBean servletRegistrationBean() {
//		ServletRegistrationBean servlet = new ServletRegistrationBean (new CamelHttpTransportServlet(), contextPath + "/*");
//		servlet.setName("CamelServlet");
//		return servlet;
//	}
}
