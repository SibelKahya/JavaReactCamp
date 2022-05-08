package Kodlamaio.HrmsProject2.core.utilities.result;

import java.util.List;

import Kodlamaio.HrmsProject2.entities.concretes.Candidate;

public class SuccesDataResult<T> extends DataResult<T> {

	public SuccesDataResult(T data, String message) {
		super(data, true, message);
		
	}
	/*
	 * public SuccesDataResult(List<Candidate> list) { super(list, true); }
	 */
	
	public SuccesDataResult(String message) {
		super(null,false,message);
		
	}
	
	public SuccesDataResult() {
		super(null,true);
	}
	public SuccesDataResult(T data) {
		super(data, true);
	}

}
