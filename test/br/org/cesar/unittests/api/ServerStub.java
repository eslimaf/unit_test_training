package br.org.cesar.unittests.api;

public class ServerStub implements Server {

	private final int[] stubResult = {10,30};
	private boolean isError = false;
	
	public ServerStub(boolean hasError) {
		isError = hasError; 
	}
	
	@Override
	public void getNumbers(ResultListener l) {
		if(!isError){
			l.onSuccess(stubResult);
		} else {
			l.onError("Stub server is returning error");
		}
	}

}
