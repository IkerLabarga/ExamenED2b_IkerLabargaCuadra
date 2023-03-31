package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class HoraTest {

	@Test
	void CP1() {
		assertTrue(Hora.validarHora(5, 17, 23));
	}
	
	@Test
	void CP2() {
		assertFalse(Hora.validarHora(5, 17, 24));
	}
	
	@Test
	void CP3() {
		assertFalse(Hora.validarHora(5, 67, 23));
	}
	
	@Test
	void CP4() {
		assertFalse(Hora.validarHora(5, 17, -1));
	}
}
