package chatBoot;

import java.util.ArrayList;

public class Publisher implements PublisherBehavior{
	private Message message=null;
    private static volatile Publisher instance = null;

	private Publisher() {}
	
	public final static Publisher getInstance() {
		if (Publisher.instance == null) {
            // Le mot-cl� synchronized sur ce bloc emp�che toute instanciation
            // multiple m�me par diff�rents "threads".
            // Il est TRES important.
            synchronized(Publisher.class) {
              if (Publisher.instance == null) {
            	  Publisher.instance = new Publisher();
              }
            }
         }
         return Publisher.instance;
	}
	
	public void publish(Message value) {
		this.message=value;
	}

	@Override
	public Message getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}
