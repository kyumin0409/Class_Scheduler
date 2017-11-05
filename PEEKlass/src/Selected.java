import java.time.LocalTime;
import java.util.Iterator;
import java.util.Map;

public class Selected extends ClassList{
	
	public boolean add(Course c){
		if (courselist.containsKey(c.getCourseNum())){
			return false;
		} else {
			courselist.put(c.getCourseNum(), c);
			return true;
		}
	}
	
	public boolean delete(Course c){
		if (courselist.containsKey(c.getCourseNum())){
			return false;
		} else{
			courselist.remove(c.getCourseNum());
			return true;
		} 
	}

	@Override
	public boolean isOverlap(Course c) {
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
}