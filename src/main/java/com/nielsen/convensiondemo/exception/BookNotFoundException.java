package com.nielsen.convensiondemo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException() {
	}

	public BookNotFoundException(String arg0) {
		super(arg0);
	}

	public BookNotFoundException(Throwable arg0) {
		super(arg0);
	}

	public BookNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public BookNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
