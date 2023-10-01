package com.prog2.labs;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabTenTests {

	@Test
	void spellcheckerTest1() {
		LabTen labTen = new LabTen();

		String[] inputWordList = { "KiTe", "kite", "hare", "Hare" };
		String[] inputQueries = { "kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto" };

		String[] actual = labTen.spellchecker(inputWordList, inputQueries);
		String[] expected = { "kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe" };

		assertArrayEquals(actual, expected);
	}
	
	@Test
	void spellcheckerTest2() {
		LabTen labTen = new LabTen();

		String[] inputWordList = { "yellow" };
		String[] inputQueries = { "YellOw" };

		String[] actual = labTen.spellchecker(inputWordList, inputQueries);
		String[] expected = { "yellow" };

		assertArrayEquals(actual, expected);
	}
	
	@Test
	void spellcheckerTest3() {
		LabTen labTen = new LabTen();

		String[] inputWordList = { "george", "georGe", "George"};
		String[] inputQueries = { "George", "Georgee", "GeoRGE" };

		String[] actual = labTen.spellchecker(inputWordList, inputQueries);
		String[] expected = { "George", "", "george" };

		assertArrayEquals(actual, expected);
	}
	
	@Test
	void spellcheckerTest4() {
		LabTen labTen = new LabTen();

		String[] inputWordList = { "JorDan",  "jorDan"};
		String[] inputQueries = { "Jor" };

		String[] actual = labTen.spellchecker(inputWordList, inputQueries);
		String[] expected = { "" };

		assertArrayEquals(actual, expected);
	}
}