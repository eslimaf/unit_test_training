package br.org.cesar.unittests.api;

import static org.junit.Assert.*;

public class StubOnSuccessApiConsumerListener implements ApiConsumerListener {

	private final int mExpectedResultForSuccess;
	
	public StubOnSuccessApiConsumerListener(int expectedResult) {
		mExpectedResultForSuccess = expectedResult;
	}
	
	@Override
	public void onSuccess(int result) {
		assertEquals(mExpectedResultForSuccess, result);
	}

	@Override
	public void onError(String msg) {
		fail(msg);
	}

}
