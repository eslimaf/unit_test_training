package br.org.cesar.unittests.api;

public class ProductionServer implements Server {

	private static final String SERVER_URL = "http://www.myapi.com/api/v1";
	// This is for demonstration proposes only
	private static final int NUMBER_A = 150;
	private static final int NUMBER_B = 200;

	@Override
	public void getNumbers(final ResultListener l) {
		// This thread sleep will simulate latency
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println("Requesting " + SERVER_URL
							+ "/getNumberA");
					Thread.sleep(2000);
					System.out.println("RESULT: 200 OK");
					System.out.println("{number:[" + NUMBER_A + "," + NUMBER_B + "]}");
					int[] res = {NUMBER_A,NUMBER_B};
					l.onSuccess(res);
				} catch (InterruptedException e) {
					e.printStackTrace();
					l.onError("Unexpected server error");
				}
			}
		}).start();
	}

}
