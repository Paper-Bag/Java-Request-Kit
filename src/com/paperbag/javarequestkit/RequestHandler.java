package com.paperbag.javarequestkit;

public class RequestHandler extends Thread {
	protected ICallback callback;
	protected Request request;
	
	public RequestHandler(Request request, ICallback callback) {
		if (request == null) { throw new IllegalArgumentException("A request must be supplied"); }
		if (callback == null) { throw new IllegalArgumentException("A callback must be supplied"); }

		this.callback = callback;
		this.request = request;
	}
}
