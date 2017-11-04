import java.lang.Object;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Course {
	
	//department, 
	private CourseNum courseNum;
	private String courseName;
	
	//pre requisite class
	private CourseNum prereq;
	
	//meets this requirement
	private boolean isCore; //check in the Major Class
	
	//class time
	private DateTimeFormatter time;
	
	//M,T,W,Th,F boolean array: true if any of these days are class day
	private boolean[] day = new boolean[5];
	
	public Course(CourseNum courseNum, String courseName, CourseNum prereq, LocalTime startTime, LocalTime endTime, boolean[] day){
		
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.prereq = prereq;
		this.time = time;
		this.day = day;
		
		setIsCore();
		
	}

	public void setIsCore(){
		
		//this.isCore = courseNum.getMajor().isCore();
	}
	
	public CourseNum getCourseNum(){
		
		return courseNum;
	}
	
	public String getCourseName(){
		
		return courseName;
	}
	
	public DateTimeFormatter getTime(){
		
		return time;
	}
	
	public boolean[] getDay(){
		
		return day;
	}
	
	public boolean getIsCore(){
		
		return isCore;
	}
}
