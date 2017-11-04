public class Selected extends ClassList{
	
	public void add(Course c){
		if (courselist.containsKey(c.getCourseNum())){
			return;
		} else{
			courselist.put(c.getCourseNum(), c);
		}
	}
	
	public void delete(Course c){
		if (courselist.containsKey(c.getCourseNum())){
			return;
		} else{
			courselist.remove(c.getCourseNum());
		} 
	}

	public void moveToMT(Course c, MustTake a){
		//if Course c is in courselist and not in MustTake
		if (courselist.containsKey(c.getCourseNum()) && a.isOverlap(c)){
			this.delete(c);
			a.add(c);
		} else {
			return ; //else?
		}
	}

	@Override
	public boolean isOverlap(Course c) {
		// TODO Auto-generated method stub
		return false;
	}
}