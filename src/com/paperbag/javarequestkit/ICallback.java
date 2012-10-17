package com.paperbag.javarequestkit;

public interface ICallback {
	public void failed(String message);
	public void success(Object results);
}
