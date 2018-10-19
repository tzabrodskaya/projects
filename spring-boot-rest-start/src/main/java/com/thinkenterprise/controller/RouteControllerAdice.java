package com.thinkenterprise.controller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RouteControllerAdice {

	@ExceptionHandler(value = NoSuchElementException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public RouteErrorStatus exception(NoSuchElementException ex) {
		return new RouteErrorStatus("Wrong request");
	}
}
