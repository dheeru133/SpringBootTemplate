package com.example.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class RestControllerExample implements ErrorController {

	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public String error() {
		return "Error handling";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

	@RequestMapping(value = "/getEmployee1", method = RequestMethod.GET)
	public String getEmployee(@PathVariable String employeeID) {

		return "Organization Employee 1";

	}

	@RequestMapping("/getEmployee2")
	public String getPerson() {

		return "Organization Employee 2";

	}

}
