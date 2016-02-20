package ua.itstep.work;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.logging.Logger;

public class TestClass {
	
	Calc c = null;
	Logger log = Logger.getLogger(TestClass.class.getName());
	
	@Before
	public void initial() {
		c = new Calc();
		log.info("init good");
	}
	
	@Test
	public void testAdd() {
//		assertTrue("Right", , ));
		assertFalse("fdsfds", 67==c.add(2, 5));
	}

	@Test
	public void testDiv() {
		assertTrue(2==c.div(10, 5));
	}

	// ver 4
	@Test(expected = Exception.class)
	public void testDivZero() {
		c.div(10, 1);
	}
	
	// ver 3
		@Test
		public void testDivZeroVer3() {
			try {
			c.div(10, 1);
			System.out.println("Here is error");
		} catch (Exception e) {}
		}	
}