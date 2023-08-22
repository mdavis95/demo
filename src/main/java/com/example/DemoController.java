package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/demo")
public class DemoController {

	@Get(uri = "/test", produces = "application/json")
	public SimpleDto test() {
		return new SimpleDto();
	}
}