package com.ecommerce.microcommerce.service;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.ecommerce.microcommerce.model.Carte;
import com.ecommerce.microcommerce.repository.ICarteRepository;

class CarteServiceTests {
	
		
	@Mock
	private ICarteRepository carteRepoMock;
	
	@InjectMocks
	private CarteService carteService;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testFindAll() {
		
		Carte carte = new Carte();
		carte.setId((long) 1);
		carte.setDate("1121");
		carte.setCvc(444);
		carte.setNomSurCarte("A");
		carte.setNumeroCarte("4242424242424242");
		
		when(carteRepoMock.findAll()).thenReturn(Collections.singletonList(carte));

        

        
	}

}
