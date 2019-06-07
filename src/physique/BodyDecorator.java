package physique;

public interface BodyDecorator extends Body {

	@Override
	public abstract String shape();

	
	public abstract void action(); // why i added this so i can define a action as command pattern so each bodydecorator have its on action or actions
	
}
