package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	static Cuenta cuenta1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta1=new Cuenta("12345","Pepe",50d);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		assertEquals(45, cuenta1.ingreso(5));
	}
	
	@Test
	void testReintegro() {
		assertEquals(50, cuenta1.reingreso(5));
	}

}
