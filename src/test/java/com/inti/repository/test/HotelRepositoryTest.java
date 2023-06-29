package com.inti.repository.test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.inti.repository.IHotelRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class HotelRepositoryTest {
	
	@Autowired
	IHotelRepository ihr;
	
	

}
