import java.time.LocalTime;
import java.util.Iterator;
import java.util.Map;

public class MustTake extends ClassList{

	@Override
	public boolean isOverlap(Course c) {
		// TODO Auto-generated method stub
		
		Iterator it = courselist.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			LocalTime currStart = ((Course) pair.getValue()).getStartTime();
			LocalTime currEnd = ((Course) pair.getValue()).getEndTime();
			if(currStart.compareTo(c.getStartTime())>0 && currStart.compareTo(c.getEndTime())<0){
				return true;
			}else if(c.getStartTime().compareTo(currStart)>0 && c.getStartTime().compareTo(currEnd)<0){
				return true;
			}
			else{
				continue;
			}
		}
		
		return false;
	}

	@Override
	public boolean add(Course c) {
		// TODO Auto-generated method stub
		if(courselist.containsKey(c.getCourseNum())){
			return false;//already contains the course in the list
		}else{
			courselist.put(c.getCourseNum(), c);
			return true;//successfully added the course to the list
		}
	}

	@Override
	public boolean delete(Course c) {
		// TODO Auto-generated method stub
		if(courselist.containsKey(c.getCourseNum())){
			courselist.remove(c.getCourseNum(), c);
			return true;//successfully deleted the course from the list
		}else{
			return false;//the class doesn't exist in the list
		}
		
	}
	
}