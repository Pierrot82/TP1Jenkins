package com.inti.controller.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.inti.controller.HotelController;
import com.inti.repository.IHotelRepository;

@WebMvcTest(controllers = HotelController.class)
public class HotelControllerTest {
	
	
	@Autowired
	private MockMvc mock;
	
	@MockBean
	private IHotelRepository ihr;

	
	@Test
	public void creerHotelTest() throws Exception
	{
		mock.perform(get("/creerHotel"))
		.andExpect(status().isOk())
		.andExpect(view().name("creerHotel"));
	}
}

