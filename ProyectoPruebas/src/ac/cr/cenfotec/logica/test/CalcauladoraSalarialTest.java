package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ac.cr.cenfotec.logica.AnnoBisiesto;
import ac.cr.cenfotec.logica.CalculadoraSalarial;
import ac.cr.cenfotec.logica.TipoEmpleado;
public class CalcauladoraSalarialTest {

CalculadoraSalarial calc;

	
	
	
	
	@Test
	public void testAnnoBisiesto() {
	
		assertEquals(1360.0f,calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR,2000,8),.0f);
		assertEquals(1260.0f,calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR,2000,3),.0f);
		assertEquals(1499.0f,calc.calculaSalarioBruto(TipoEmpleado.VENDEDOR,2000,0),.0f);
		assertEquals(1250.0f,calc.calculaSalarioBruto(TipoEmpleado.ENCARGADO,2000,8),.0f);
		assertEquals(1000.0f,calc.calculaSalarioBruto(TipoEmpleado.ENCARGADO,2000,0),.0f);
		
	
}

}
