package testing;

import humans.Color;
import humans.Guy;
import humans.HumanSportsBehavior;
import humans.Humans;
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
	}

}
