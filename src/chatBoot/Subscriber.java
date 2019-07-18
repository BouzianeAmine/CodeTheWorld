package chatBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subscriber implements SubscriberBehavior{
	private ArrayList<PublisherBehavior> publishers; 
	
	public Subscriber() {
		publishers=new ArrayList<PublisherBehavior>();
	}
	public void subscribe(PublisherBehavior pub) {
		// TODO Auto-generated method stub
		publishers.add(pub);
	}

	@Override
	public Message receive(PublisherBehavior pub) {
		// TODO Auto-generated method stub
		return pub.getMessage();
	}

	@Override
	public List<Message> receive(){
		// TODO Auto-generated method stub
		return publishers.stream().map((PublisherBehavior pub)->pub.getMessage()).collect(Collectors.toList());
	}

}
