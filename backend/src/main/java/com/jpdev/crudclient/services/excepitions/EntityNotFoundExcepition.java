package com.jpdev.crudclient.services.excepitions;

public class EntityNotFoundExcepition extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public EntityNotFoundExcepition(String msg) {
		super(msg);
	}
}
