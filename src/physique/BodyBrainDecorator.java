package physique;

import observation.IObserver;

public class BodyBrainDecorator implements IObserver,IControl{
	public BodyDecorator body;
	public BodyBrainDecorator(BodyDecorator bdeye) {
		this.body=bdeye;
		this.body.add(this);
	}

	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.body.getState());
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		this.body.action();
		this.body.Notify();
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		this.body.unaction();
		this.body.Notify();
	}

}
