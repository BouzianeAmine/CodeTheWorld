package observation;

public interface IObservable {
	public void Notify();
	public void remove(IObserver e);
	public void add(IObserver e);
}
