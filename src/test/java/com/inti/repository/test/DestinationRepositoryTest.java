package com.inti.repository.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.inti.model.Destination;
import com.inti.repository.IDestinationRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class DestinationRepositoryTest {
	
	@Autowired
	IDestinationRepository idr;
	
	Destination d1;
	
	@BeforeEach
	public void util() {
		d1 = new Destination(1000, 2000);
	}
	
	@Test
	public void saveDestinationTest() {
		//GIVEN
		
		//WHEN
		idr.save(d1);
		
		//THEN
		assertThat(d1).isNotNull();
		assertThat(d1.getLatitude()).isEqualTo(2000);
	}
	
	@Test
	public void saveDestinationSansAttributObligatoireTest() {
		//GIVEN
		Destination d2 = new Destination();
		
		//WHEN
		idr.save(d2);
		//THEN
		assertThat(d2).isNotNull();
		assertThat(d2.getLatitude()).isEqualTo(0);
		assertThat(d2.getLongitude()).isEqualTo(0);

	}

}
