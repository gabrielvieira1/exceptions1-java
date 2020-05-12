package model.exceptions;

//public class DomainException extends RuntimeException{
	public class DomainException extends Exception{
	private static final long serialversionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
