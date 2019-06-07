package humans;

import physique.Body;
import religion.Religions;
//possible Humans<A,B,C....>
public abstract class Humans{
	public Color color;
	public Religions religion;
	public HumanBehavior behave;
	public Body body;
	public Humans(Religions rg, Color c, HumanBehavior bv,Body bd) {
		this.religion=rg;
		this.color=c;
		this.behave=bv;
		this.body=bd;
	}
	@Override
	public String toString() {
		return "Humans [color=" + color + ", religion=" + religion + ", behave=" + behave + ", body=" + body + "]";
	}	
}
