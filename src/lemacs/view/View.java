package lemacs.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Dimension;

public class View {

	private static final String APP_NAME = "Lemacs Editor";
	private JFrame frame;

	public void initialiseGUI(){
		frame = new JFrame(APP_NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);

		// Must be after setSize to avoid the setting being overwritten
		frame.setLocationRelativeTo(null);

		initialiseMenuBar();
	}

	public void initialiseMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		final int menuWidth = 0;
		final int menuHeight = 25;
		Dimension menuBarSize = new Dimension(menuWidth, menuHeight);

		menuBar.setPreferredSize(menuBarSize);
		menuBar.setVisible(true);
		frame.setJMenuBar(menuBar);

		showGUI();
	}

	public void showGUI(){
		frame.setVisible(true);
	}
}
