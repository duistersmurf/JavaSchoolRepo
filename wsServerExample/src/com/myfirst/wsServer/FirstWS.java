package com.myfirst.wsServer;

import javax.jws.WebService;

@WebService

public class FirstWS {
	
	private static final String SALUTATION = "hello";
	
	public  String getGreeting (String name)	 {
		return SALUTATION + " " + name;
	}

}
