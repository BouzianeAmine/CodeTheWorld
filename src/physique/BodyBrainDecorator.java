package physique;

import observation.IObserver;

public class BodyBrainDecorator implements IObserver,IControl{
	public BodyDecorator body;
	public BodyBrainDecorator(BodyDecorator bdeye) {
		this.body=bdeye;
		this.body.add(this);
	}
	public void commandOn() {
		this.body.action();
		this.body.Notify();
	}
	
	public void commandOff() {
		this.body.unaction();
		this.body.Notify();
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.body.getState());
	}

}
