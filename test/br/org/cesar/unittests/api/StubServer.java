package br.org.cesar.unittests.api;

public class StubServer implements Server {

	private final int[] stubResult = {10,30};
	private boolean isError = false;
	
	public StubServer(boolean hasError) {
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
