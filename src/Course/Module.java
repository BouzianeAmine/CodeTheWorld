package Course;

import java.util.ArrayList;

public class Module {
	public String name;
	private ArrayList<Course> courses;
	
	public Module(String name, ArrayList<Course> courses) {
		this.name = name;
		this.courses = courses;
	}
	
	public Module() {}

	public void SetName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public void showCourses() {
		this.courses.forEach(el->{
			System.out.println(el);
		});
	}
	
	public ArrayList<Course> getCourses(){
		return this.courses;
	}
}
