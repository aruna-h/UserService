package com.bridgelabz.discoveryClient.exceptionservice;

/**
 * @author bridgelabz
 * @since 2/8/2018 <br>
 *        <p>
 *        entity to show exception
 *        </p>
 */
@SuppressWarnings("serial")
public class ToDoException extends Exception {
	String message;
	int code;

	public ToDoException(String message) {
		super(message);
	}

	public ToDoException(String message, int code) {
		this.message = message;
		this.code = code;
	}
}
