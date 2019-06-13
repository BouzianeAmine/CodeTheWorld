package physique;

import java.util.ArrayList;

import observation.IObservable;
import observation.IObserver;

//import javafx.collections.ObservableList;

public class BodyEyeDecorator implements BodyDecorator,IObservable {
	public Body body; // i should make a list to add the parts of the body but not, here i should just add this actual part
	public ArrayList<IObserver> observers;
	public String state;
	//public ObservableList<BodyDecorator> parts;
	public BodyBrainDecorator brain;
	public BodyEyeDecorator (Body bd) {
		//this.parts.add(this);
		this.body=bd;
		//this.parts.add((BodyDecorator) bd);
		observers=new ArrayList<IObserver>();
		state="Closed";
	}
	@Override
	public String shape() {
		// TODO Auto-generated method stub
		return this.body.shape()+" Eye";
		
	}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		state="Opened";
	}
	@Override
	public void unaction() {
		// TODO Auto-generated method stub
		state="Closed";
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

	public String getState() {
		return state;
	}
}
