
<<<<<<< HEAD
public class MATH extends Major{
	
	private AllCourses ac = new AllCourses();
=======
public class Math extends Major{
	
	public Math(){
		
		majorName = "Math";
	}
>>>>>>> 2b295305cbb76ad8d51819716b314b4e6df2b362

	public MATH(){
		
	coreList.add(ac.getMath131());
	coreList.add(ac.getMath132());
	coreList.add(ac.getMath233());

	electiveList.add(ac.getMath235());
	electiveList.add(ac.getMath331());
	
	}
}
