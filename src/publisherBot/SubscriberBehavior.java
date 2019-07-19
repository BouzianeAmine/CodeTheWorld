package publisherBot;

import java.util.List;

public interface SubscriberBehavior {
	public void subscribe(PublisherBehavior pub);
	public Message<?> receive(PublisherBehavior pub);
	public  List<Message> receive();
}
