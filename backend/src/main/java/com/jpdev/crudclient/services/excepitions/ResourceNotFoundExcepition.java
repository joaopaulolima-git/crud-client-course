package com.jpdev.crudclient.services.excepitions;

public class ResourceNotFoundExcepition extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcepition(String msg) {
		super(msg);
	}
}
