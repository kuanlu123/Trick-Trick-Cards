package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Execution;

public class FirstActionListener implements ActionListener {
	private Execution a;

	public FirstActionListener(Execution e) {
		a = e;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		a.update();
	}
}
