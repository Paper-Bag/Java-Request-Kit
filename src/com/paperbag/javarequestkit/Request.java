package com.paperbag.javarequestkit;

public class Request {
	String url;
	private boolean cacheable;
	
	public Request (String url, boolean cacheable) {
		this.url = url;
		this.setCacheable(cacheable);
	}
	
	public Request (String url) {
		this(url, false);
	}

	public String getUrl() {
		return this.url;
	}

	public boolean isCacheable() {
		return cacheable;
	}

	public void setCacheable(boolean cacheable) {
		this.cacheable = cacheable;
	}
}
