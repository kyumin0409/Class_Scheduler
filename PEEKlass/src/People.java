import java.util.HashMap;

public class People {
	
	private AllCourses ac = new AllCourses();
	private HashMap<CourseNum,Course> coursesAll;
	private HashMap<CourseNum,Course> coursesTakenAnthony = new HashMap<CourseNum,Course>();
	private HashMap<CourseNum,Course> coursesToTakeAnthony = new HashMap<CourseNum,Course>();
	
	Major cs = new COMPSCI();
	Major math = new MATH();

	Person anthony;
	
	public People(){

		coursesAll = ac.getAllCourses();
		anthony = new Person(cs, coursesTakenAnthony, coursesToTakeAnthony);
	}

	
	public Person getAnthony(){
		return anthony;
	}
	
	public void addCoursesTaken(){
		coursesTakenAnthony.put(ac.getCS121().getCourseNum(), ac.getCS121());
		coursesTakenAnthony.put(ac.getCS187().getCourseNum(), ac.getCS187());
		coursesTakenAnthony.put(ac.getCS311().getCourseNum(), ac.getCS311());
<<<<<<< HEAD
		
=======

>>>>>>> origin/master
	}
}
