package code852024;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMathUtilt {
	@Test
	void testTimSoNguyen()
	{
		int x = MathUtil.timSoNguyen(6.5);
		assertEquals(x, 6);
	}
	@Test
	void testTinhLuyThua()
	{
		int x = MathUtil.tinhLuyThua(2,5);
		assertEquals(x, 32);
	}

}
