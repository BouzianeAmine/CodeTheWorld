package testing;

import Course.Course;
import Course.Module;
import Course.Note;
import Course.Session;
import chatBoot.Message;
import chatBoot.Publisher;
import chatBoot.Subscriber;
import chatBoot.TextMessage;
import humans.Color;
import humans.Guy;
import humans.HumanSportsBehavior;
import humans.Humans;
import physique.BodyBrainDecorator;
import physique.BodyDecorator;
import physique.BodyEyeDecorator;
import physique.GuyBody;
import religion.Islam;

public class Main {

	public static void main(String[] args) {
		//Design pattern (for the religion and humans aspect)and decorater pattern(for the physique aspect), and for the testing i'm going to use factory pattern and do a UI.
		Humans amine=new Guy(new Islam(),Color.Brown,new HumanSportsBehavior(),new BodyEyeDecorator(new BodyEyeDecorator(new GuyBody())));
		//System.out.println(amine);
		amine.religion.believe();
		System.out.println(amine.color);
		((HumanSportsBehavior) amine.behave).running();
		System.out.println(amine.body.shape());
		/*IControl amineBodyControl=new Command((BodyDecorator) amine.body);
		amineBodyControl.on();
		amineBodyControl.stop();*/
		BodyBrainDecorator brain=new BodyBrainDecorator((BodyDecorator)amine.body);
		brain.on();
		brain.stop();
		//brain.update();
		
		Module math=new Course("Algebra",new Session(new Note("Morning session", "EDF IS A BITCH")));
		math.SetName("Math");
		((Course)math).sessions.add((new Session(new Note("3chia session","EDF IS ALWAYS A BITCH"))));
		((Course)math).sessions.stream().forEach(session->{
			((Session)session).notes.stream().forEach(note->{
				System.out.println(note.text);
			});
		});
		Subscriber sub1=new Subscriber();
		sub1.subscribe(Publisher.getInstance());
		Publisher.getInstance().publish(new TextMessage("hello"));
		sub1.receive().stream().forEach(message->System.out.println(message.value()));
		Publisher.getInstance().publish(new TextMessage("world !!"));
		sub1.receive().stream().forEach(message->System.out.println(message.value()));
	}

}
