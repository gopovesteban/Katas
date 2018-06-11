package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.AnnoBisiesto;

public class AnnoBisiestoTest {

	
	
AnnoBisiesto anno;
	
	
	
	@Test
	public void testAnnoBisiesto() {
		AnnoBisiesto anno = new AnnoBisiesto();
		assertEquals(false,anno.isBisiesto(1900));
	
}
	
	@Test
	public void multiplode4() {
		AnnoBisiesto anno = new AnnoBisiesto();
		assertTrue(anno.isBisiesto(1916));
}
	
	@Test
	public void multiplode4y100() {
		AnnoBisiesto anno = new AnnoBisiesto();
		assertTrue(anno.isBisiesto(1900));
		assertTrue(anno.isBisiesto(2000));
				
}
	@Test
	public void multiplode400() {
		AnnoBisiesto anno = new AnnoBisiesto();
		assertTrue(anno.isBisiesto(1600));
		assertFalse(anno.isBisiesto(2100));
	
}
}