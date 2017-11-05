import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CourseToDisplay extends JPanel{
	private CourseNum majorAndCourseNum;
	private Course course;
	
	public CourseToDisplay(CourseNum majorAndCourseNum, Course course){
		super(new FlowLayout());
		this.majorAndCourseNum = majorAndCourseNum;
		this.course = course;
		initPanel();
	}
	
	public void initPanel(){
		JButton addToSelected = new JButton();
		addToSelected.setBackground(Color.blue);
		addToSelected.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            }
        });
		
		JButton addToMustTake = new JButton();
		addToMustTake.setBackground(Color.red);
		addToMustTake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            }
        });
		String courseName = "";
		courseName += majorAndCourseNum.deptoString();
		courseName += majorAndCourseNum.courseNumToString();
		JLabel courseNum = new JLabel(courseName);
		
		this.add(addToMustTake);
		this.add(addToSelected);
		this.add(courseNum);
	}
	
	public Course getCourse(){
		return course;
	}

}
