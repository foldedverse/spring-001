package com.in28mintes.rest.webservice.restfullwebservice.helloworld;

public class HelloBean {
	private String message;

	HelloBean(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}
}
