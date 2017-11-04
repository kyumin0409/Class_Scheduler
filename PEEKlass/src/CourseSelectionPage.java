import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class CourseSelectionPage  extends JPanel{
	private JPanel showClassesPanel;
	private JPanel filterPanel;
	private JPanel mainPanel;
	private JPanel showGridPanel;
	private JPanel showMustTakePanel;
	private JPanel showSelectedPanel;
	private JPanel bottomPanel;
	
	
	public CourseSelectionPage() 
	{
		super(new BorderLayout());
		setFocusable(true);
		initPanel();
	}
	
	//initializes all panels
	public void initPanel(){
		add(filterPanel(), BorderLayout.NORTH);
		add(mainPanel(), BorderLayout.CENTER);
		add(bottomPanel(), BorderLayout.SOUTH);
	}
	
	//top filter panel
	public JPanel filterPanel(){
		filterPanel = new JPanel(new BorderLayout());
		JLabel filterLabel = new JLabel("Filter");
		filterPanel.add(filterLabel, BorderLayout.NORTH);
		filterPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		filterLabel.setHorizontalAlignment(JLabel.CENTER);
		filterLabel.setVerticalAlignment(JLabel.CENTER);
		filterLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		JCheckBox major = new JCheckBox("Major");
		JCheckBox MWF = new JCheckBox("Mon, Wed, Fri");
		JCheckBox TTH = new JCheckBox("Tues, Thurs");
		JCheckBox notTaken = new JCheckBox("Not Taken Before");
		JCheckBox meetsPrereq = new JCheckBox("Meets Prerequisites");
		JPanel checkBoxesPanel = new JPanel(new FlowLayout());
		checkBoxesPanel.add(major);
		checkBoxesPanel.add(MWF);
		checkBoxesPanel.add(TTH);
		checkBoxesPanel.add(notTaken);
		checkBoxesPanel.add(meetsPrereq);
		filterPanel.add(checkBoxesPanel, BorderLayout.CENTER);
		return filterPanel;
	}
	
	//main panel in the center containing left - class list, right - grid
	public JPanel mainPanel(){
		mainPanel = new JPanel(new GridLayout(1,2));
		mainPanel.add(showClassesPanel());
		mainPanel.add(showGridPanel());
		mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		return mainPanel;
	}
	
	//center left panel showing class list from filter
	public JPanel showClassesPanel(){
		showClassesPanel = new JPanel();
		showClassesPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		return showClassesPanel;
	}
	
	//center right panel showing class grid
	public JPanel showGridPanel(){
		showGridPanel = new JPanel();
		showGridPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		return showGridPanel;
	}
	
	//bottom left panel showing classes that must be taken (check mark)
	public JPanel showMustTakePanel(){
		showMustTakePanel = new JPanel();
		showMustTakePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		return showMustTakePanel;
	}
	
	//bottom right panel showing classes that are selected but not necessary or clashes with other classes
	public JPanel showSelectedPanel(){
		showSelectedPanel = new JPanel();
		showSelectedPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		return showSelectedPanel;
	}
	
	//bottom panel containing left - must take classes, right - other selected classes
	public JPanel bottomPanel(){
		bottomPanel = new JPanel(new GridLayout(1,2));
		bottomPanel.add(showMustTakePanel());
		bottomPanel.add(showSelectedPanel());
		return bottomPanel;
	}
}
