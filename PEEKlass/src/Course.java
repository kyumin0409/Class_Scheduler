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
	private LocalTime startTime;
	
	private LocalTime endTime;
	
	//M,T,W,Th,F boolean array: true if any of these days are class day
	private boolean[] day;
	
	public Course(CourseNum courseNum, String courseName, CourseNum prereq, LocalTime startTime, LocalTime endTime, boolean[] day){
		
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.prereq = prereq;
		this.startTime = startTime;
		this.endTime = endTime;
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
	
	public LocalTime getStartTime(){
		
		return startTime;
	}
	
	public LocalTime getEndTime(){
		return endTime;
	}
	
	public boolean[] getDay(){
		
		return this.day;
		
	}
	
	public boolean getIsCore(){
		
		return isCore;
	}
	
	public CourseNum getPreReq(){
		
		return prereq;
	}
}
