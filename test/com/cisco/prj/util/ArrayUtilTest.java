package com.cisco.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		int[] data = {4, 5, 1, 6};
		int expected = 16;
		assertEquals(expected, ArrayUtil.getSum(data));
	}

	@Test
	public void testGetCount() {
		int[] data = {56,2, 8, 6, 6, 26};
		int expected = 2;
		assertEquals(expected, ArrayUtil.getCount(data, 6));
		assertEquals(1, ArrayUtil.getCount(data, 56));
		assertEquals(0, ArrayUtil.getCount(data, 454));
	}

	@Test
	public void testSort() {
		int[] data = {4, 5, 1, 6};
		int[] expected = { 1, 4, 5, 6};
		ArrayUtil.sort(data);
		assertArrayEquals(expected, data);
		
	}

}
