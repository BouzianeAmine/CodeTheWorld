package Course;

import java.util.ArrayList;

public class Course extends Module{
	public String name;
	public ArrayList<Session> sessions;
	
	public Course(String name,Session session) {
		this.name=name;
		sessions=new ArrayList<Session>();
		sessions.add(session);
	}
	public String getName() {
		return super.getName()+"."+this.name;
	}
	
}
