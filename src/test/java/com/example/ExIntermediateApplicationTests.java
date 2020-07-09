package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.example.domain.*;
import com.example.repository.HotelRepository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExIntermediateApplicationTests {
	@Before
	public void setUp() throws Exception {}
	@After
	public void tearDown() throws Exception {}
	@Test
	public void contextLoads() {
		
	}
	@Autowired
	private HotelRepository hotelRepository;
	@Test
	public void findByLessThanPrice_正常系_引数5000(){
		Hotel hotel=hotelRepository.findByLessThanPrice(5000).get(0);
		assertEquals("error","ホテルローズガーデン新宿", hotel.getHotelName());
	}

}
