package br.org.cesar.unittests.api;

public class MyApiConsumer {

	private Server mServer;

	public MyApiConsumer(Server server) {
		mServer = server;
	}

	public void sumAtoB(final ApiConsumerListener l) {
		mServer.getNumbers(new ResultListener() {

			@Override
			public void onSuccess(int[] n) {
				l.onSuccess(n[0] + n[1]);
			}

			@Override
			public void onError(String msg) {
				l.onError(msg);
			}
		});
	}

	public void subtractAfromB(final ApiConsumerListener l) {
		mServer.getNumbers(new ResultListener() {

			@Override
			public void onSuccess(int[] n) {
				l.onSuccess(n[1] - n[0]);
			}

			@Override
			public void onError(String msg) {

			}
		});
	}
}
