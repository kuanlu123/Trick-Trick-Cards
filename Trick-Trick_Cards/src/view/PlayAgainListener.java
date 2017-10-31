package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayAgainListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new UserInterface();
	}

}
