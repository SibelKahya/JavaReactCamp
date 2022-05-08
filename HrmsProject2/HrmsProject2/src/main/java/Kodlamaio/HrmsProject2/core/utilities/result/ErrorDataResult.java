package Kodlamaio.HrmsProject2.core.utilities.result;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, boolean succes, String message) {
		super(data, false, message);
		
	}
	public ErrorDataResult(T data) {
		super(data,true);
		
	}
	public ErrorDataResult(String message) {
		super(null,false,message);
	}
	public ErrorDataResult() {
		super(null,false);
	}

}
