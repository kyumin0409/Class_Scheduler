import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.*;

public class AllCourses {
	
	HashMap<CourseNum, Course> allCourses = new HashMap<CourseNum, Course>();

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
		allCourses.put(math.getMath131().getCourseNum(), math.getMath131());
		allCourses.put(math.getMath132().getCourseNum(), math.getMath132());
		allCourses.put(math.getMath233().getCourseNum(), math.getMath233());
		allCourses.put(math.getMath235().getCourseNum(), math.getMath235());
		allCourses.put(math.getMath331().getCourseNum(), math.getMath331());
	}
	
	
	public ArrayList<CourseNum> iterateMap(){
		
		ArrayList<CourseNum> result = new ArrayList<CourseNum>();
		
		for (CourseNum key: allCourses.keySet()){
			result.add(key);
		}
		
		return result;
	}
	
}
