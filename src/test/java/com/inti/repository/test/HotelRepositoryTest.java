package com.inti.repository.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.inti.model.Hotel;
import com.inti.repository.IHotelRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class HotelRepositoryTest {
	
	@Autowired
	IHotelRepository ihr;
	
	Hotel h1;
	
	@BeforeEach
	public void util() {
		 h1 = new Hotel("IBIS Style", 3);
	}
	
	@Test
	public void saveHotelTest() {
		//GIVEN

		//WHEN
		ihr.save(h1);
		//THEN
		assertThat(h1).isNotNull();
		assertThat(h1.getNom()).isEqualTo("IBIS Style");
	}
	
	@Test
	public void saveHotelNullTest() {
		//GIVEN
		Hotel h2 = null;
		//WHEN

		//THEN
		Assertions.assertThrows(Exception.class, () -> ihr.save(h2));
	}
	
	@Test
	public void saveHotelLengthNomSupperieurA15Test() {
		
		//GIVEN
		Hotel h2 = new Hotel("fhgfjghjghkhkhjk", 2);
		//WHEN

		//THEN
		Assertions.assertThrows(Exception.class, () -> ihr.save(h2));
		
	}
	
	@Test
	public void deleteHotelTest() {
		
		//GIVEN

		//WHEN
		ihr.delete(h1);

		//THEN
		assertThat(h1).isNull();
		
	}
	
	

}
