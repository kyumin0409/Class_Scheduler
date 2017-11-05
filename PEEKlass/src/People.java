import java.util.HashMap;

public class People {
	
	//private AllCourses ac = new AllCourses();
	private HashMap<CourseNum,Course> coursesAll;
	private HashMap<CourseNum,Course> coursesTakenAnthony = new HashMap<CourseNum,Course>();
	private HashMap<CourseNum,Course> coursesToTakeAnthony = new HashMap<CourseNum,Course>();
	
	COMPSCI cs = new COMPSCI();
	MATH math = new MATH();

	Person anthony;
	
	public People(){

		//coursesAll = ac.getAllCourses();
		anthony = new Person(cs, coursesTakenAnthony, coursesToTakeAnthony);
	}

	
	public Person getAnthony(){
		return anthony;
	}
	
	public void addCoursesTaken(){
		coursesTakenAnthony.put(cs.getCS121().getCourseNum(), cs.getCS121());
		coursesTakenAnthony.put(cs.getCS187().getCourseNum(), cs.getCS187());
		coursesTakenAnthony.put(cs.getCS311().getCourseNum(), cs.getCS311());

	}
}
