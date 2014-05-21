package br.org.cesar.unittests.api;

import static org.junit.Assert.*;

public class StubOnErrorApiConsumerListener implements ApiConsumerListener {

	@Override
	public void onSuccess(int result) {
		fail("Server is down but onSuccess is being called");
	}

	@Override
	public void onError(String msg) {
		assertTrue(msg, true);
	}

}
