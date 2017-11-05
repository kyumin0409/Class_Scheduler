import java.util.HashMap;

public abstract class ClassList {
		
		protected static HashMap<CourseNum,Course> courselist;
		
		/**
		 * constructor
		 */
		public ClassList(){
			courselist = new HashMap<CourseNum,Course>();
		}
		
		public HashMap<CourseNum,Course> getCourseList(){
			return courselist;
		}
		
		public abstract boolean isOverlap(Course c);
		
		public abstract boolean add(Course c);
		
		public abstract boolean delete(Course c);
		
}
