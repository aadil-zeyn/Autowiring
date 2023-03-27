package autowiring;

public class EmailService implements MessageServices {

	public void sentmessage(String message) {
		System.out.println("Email service : "+message);
	}

}
