package br.edmos.poc.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("myFirstRoute")
public class MyFirstRoute extends RouteBuilder {
	
	private static Logger Log = LoggerFactory.getLogger(MyFirstRoute.class); 
	
	public MyFirstRoute() {
		Log.info("***** Creating MyFirstRoute component *****");
	}
	
	@Override
	public void configure() throws Exception {
		from("file:///Temp/input/")
			.marshal().zipFile()
			.to("log:MyLogger")
			.to("file:///Temp/output/");
	}
}
