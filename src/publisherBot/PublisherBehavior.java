package publisherBot;

public interface PublisherBehavior {
	public void publish(Message<?> value) ;
	public Message<?> getMessage();
}
