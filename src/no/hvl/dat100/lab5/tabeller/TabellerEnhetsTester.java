package no.hvl.dat100.lab5.tabeller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabellerEnhetsTester {

	private static int[] tabell1 = { 1, 4, 6 };
	private static int[] tabell2 = { 1 };
	private static int[] tabell3 = {};
	
	@Test
	void testSkrivUt() {
		
		Tabeller.skrivUt(tabell1);
		Tabeller.skrivUt(tabell2);
		Tabeller.skrivUt(tabell3);
	}

	@Test
	void testtilStreng() {

		assertEquals("[1,4,6]", Tabeller.tilStreng(tabell1));
		assertEquals("[1]", Tabeller.tilStreng(tabell2));
		assertEquals("[]", Tabeller.tilStreng(tabell3));
	}
	
	@Test
	void testSummer() {
		assertEquals(11,Tabeller.summer(tabell1));
		assertEquals(1,Tabeller.summer(tabell2));
		assertEquals(0,Tabeller.summer(tabell3));
	}

}
