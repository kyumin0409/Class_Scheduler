import java.util.HashMap;

//filter depending on the boolean values taken from the GUI
public class FilterCourses {
	
	AllCourses allC= new AllCourses();
	HashMap<CourseNum, Course> coursesMap = new HashMap<CourseNum, Course>();
	HashMap<CourseNum, Course> newMap = new HashMap<CourseNum, Course>();
	CourseSelectionPage cp = new CourseSelectionPage();
	private boolean[] valueGUI;
	//People people;

	//constructor
	public FilterCourses(){
		
		coursesMap = allC.getAllCourses();
		//get boolean array size of 5
		valueGUI = cp.getFilterValues();
		//Person amy= people.getAmy();
		
	}
	
	public void filterMajor(){
		
		if (valueGUI[0] ==true){
			
			//iterate coursesMap if any of the majors is equal to amy.getMajor() 
			
		        //3 differents way to iterate over the map
		        for (CourseNum key : coursesMap.keySet()){
		            //iterate over key
		        		//if (key.getMajor() == amy.getMajor){
		        		//newMap.put(key.getCourseNum(),courseMap.get(key);
		        		//}
		        	
		        		
		           //key: key
		        	   //value: coursesMap.get(key));
		        }
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
