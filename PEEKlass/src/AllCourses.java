import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.time.*;

public class AllCourses {
	
	HashMap<CourseNum, Course> allCourses = new HashMap<CourseNum, Course>();
	
	LocalTime time09 = LocalTime.parse("9:00");
	LocalTime time10 = LocalTime.parse("10:00");
	LocalTime time11 = LocalTime.parse("11:00");
	LocalTime time12 = LocalTime.parse("12:00");
	LocalTime time13 = LocalTime.parse("13:00");
	LocalTime time14 = LocalTime.parse("14:00");
	LocalTime time15 = LocalTime.parse("15:00");
	LocalTime time16 = LocalTime.parse("16:00");
	LocalTime time17 = LocalTime.parse("17:00");
	
	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH : MM - HH : MM");
	Major cs = new COMPSCI();
	
	Major math = new Math();

	
	public AllCourses(){
			//CourseNum courseNum, String courseName, CourseNum prereq, DateTimeFormatter time, boolean[] day
			addCourses();
	}

	public void addCourses(){
		
		//Computer Science Courses
		CourseNum csNum121 = new CourseNum(cs, 121);
		Course cs121 = new Course(csNum121, "Intro to CS", null, time11, time12, TTH() );
		allCourses.put(csNum121,  cs121);
		
		CourseNum csNum187 = new CourseNum(cs, 187);
		Course cs187 = new Course(csNum187 , "Data Structures", csNum121, time14, time15, TTH() );
		allCourses.put(csNum187,  cs187);
		
		CourseNum csNum311 = new CourseNum(cs, 311);
		Course cs311 = new Course(csNum311, "Algorithms", csNum311, time16, time17, MW() );
		allCourses.put(csNum311, cs311);
		
		CourseNum csNum326 = new CourseNum(cs, 326);
		Course cs326 = new Course(csNum326, "Web Programming", csNum187, time16, time17, TTH() );
		allCourses.put(csNum326,  cs326);
		
		CourseNum csNum345 = new CourseNum(cs, 345);
		Course cs345 = new Course(csNum345, "Data Management", csNum311, time10, time11, MW() );
		allCourses.put(csNum345,  cs345);
		
		CourseNum csNum377 = new CourseNum(cs, 377);
		Course cs377 = new Course(csNum377, "Operating Systems", csNum326, time13, time14, TTH() );
		allCourses.put(csNum377,  cs377);
		
		//Math Courses
		CourseNum maNum131 = new CourseNum(math, 131);
		Course math131 = new Course(maNum131, "Calc 1", null, time14, time15, TTH() );
		allCourses.put(maNum131,  math131);
		
		CourseNum maNum132 = new CourseNum(math, 132);
		Course math132 = new Course(maNum132, "Calc 2", maNum131, time10, time11, MW() );
		allCourses.put(maNum132,  math132);
		
		CourseNum maNum233 = new CourseNum(math, 233);
		Course math233 = new Course(maNum233, "Multivariate Calc", maNum132, time11, time12, TTH() );
		allCourses.put(maNum233,  math233);
		
		CourseNum maNum235 = new CourseNum(math, 235);
		Course math235 = new Course(maNum235, "Linear Algebra", null, time13, time14, MW() );
		allCourses.put(maNum235,  math235);
		
		CourseNum maNum331 = new CourseNum(math, 331);
		Course math331 = new Course(maNum331, "Ordinary Differential Equations ", null, time10, time11, MW() );
		allCourses.put(maNum331,  math331);
		//
	}
	
	public boolean[] MW(){
		boolean[] days = {true, false, true, false, false};
		return days;
	}
	
	public boolean[] TTH(){		
		boolean[] days = {false, true, false, true, false};
		return days;

	}
}
