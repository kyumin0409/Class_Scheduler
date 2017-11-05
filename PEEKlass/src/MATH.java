import java.time.LocalTime;

public class MATH extends Major{
	
	//private AllCourses ac = new AllCourses();
	Course math131;
	Course math132;
	Course math233;
	Course math235;
	Course math331;

	LocalTime time09 = LocalTime.parse("09:00");
	LocalTime time10 = LocalTime.parse("10:00");
	LocalTime time11 = LocalTime.parse("11:00");
	LocalTime time12 = LocalTime.parse("12:00");
	LocalTime time13 = LocalTime.parse("13:00");
	LocalTime time14 = LocalTime.parse("14:00");
	LocalTime time15 = LocalTime.parse("15:00");
	LocalTime time16 = LocalTime.parse("16:00");
	LocalTime time17 = LocalTime.parse("17:00");
	
	public MATH(){

		majorName = "MATH";

		CourseNum maNum131 = new CourseNum(this, 131);
		math131 = new Course(maNum131, "Calc 1", null, time14, time15, TTH());

		CourseNum maNum132 = new CourseNum(this, 132);
		math132 = new Course(maNum132, "Calc 2", maNum131, time10, time11, MW() );

		CourseNum maNum233 = new CourseNum(this, 233);
		math233 = new Course(maNum233, "Multivariate Calc", maNum132, time11, time12, TTH() );
	
		CourseNum maNum235 = new CourseNum(this, 235);
		math235 = new Course(maNum235, "Linear Algebra", null, time13, time14, MW() );

		CourseNum maNum331 = new CourseNum(this, 331);
		math331 = new Course(maNum331, "Ordinary Differential Equations ", null, time10, time11, MW() );

		coreList.add(math131);
		coreList.add(math132);
		coreList.add(math233);

		electiveList.add(math235);
		electiveList.add(math331);
	
	}

	public boolean[] MW(){
		boolean[] days = {true, false, true, false, false};
		return days;
	}
	
	public boolean[] TTH(){		
		boolean[] days = {false, true, false, true, false};
		return days;

	}

	public Course getMath131(){
		return math131;
	}
	
	public Course getMath132(){
		return math132;
	}
	
	public Course getMath233(){
		return math233;
	}
	
	public Course getMath235(){
		return math235;
	}
	
	public Course getMath331(){
		return math331;
	}
}
