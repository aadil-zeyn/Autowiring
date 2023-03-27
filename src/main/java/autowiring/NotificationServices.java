package autowiring;

public class NotificationServices {
	private MessageServices messageservices;
	
	public void setMessageservices(MessageServices messageservices) {
		this.messageservices = messageservices;
	}
	public void Notify() {
		messageservices.sentmessage("hey i am autowired");
	}

	
	
}
