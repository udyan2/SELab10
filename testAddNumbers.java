package jUnitTestngPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit=new jUnitFunctions();
		int result=junit.addnum(40, 50);
		assertEquals(90, result);
	}
	@Test
	public void test2() {
		jUnitFunctions junit=new jUnitFunctions();
		int result=junit.addnum(60, 20);
		assertEquals(80, result);
	}

}
