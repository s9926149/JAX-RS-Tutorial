package org.syachiku.madao.messenger.exception;

public class DataNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2983270983171361935L;
	
	public DataNotFoundException(String message){
		super(message);
	}
}
