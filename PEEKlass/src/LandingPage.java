import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class LandingPage {
	private JPanel welcomePanel;
	
	public LandingPage(){
		
	}
	
	public JPanel welcomePanel() {
		welcomePanel = new JPanel(new BorderLayout());
		JPanel welcomeNorthPanel = new JPanel();
		JLabel welcomeText = new JLabel("Welcome to PEEKlass!");
		welcomeText.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 25));
		welcomeText.setForeground(Color.WHITE);
		welcomeText.setHorizontalAlignment(SwingConstants.CENTER);
		welcomePanel.setBackground(new Color(51, 25, 0));
		welcomeNorthPanel.setBackground(new Color(51, 25, 0));
		welcomeNorthPanel.add(welcomeText);
/**
		if (userFirstName != null) {
			currentUser = userFirstName.getText();
			loggedInUser = new JLabel(currentUser);
			loggedInUser.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 25));
			loggedInUser.setForeground(Color.WHITE);
			loggedInUser.setHorizontalAlignment(SwingConstants.CENTER);
			welcomePanel.add(loggedInUser, BorderLayout.SOUTH);
			welcomeNorthPanel.add(logoutButton);
		}
**/
		welcomePanel.add(welcomeNorthPanel, BorderLayout.NORTH);

		return welcomePanel;
	}
}
