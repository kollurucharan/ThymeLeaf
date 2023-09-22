package com.springBoot.thymeLeaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class control {

	@GetMapping("/ajax-example")
	public String ajaxExample() {
		return "web";
	}

	@GetMapping("/get-data")
	@ResponseBody
	public String getData() {
		// Simulate some data retrieval
		return "This is data from the server.";
	}
}
