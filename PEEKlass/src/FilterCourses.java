import java.util.HashMap;

//filter depending on the boolean values taken from the GUI
public class FilterCourses {
	
	AllCourses allC= new AllCourses();
	HashMap<CourseNum, Course> coursesMap = new HashMap<CourseNum, Course>();
	HashMap<CourseNum, Course> newMap = new HashMap<CourseNum, Course>();
	CourseSelectionPage cp = new CourseSelectionPage();
	private boolean[] valueGUI;
	People people = new People();
	Person anthony;
	private boolean[] MW = {true, false, true, false, false};
	private boolean[] TTHU = {false, true, false, true, false};

	//constructor
	public FilterCourses(){
		
		coursesMap = allC.getAllCourses();
		//get boolean array size of 5
		valueGUI = cp.getFilterValues();
		
		anthony= people.getAnthony();
				
	}
	
	//add person to parameter to not hard code 
	public HashMap<CourseNum, Course> filterAll(){
		
		filterMajor(anthony);
		filterDay(anthony);
		filterNotTaken(anthony);
		filterMeetsReq(anthony);
		
		return newMap;
	}
	
	private void filterMajor(Person person){
		
		if (valueGUI[0] == true){
			
			//iterate coursesMap if any of the majors is equal to amy.getMajor() 
			
		        //3 differents way to iterate over the map
		        for (CourseNum key : coursesMap.keySet()){
		            //iterate over key
		        		if (key.getMajor() == anthony.getMajor()){
		        			newMap.put(key,coursesMap.get(key));
		        		}
		        }
		}
	}
	
	private void filterDay(Person person){
		
		if ( !valueGUI[1]){
			//if it's not MW class, delete MW classes
			for (CourseNum key: coursesMap.keySet()){
				
				if (coursesMap.get(key).getDay() == MW){
					newMap.remove(key);
				}
			}
		}
		
		if (!valueGUI[2]){	
			//if it's not TTHU class, delete TTHU classes
			for (CourseNum key: coursesMap.keySet()){
				
				if (coursesMap.get(key).getDay() == TTHU){
					newMap.remove(key);
				}
			}
		} 
	}
	
	private void filterNotTaken(Person person){
		
		if (valueGUI[3]){
			//go through taken courses
			for (CourseNum key: person.getCoursesTaken().keySet()){
				{
					//if the key is the same
					if (newMap.containsKey(key)){
						//delete it
						newMap.remove(key);
					}
				}
			}
		}
	}
	
	private void filterMeetsReq(Person person){
		
		if (!valueGUI[4]){
			
		}
	}
	
}
