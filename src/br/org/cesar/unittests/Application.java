package br.org.cesar.unittests;

import br.org.cesar.unittests.api.ApiConsumerListener;
import br.org.cesar.unittests.api.MyApiConsumer;
import br.org.cesar.unittests.api.ProductionServer;

public class Application {

	public static void main(String[] args) {

		MyApiConsumer api = new MyApiConsumer(new ProductionServer());

		System.out.println("Calling sumAtoB method");
		api.sumAtoB(new ApiConsumerListener() {

			@Override
			public void onSuccess(int result) {
				System.out.println("A + B = " + result);
			}

			@Override
			public void onError(String msg) {
				System.out.println(msg);
			}
		});
		System.out.println("Calling subtractAfromB method");
		api.subtractAfromB(new ApiConsumerListener() {

			@Override
			public void onSuccess(int result) {
				System.out.println("B - A = " + result);
			}

			@Override
			public void onError(String msg) {
				System.out.println(msg);

			}
		});
	}
}
