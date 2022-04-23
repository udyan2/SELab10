package jUnitTestngPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring= new jUnitFunctions();
		String result=junitstring.addstring("software","development");
		assertEquals("softwaredevelopment",result);
	}
	@Test
	public void test2() {
		jUnitFunctions junitstring= new jUnitFunctions();
		String result=junitstring.addstring("software","testing");
		assertEquals("softwaretesting",result);
	}

}
