package br.org.cesar.unittests.api;

import static org.junit.Assert.*;

public class ApiConsumerListenerStub implements ApiConsumerListener {

	private final int mExpectedResultForSuccess;
	
	public ApiConsumerListenerStub(int expectedResult) {
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
