package com.chatBotApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
	
	
	
	
	@GetMapping("/test")
	public String getindexPage() {
		
		return "index";
		
	}

	@GetMapping("/login")
	public String gettestPage() {
		
		return "test";
		
	}
	
	
	
	
	@GetMapping("/questionForm")
	public String questionpage() {
		return "questionForm";
	}

}
