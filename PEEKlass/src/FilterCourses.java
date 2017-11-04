import java.util.HashMap;

//filter depending on the boolean values taken from the GUI
public class FilterCourses {
	
	AllCourses allC= new AllCourses();
	HashMap<CourseNum, Course> coursesMap = new HashMap<CourseNum, Course>();
	HashMap<CourseNum, Course> newMap = new HashMap<CourseNum, Course>();
	private boolean[] valueGUI = new boolean[5];

	//constructor
	public FilterCourses(){
		
		coursesMap = allC.getAllCourses();
		//get boolean array size of 5
		
	}
	
	public void filterMajor(){
		
		if (valueGUI[0] ==true){
			//coursesMap.
		}
	}
	
	public void filterMW(){
		
	}
	
	public void filterTTH(){
		
	}
	
	public void filterNotTaken(){
		
	}
	
	public void filterMeetsReq(){
		
	}
	
}
