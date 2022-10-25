package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Programa.Cuenta;

class CuentaTest {

	static Cuenta C12345;
	static Cuenta C678890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		C12345=new Cuenta("12345","Pepe",50d);
		C678890=new Cuenta("678890","Pablo",0d);
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
	
	/*
	@Test
	void testReintegro() throws Exception {
		assertEquals(45, cuenta1.reintegro(5));
	}

	@Test
	void testIngreso() throws Exception {
		assertEquals(50, cuenta1.ingreso(5));
	}
	*/
	
	@Test
	public void Test0014() throws Exception {
		C12345.reintegro(200);
		C678890.reintegro(350);
		
		C12345.ingreso(100);
		
		
		C678890.reintegro(200);
		fail("No ha saltado la excepcion");
	
		C678890.reintegro(150);
		
		C12345.reintegro(200);
		
		C678890.ingreso(50);
		
	
		C678890.reintegro(100);
		fail("No ha saltado la excepcion");
		
		
		assertEquals(-250, C12345.getSaldo());
		assertEquals(-450, C678890.getSaldo());
		
	}
	
	
	

}
