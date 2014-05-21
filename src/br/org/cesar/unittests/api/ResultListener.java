package br.org.cesar.unittests.api;

public interface ResultListener {
	public void onSuccess(int[] n);
	public void onError(String msg);
}
