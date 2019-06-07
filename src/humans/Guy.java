package humans;

import physique.Body;
import religion.Religions;

public class Guy extends Humans {

	

	public Guy(Religions rg, Color c, HumanBehavior bv, Body bd) {
		super(rg, c, bv, bd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Guy "+super.toString();
	}

}
