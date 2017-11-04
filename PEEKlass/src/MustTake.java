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
	public void add(Course c) {
		// TODO Auto-generated method stub
		if(courselist.containsKey(c.getCourseNum())){
			return;
		}else{
			courselist.put(c.getCourseNum(), c);
		}
	}

	@Override
	public void delete(Course c) {
		// TODO Auto-generated method stub
		if(courselist.containsKey(c.getCourseNum())){
			courselist.remove(c.getCourseNum(), c);
		}else{
			return;
		}
		
	}
	
}
