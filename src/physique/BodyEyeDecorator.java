package physique;

public class BodyEyeDecorator implements BodyDecorator {
	public Body body;
	public BodyEyeDecorator (Body bd) {
		this.body=bd;
	}
	@Override
	public String shape() {
		// TODO Auto-generated method stub
		return this.body.shape()+" Eye";
		
	}

}
