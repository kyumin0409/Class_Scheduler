import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//filter depending on the boolean values taken from the GUI
public class FilterCourses {

	AllCourses allC= new AllCourses();
	HashMap<CourseNum, Course> coursesMap = new HashMap<CourseNum, Course>();
	HashMap<CourseNum, Course> newMap = new HashMap<CourseNum, Course>();
	CourseSelectionPage cp;
	People people = new People();
	Person anthony;
	private static boolean[] MW = {true, false, true, false, false}; 
	private static boolean[] TTHU = {false, true, false, true, false};

	//constructor
	public FilterCourses(CourseSelectionPage cp){
		
		//initialize course map to get all courses
		coursesMap = allC.getAllCourses();
		//initialize the empty map
		newMap = new HashMap<CourseNum, Course>(); System.out.println("new map create: " + newMap);
		
		this.cp = cp;
		anthony= people.getAnthony();

	}

	//add person to parameter to not hard code 
	public HashMap<CourseNum, Course> filterAll(){
		
			filterMajor(anthony);
			filterDay(anthony);
			//filterNotTaken(anthony);
			//filterMeetsReq(anthony);
			
		return newMap;
	}

	private void filterMajor(Person person){
		
<<<<<<< HEAD
		System.out.println("major : " + cp.getFilterValues(0));
		
		if ( cp.getFilterValues(0) ){
=======
		if (!cp.getFilterValues(0)){
			newMap = coursesMap;
		}

		else{
			//iterate coursesMap if any of the majors is equal to amy.getMajor() 
>>>>>>> origin/master
			
		        //3 different ways to iterate over the map
		        for (CourseNum key : coursesMap.keySet()){
		            //iterate over key
		        		if (key.getMajor().getMajorName().equals(anthony.getMajor().getMajorName())){
		        			newMap.put(key,coursesMap.get(key));
		        		}
		        }
<<<<<<< HEAD
		}
		else{
			newMap = coursesMap;
=======
>>>>>>> origin/master
		}
	}

	private void filterDay(Person person){

<<<<<<< HEAD
//		if ( cp.getFilterValues(1) == false){
//			//if it's not MW class, delete MW classes
//			
//			Iterator it = coursesMap.entrySet().iterator();
//			while (it.hasNext()){
//				
//				Map.Entry pair = (Map.Entry) it.next();
//				boolean[] array = ((Course) pair.getValue()).getDay();
//				if (Arrays.equals(array, MW)){
//					System.out.println("remove");
//					it.remove();
		//Maps need to be removed differently
//				}
//			}
//			for (CourseNum key: coursesMap.keySet()){
//				
//				
//			}
//		}

		System.out.println("TTHU: " + cp.getFilterValues(2));
	
		if ( !cp.getFilterValues(2)){	
=======
		if ( !cp.getFilterValues(1)){
			//if it's not MW class, delete MW classes
			for (CourseNum key: coursesMap.keySet()){

				if (coursesMap.get(key).getDay() == MW){
					newMap.remove(key);
				}
			}
		}
		if (!cp.getFilterValues(2)){	
>>>>>>> origin/master
			//if it's not TTHU class, delete TTHU classes
			for (CourseNum key: coursesMap.keySet()){

				if (Arrays.equals(coursesMap.get(key).getDay(), TTHU)){
					System.out.println("remove TTHU");
					newMap.remove(key);
				}
			}
		}
	}

	private void filterNotTaken(Person person){
		

		System.out.println("not taken: " + cp.getFilterValues(3));

		if (cp.getFilterValues(3)){
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
		
		System.out.println("filter req: "+ cp.getFilterValues(4));

		if (cp.getFilterValues(4)){
			for (CourseNum key: newMap.keySet()){
				CourseNum prereq = newMap.get(key).getPreReq();
				if(!(person.getCoursesTaken().containsKey(prereq))){
					newMap.remove(key);
				}
			}
		}
	}
	
	public void removeAll(){
		newMap = new HashMap<CourseNum, Course>();
	}

}
