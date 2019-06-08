package physique;

import observation.IObserver;

//import javafx.collections.ObservableList;

public class BodyEyeDecorator implements BodyDecorator,IObserver {
	public Body body;
	//public ObservableList<BodyDecorator> parts;
	public BodyBrainDecorator brain;
	public BodyEyeDecorator (Body bd) {
		//this.parts.add(this);
		this.body=bd;
		//this.parts.add((BodyDecorator) bd);
	}
	@Override
	public String shape() {
		// TODO Auto-generated method stub
		return this.body.shape()+" Eye";
		
	}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Open eye");
	}
	@Override
	public void unaction() {
		// TODO Auto-generated method stub
		System.out.println("Close eye");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		//this.brain.setCommand(decobd);
	}

}
