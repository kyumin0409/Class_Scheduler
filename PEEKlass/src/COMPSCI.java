
public class COMPSCI extends Major {

	private AllCourses ac = new AllCourses();

	public COMPSCI(){
		
		majorName = "COMPSCI";
		
		coreList.add(ac.getCS121());
		coreList.add(ac.getCS187());
		coreList.add(ac.getCS311());

		electiveList.add(ac.getCS326());
		electiveList.add(ac.getCS345());
		electiveList.add(ac.getCS377());
	}

}
