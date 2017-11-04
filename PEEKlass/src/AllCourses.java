import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.time.*;

public class AllCourses {
	
	HashMap<CourseNum, Course> allCourses = new HashMap<CourseNum, Course>();
	
	LocalTime startTime = LocalTime.parse("11:00");
	LocalTime endTime = LocalTime.parse("12:00");
	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH : MM - HH : MM");
	Major cs = new COMPSCI();
	
	public AllCourses(){
		
		
			//CourseNum courseNum, String courseName, CourseNum prereq, DateTimeFormatter time, boolean[] day
			addCourses();
		
	}

	public void addCourses(){

		CourseNum com121 = new CourseNum(  cs, 121);
		Course course121 = new Course(com121, "Intro to CS", null, startTime, endTime, monWedFri()  );
		allCourses.put(com121,  course121);
		
	}
	
	public boolean[] monWedFri(){
	
		boolean[] days = {true, false, true, false, true};
		return days;
	}
	
	public boolean[] TueThur(){
		
		boolean[] days = new boolean[5];
		
		days[0] = false;
        days[1] = true;
        days[2] = false;
        days[3] = true;
        days[4] = false;
		
		return days;
	}
	
}
