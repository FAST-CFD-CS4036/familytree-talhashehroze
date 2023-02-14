package bll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dal.PersonDAOStub;

class PersonBOTest {
	PersonDAOStub stub;
	PersonBO bo ;
	
	@BeforeAll
	static void coldStart() {
		
	}
	
	@BeforeEach
	void init() {
		 stub = new PersonDAOStub();
		 bo = new PersonBO(stub);
	}

	@Test
	@DisplayName ("When Pereson are sibling")
	void testIsSibling1() {
//		fail("Not yet implemented");
//		PersonDAOStub stub = new PersonDAOStub();
//		PersonBO bo = new PersonBO(stub);
		Assertions.assertTrue(bo.isSibling(3, 4));
	}
	
	@Test
	void testIsSibling2() {
		Assertions.assertFalse(bo.isSibling(1, 4));
	}
	
	@Test
	void testIsSibling3() {
		Assertions.assertFalse(bo.isSibling(1, 5));
	}
	@Test
	void testIsSibling4() {
		Assertions.assertFalse(bo.isSibling(2, 6));
	}
	@Test
	void testIsHalfSibling1() {
		Assertions.assertTrue(bo.isHalfSibling(3, 4));
	}
	
	@Test
	void testIsHalfSibling2() {
		Assertions.assertFalse(bo.isHalfSibling(1, 4));
	}
	
	@Test
	void testIsHalfSibling3() {
		Assertions.assertFalse(bo.isHalfSibling(1, 5));
	}
	@Test
	void testIsHalfSibling4() {
		Assertions.assertFalse(bo.isHalfSibling(2, 6));
	}
}
