package br.org.cesar.unittests.api;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyApiConsumerTest {

	private ApiConsumerListener stubConsumerListener;
	private Server stubServer;
	
	@Before
	public void setUp() throws Exception {
		stubConsumerListener = new ApiConsumerListenerStub(150);
		stubServer = new ServerStub(false);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMyApiConsumer() {
		
		assertNotNull(new MyApiConsumer(stubServer));
	}

	@Test
	public void testSumAtoB() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtractAfromB() {
		fail("Not yet implemented");
	}

}
