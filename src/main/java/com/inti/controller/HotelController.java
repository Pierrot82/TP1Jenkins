package com.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {
	
	@GetMapping("creerHotel")
	public String creerHotel() {
		return "creerHotel";
	}

}
