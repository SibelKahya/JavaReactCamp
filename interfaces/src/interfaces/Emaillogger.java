package interfaces;

public class Emaillogger implements Logger {
	
	@Override
	public void log(String message) {
		System.out.println("Email gönderildi :"+ message);
	}

}
