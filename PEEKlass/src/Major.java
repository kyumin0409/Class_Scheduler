import java.util.ArrayList;

public abstract class Major {
	
	//core class list
	protected ArrayList<Course> coreList = new ArrayList<Course>();
	
	//elective class list
	protected ArrayList<Course> electiveList = new ArrayList<Course>();
	
	boolean isCore(){
		
		//iterate through the core list and if there's one, return true
		//otherwise, return false;
		
		return false;
	}
	
}
