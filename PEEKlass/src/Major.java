import java.util.ArrayList;

public abstract class Major {
	
	protected String majorName;
	
	//core class list
	protected ArrayList<Course> coreList = new ArrayList<Course>();
	
	//elective class list
	protected ArrayList<Course> electiveList = new ArrayList<Course>();
	
	protected boolean isCore(){
		
		//iterate through the core list and if there's one, return true
		//otherwise, return false;
		
		return false;
	}
	
	protected String getMajorName(){
		
		return majorName;
	}
	
}
