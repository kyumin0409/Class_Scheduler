
public class CourseNum {
	
	Major department;
	int courseNumber;
	
	public CourseNum(Major department, int courseNumber){
		
		this.department = department;
		this.courseNumber = courseNumber;
		
	}

	public Major getMajor(){
		
		return department;
	}

	public int getCourseNum(){
		
		return courseNumber;
	}
	
	public String deptoString(){
		
		return department.getMajorName();
	}
	
	public String courseNumToString(){
		
		return Integer.toString(courseNumber);
	}
}
