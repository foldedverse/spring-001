package com.in28mintes.rest.webservice.restfullwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {

	// /hello-world
	// Return hello world back
	@RequestMapping(method=RequestMethod.GET,path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/gethello")
	public String getCall() {
		return "Get Call";
	}
	
	@GetMapping(path="/getbean")
	public HelloBean getHelloBean() {
		return new HelloBean("Hello World");
	}
	
	@GetMapping(path="/getbean/path/{name}")
	public HelloBean getHelloBeanName(@PathVariable String name) {
		return new HelloBean(
				String.format("Hello World %s", name)
				);
	}
	
}
