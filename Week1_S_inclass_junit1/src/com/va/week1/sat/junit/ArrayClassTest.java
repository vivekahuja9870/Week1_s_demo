package com.va.week1.sat.junit;

/*
 * @author -Vivek
 * @date - May 15, 2021
 * @ this is a test case for ArrayClass. includes - Test sum, test avg and...
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayClassTest {

	@Test
	public void testSum() {
		assertEquals(32,ArrayClass.sum(new int[]{4,5,8,2,9,1,3}));
		assertEquals(33,ArrayClass.sum(new int[]{10,0,7,-3,8,-4,6,9}));
		assertEquals(5,ArrayClass.sum(new int[]{8,5,3,6,1,2,4,7,9}));
}
}
