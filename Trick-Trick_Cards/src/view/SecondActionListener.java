package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Execution;

public class SecondActionListener implements ActionListener {
	private Execution _ex;

	public SecondActionListener(Execution e) {
		_ex = e;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_ex.update02();
	}

}
