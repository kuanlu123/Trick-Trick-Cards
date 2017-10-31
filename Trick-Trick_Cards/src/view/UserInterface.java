package view;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Execution;

public class UserInterface {
	private JFrame _frame;
	private JLabel _label0;
	private JLabel _label1;
	private JLabel _label2;
	private JLabel _label3;
	private JLabel _label4;
	private JLabel _label5;
	private JLabel _label6;
	private JLabel _space1;
	private JLabel _space2;
	private JLabel _space3;
	private JLabel _space4;
	private JLabel _space5;
	private JLabel _space6;
	private JButton _button;
	private JButton _button1;
	private Execution _ex;
	private JTextField _p1;
	private JTextField _p2;
	private JTextField _p3;
	private JTextField _p4;
	private JTextField _p5;
	private JTextField _p6;
	private JTextField _p7;

	public UserInterface() {
		_ex = new Execution();
		_frame = new JFrame("UB Hacking-Card Trick");
		_frame.getContentPane().setLayout(new GridLayout(3, 7));
		_frame.getContentPane().setBackground(new Color(204, 255, 255));

		_p1 = new JTextField("Please");
		_p2 = new JTextField("chose");
		_p3 = new JTextField("one");
		_p4 = new JTextField("card");
		_p5 = new JTextField("in");
		_p6 = new JTextField("your");
		_p7 = new JTextField("mind");

		_p1.setFont(new Font("Please", Font.PLAIN, 50));
		_p2.setFont(new Font("chose", Font.PLAIN, 50));
		_p3.setFont(new Font("one", Font.PLAIN, 50));
		_p4.setFont(new Font("card", Font.PLAIN, 50));
		_p5.setFont(new Font("in", Font.PLAIN, 50));
		_p6.setFont(new Font("your", Font.PLAIN, 50));
		_p7.setFont(new Font("mind", Font.PLAIN, 50));

		// p1.setPreferredSize(new Dimension(100,100));
		// p2.setPreferredSize(new Dimension(100,100));
		// p3.setPreferredSize(new Dimension(100,100));
		// p4.setPreferredSize(new Dimension(100,100));
		// p5.setPreferredSize(new Dimension(100,100));
		// p6.setPreferredSize(new Dimension(100,100));
		// p7.setPreferredSize(new Dimension(200,100));

		_p1.setEditable(false);
		_p2.setEditable(false);
		_p3.setEditable(false);
		_p4.setEditable(false);
		_p5.setEditable(false);
		_p6.setEditable(false);
		_p7.setEditable(false);

		_frame.add(_p1);
		_frame.add(_p2);
		_frame.add(_p3);
		_frame.add(_p4);
		_frame.add(_p5);
		_frame.add(_p6);
		_frame.add(_p7);

		_label0 = new JLabel();
		_label0.setIcon(_ex.Group1());
		_frame.add(_label0);

		_label1 = new JLabel();
		_label1.setIcon(_ex.Group1());
		_frame.add(_label1);

		_label2 = new JLabel();
		_label2.setIcon(_ex.Group1());
		_frame.add(_label2);

		_label3 = new JLabel();
		_label3.setIcon(_ex.Group1());
		_frame.add(_label3);

		_label4 = new JLabel();
		_label4.setIcon(_ex.Group1());
		_frame.add(_label4);

		_label5 = new JLabel();
		_label5.setIcon(_ex.Group1());
		_frame.add(_label5);

		_label6 = new JLabel();
		_label6.setIcon(_ex.Group1());
		_frame.add(_label6);

		_space1 = new JLabel();
		_space2 = new JLabel();
		_space3 = new JLabel();
		_space4 = new JLabel();
		_space5 = new JLabel();
		_space6 = new JLabel();
		_frame.add(_space1);
		_frame.add(_space2);
		_frame.add(_space3);

		_button = new JButton("Click when you Ready");
		_button.setFont(new Font("Click when you Ready", Font.PLAIN, 24));
		ActionListener a;
		a = new FirstActionListener(_ex);
		_button.addActionListener(a);
		_frame.add(_button);
		_frame.add(_space4);
		_frame.add(_space5);
		_frame.add(_space6);

		_ex.addApplication(this);

		_frame.pack();
		_frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		_frame.setVisible(true);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void update() {
		// _label0.setIcon(_ex.Group2());
		// _label1.setIcon(_ex.Group2());
		// _label2.setIcon(_ex.Group2());
		// _label3.setIcon(_ex.Group2());
		// _label4.setIcon(_ex.Group2());
		// _label5.setIcon(_ex.Group2());
		// _label6.setIcon(_ex.Group2());
		_frame.remove(_label0);
		_frame.remove(_label1);
		_frame.remove(_label2);
		_frame.remove(_label3);
		_frame.remove(_label4);
		_frame.remove(_label5);
		_frame.remove(_label6);
		_frame.remove(_button);
		_frame.remove(_p1);
		_frame.remove(_p2);
		_frame.remove(_p3);
		_frame.remove(_p4);
		_frame.remove(_p5);
		_frame.remove(_p6);
		_frame.remove(_p7);
		_frame.remove(_space1);
		_frame.remove(_space2);
		_frame.remove(_space3);
		_frame.remove(_space4);
		_frame.remove(_space5);
		_frame.remove(_space6);

		_button1 = new JButton("Ready to see the Magic? We just removed your card from that pile.");
		_button1.setFont(new Font("Ready to see the Magic? We just removed your card from that pile.", Font.PLAIN, 30));
		ActionListener a;
		a = new SecondActionListener(_ex);
		_button1.addActionListener(a);
		_frame.add(_button1);

		_frame.setSize(1000, 700);
	}

	public void update02() {
		JTextField j = new JTextField("Now, Try to find your Card!");
		j.setFont(new Font("Now, Try to find your Card!", Font.PLAIN, 50));
		j.setEditable(false);
		_frame.add(j);
		_frame.remove(_button1);
		_frame.add(new JLabel());

		JButton b = new JButton("Play Again?");
		b.setFont(new Font("Play Again?", Font.PLAIN, 50));
		ActionListener a = new PlayAgainListener();
		b.addActionListener(a);
		_frame.add(b);

		_label0.setIcon(_ex.Group2());
		_frame.add(_label0);
		_label1.setIcon(_ex.Group2());
		_frame.add(_label1);
		_label2.setIcon(_ex.Group2());
		_frame.add(_label2);
		_label3.setIcon(_ex.Group2());
		_frame.add(_label3);
		_label4.setIcon(_ex.Group2());
		_frame.add(_label4);
		_label5.setIcon(_ex.Group2());
		_frame.add(_label5);

		_frame.pack();
	}
}
