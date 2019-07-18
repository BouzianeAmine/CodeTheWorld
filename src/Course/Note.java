package Course;

import java.util.ArrayList;

import observation.IObservable;
import observation.IObserver;

public class Note implements IObservable{
	public String name;
	public String text;
	private ArrayList<IObserver> observers;
	
	public Note(String name,String text) {
		this.name=name;
		this.text=text;
		 observers=new ArrayList<IObserver>();
	}
	public Note() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Note : name=" + name + ", \n"
				+ "text=" + text + "]";
	}
	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		this.observers.stream().forEach(observer->{
			observer.update();
		});
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
	
	
}
