package physique;

import java.util.ArrayList;

import observation.IObservable;
import observation.IObserver;

public class BodyBrainDecorator implements BodyDecorator,IObservable{
	Body body;
	ArrayList<IObserver> observers;
	public BodyBrainDecorator(Body bd) {
		this.body=bd;
		observers=new ArrayList<IObserver>();
	}
	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		this.observers.stream().forEach(observer->{
			observer.update();
		});;
	}

	@Override
	public void remove(IObserver e) {
		// TODO Auto-generated method stub
		this.observers.remove(e);
	}

	@Override
	public void add(IObserver e) {
		// TODO Auto-generated method stub
		this.observers.add(e);
	}

	@Override
	public String shape() {
		// TODO Auto-generated method stub
		return this.body.shape()+" Brain";
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unaction() {
		// TODO Auto-generated method stub
		
	}
	
	public void setCommand(IControl decobd) {
		decobd.on();
	}

}
