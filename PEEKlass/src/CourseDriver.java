
public class CourseDriver {
	private FilterCourses courses;
	private MustTake must;
	private Selected selected;
	
	public CourseDriver (){
		courses = new FilterCourses();
		must = new MustTake();
		selected = new Selected();
	}
	
	public void updateFilter(FilterCourses fc){
		courses = fc;
	}
	
	public void addMust(Course c){
		must.add(c);
	}
	
	public void deleteMust(Course c){
		must.delete(c);
	}
	
	public void addSelected(Course c){
		selected.add(c);
	}
	
	public void deleteSelected(Course c){
		selected.delete(c);
	}
	
	public void mustToSelected(Course c){
		//check that c exists in must
		//delete from must
		//add to selected
	}
	
	public void selectedToMust(Course c){
		//check that c exists in selected
		//delete from selected
		//add to must
	}
}
