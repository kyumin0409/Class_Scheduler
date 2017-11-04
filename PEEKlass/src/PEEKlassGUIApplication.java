import javax.swing.JFrame;

public class PEEKlassGUIApplication {

	/** 
	 * Main application to show frame
	 **/
	public PEEKlassGUIApplication() 
	{
		JFrame guiFrame;

		// create a new JFrame to hold PEEKlass
		guiFrame = new JFrame( "PEEKlass");

		// set size
		guiFrame.setSize( 500, 900 );

		guiFrame.add(new CourseSelectionPage());

		// exit normally on closing the window
		guiFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// show frame
		guiFrame.setVisible( true );
	}

	/**
	 * Start the Game!
	 */
	public static void main( String[] args )
	{
		new PEEKlassGUIApplication();
	}


}

