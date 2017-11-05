import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.*;

public class AllCourses {
	
	HashMap<CourseNum, Course> allCourses = new HashMap<CourseNum, Course>();
	
	Course math131;
	Course math132;
	Course math233;
	Course math235;
	Course math331;

	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH : MM - HH : MM");
	COMPSCI cs = new COMPSCI();
	Major math = new MATH();

	
	public AllCourses(){
			//CourseNum courseNum, String courseName, CourseNum prereq, DateTimeFormatter time, boolean[] day
			addCourses();
	}
	
	public HashMap<CourseNum, Course> getAllCourses(){
		
		return allCourses;
	}

	public void addCourses(){

		allCourses.put(cs.getCS121().getCourseNum(),  cs.getCS121());
		allCourses.put(cs.getCS187().getCourseNum(),  cs.getCS187());
		allCourses.put(cs.getCS311().getCourseNum(),  cs.getCS311());
		allCourses.put(cs.getCS326().getCourseNum(),  cs.getCS326());
		allCourses.put(cs.getCS345().getCourseNum(),  cs.getCS345());
		allCourses.put(cs.getCS377().getCourseNum(),  cs.getCS377());
		
		//Math Courses
		allCourses.put(maNum131,  math131);
		allCourses.put(maNum132,  math132);
		allCourses.put(maNum233,  math233);
		allCourses.put(maNum235,  math235);
		allCourses.put(maNum331,  math331);
	}
	
	
	public ArrayList<CourseNum> iterateMap(){
		
		ArrayList<CourseNum> result = new ArrayList<CourseNum>();
		
		for (CourseNum key: allCourses.keySet()){
			result.add(key);
		}
		
		return result;
	}

	
	public Course getMath131(){
		return math131;
	}
	
	public Course getMath132(){
		return math132;
	}
	
	public Course getMath233(){
		return math233;
	}
	
	public Course getMath235(){
		return math235;
	}
	
	public Course getMath331(){
		return math331;
	}
	
}
