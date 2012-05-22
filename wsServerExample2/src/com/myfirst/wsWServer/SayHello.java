package com.myfirst.wsWServer;

import javax.jws.WebService;

@WebService

public class SayHello {
	
	private static final String SALUTATION = "Hello";
	
	public String getGreeting( String name ) {
		return SALUTATION + " " + name;
	}
}