package physique;

public class Command implements IControl{
	BodyDecorator body;
	public Command(BodyDecorator bd) {
		this.body=bd;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		this.body.action();
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}
