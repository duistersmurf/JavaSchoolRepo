package com.myfirst.wsServer;

import javax.xml.ws.Endpoint;

public class RunService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("SayHellowweb Servece started");
		Endpoint.publish("http://localhost:8080/JAXBexample", new FirstWS());

	}

}
