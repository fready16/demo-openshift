package com.example.crc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/show")
	public String getMessage(@RequestParam String message) {
		return "Message: ".concat(message);
	}

}
