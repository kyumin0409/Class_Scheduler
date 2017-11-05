<<<<<<< HEAD:PEEKlass/src/Math.java

=======
>>>>>>> origin/master:PEEKlass/src/MATH.java
public class MATH extends Major{
	
	private AllCourses ac = new AllCourses();

		public MATH(){

	majorName = "MATH";
	
	coreList.add(ac.getMath131());
	coreList.add(ac.getMath132());
	coreList.add(ac.getMath233());

	electiveList.add(ac.getMath235());
	electiveList.add(ac.getMath331());
	
	}
}
