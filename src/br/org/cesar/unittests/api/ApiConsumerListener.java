package br.org.cesar.unittests.api;

public interface ApiConsumerListener {
	public void onSuccess(int result);
	public void onError(String msg);
}
