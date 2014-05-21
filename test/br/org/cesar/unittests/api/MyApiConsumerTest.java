package br.org.cesar.unittests.api;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyApiConsumerTest {

	private MyApiConsumer api;
	private MyApiConsumer apiDown;
	
	@Before
	public void setUp() throws Exception {
		
		api = new MyApiConsumer(new StubServer(false));
		apiDown = new MyApiConsumer(new StubServer(true));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMyApiConsumer() {
		assertNotNull(new MyApiConsumer(new StubServer(false)));
	}

	@Test
	public void testSumAtoB() {
		int expectedResult = 40;
		api.sumAtoB(new StubOnSuccessApiConsumerListener(expectedResult));
	}

	@Test
	public void testSubtractAfromB() {
		int expectedResult = 20;
		api.subtractAfromB(new StubOnSuccessApiConsumerListener(expectedResult));
	}
	
	@Test
	public void testSumAtoBWhenServerisDown(){
		apiDown.sumAtoB(new StubOnErrorApiConsumerListener());
	}
	
	@Test
	public void testSubtractAfromBWhenServerisDown(){
		apiDown.sumAtoB(new StubOnErrorApiConsumerListener());
	}

}
