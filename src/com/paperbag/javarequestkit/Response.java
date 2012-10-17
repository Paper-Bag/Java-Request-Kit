package com.paperbag.javarequestkit;

public class Response {

	int responseCode = 0;
	String textResponse = "";
	
	public Response(String textResponse, int responseCode) {
		this.responseCode = responseCode;
		this.textResponse = textResponse;
	}

	public String getTextResponse() {
		return this.textResponse;
	}
}
