package publisherBot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subscriber implements SubscriberBehavior{
	private ArrayList<PublisherBehavior> publishers; 
	
	public Subscriber() {
		publishers=new ArrayList<PublisherBehavior>();
	}
	public void subscribe(PublisherBehavior pub) {
		publishers.add(pub);
	}

	@Override
	public Message<?> receive(PublisherBehavior pub) {
		return pub.getMessage();
	}

	@Override
	public List<Message> receive(){
		return publishers.stream().map((PublisherBehavior pub)->pub.getMessage()).collect(Collectors.toList());
	}

}
