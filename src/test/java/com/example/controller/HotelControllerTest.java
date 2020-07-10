package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.util.List;

import com.example.domain.Hotel;
import com.example.form.HotelSearchForm;
import com.example.service.HotelService;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelControllerTest {

	@InjectMocks
	HotelController target;
	@MockBean
	private HotelService hotelService;
	@MockBean
	private HotelSearchForm form;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void output_テスト() throws Exception{
		mockMvc.perform(post("/hotel/output"))
				.andExpect(status().isOk())
				.andExpect(view().name("hotel/hotel-search"))
				.andExpect(model().attribute("hotelList", hotelService.searchByLessThanPrice(form.getPrice())));
	}

}
