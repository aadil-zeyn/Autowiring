package autowiring;

public class SMSServices implements MessageServices {

	public void sentmessage(String message) {
		System.out.println("SMS service : "+message);
		
	}

}
