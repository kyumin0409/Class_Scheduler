
public class MustTake extends ClassList{

	@Override
	public boolean isOverlap(Course c) {
		// TODO Auto-generated method stub
		
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
