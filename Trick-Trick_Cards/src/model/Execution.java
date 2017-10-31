package model;

import java.util.Random;

import javax.swing.ImageIcon;

import view.UserInterface;

public class Execution {
	private ImageIcon _img04;
	private ImageIcon _img05;
	private ImageIcon _img06;
	private ImageIcon _img07;
	private ImageIcon _img08;
	private ImageIcon _img09;
	private ImageIcon _img010;
	private ImageIcon _img14;
	private ImageIcon _img15;
	private ImageIcon _img16;
	private ImageIcon _img17;
	private ImageIcon _img18;
	private ImageIcon _img19;
	private ImageIcon _img110;
	private ImageIcon _img24;
	private ImageIcon _img25;
	private ImageIcon _img26;
	private ImageIcon _img27;
	private ImageIcon _img28;
	private ImageIcon _img29;
	private ImageIcon _img210;
	private ImageIcon _img34;
	private ImageIcon _img35;
	private ImageIcon _img36;
	private ImageIcon _img37;
	private ImageIcon _img38;
	private ImageIcon _img39;
	private ImageIcon _img310;
	private UserInterface _an;

	public Execution() {
		_img04 = new ImageIcon("Images/04.png");
		_img05 = new ImageIcon("Images/05.png");
		_img06 = new ImageIcon("Images/06.png");
		_img07 = new ImageIcon("Images/07.png");
		_img08 = new ImageIcon("Images/08.png");
		_img09 = new ImageIcon("Images/09.png");
		_img010 = new ImageIcon("Images/010.png");
		_img14 = new ImageIcon("Images/14.png");
		_img15 = new ImageIcon("Images/15.png");
		_img16 = new ImageIcon("Images/16.png");
		_img17 = new ImageIcon("Images/17.png");
		_img18 = new ImageIcon("Images/18.png");
		_img19 = new ImageIcon("Images/19.png");
		_img110 = new ImageIcon("Images/110.png");
		_img24 = new ImageIcon("Images/24.png");
		_img25 = new ImageIcon("Images/25.png");
		_img26 = new ImageIcon("Images/26.png");
		_img27 = new ImageIcon("Images/27.png");
		_img28 = new ImageIcon("Images/28.png");
		_img29 = new ImageIcon("Images/29.png");
		_img210 = new ImageIcon("Images/210.png");
		_img34 = new ImageIcon("Images/34.png");
		_img35 = new ImageIcon("Images/35.png");
		_img36 = new ImageIcon("Images/36.png");
		_img37 = new ImageIcon("Images/37.png");
		_img38 = new ImageIcon("Images/38.png");
		_img39 = new ImageIcon("Images/39.png");
		_img310 = new ImageIcon("Images/310.png");
	}

	public ImageIcon Group1() {
		Random n = new Random();
		int i = n.nextInt(14);
		ImageIcon icon = new ImageIcon();
		switch (i) {
		case 0:
			icon = _img04;
			break;
		case 1:
			icon = _img14;
			break;
		case 2:
			icon = _img35;
			break;
		case 3:
			icon = _img25;
			break;
		case 4:
			icon = _img06;
			break;
		case 5:
			icon = _img16;
			break;
		case 6:
			icon = _img37;
			break;
		case 7:
			icon = _img27;
			break;
		case 8:
			icon = _img08;
			break;
		case 9:
			icon = _img18;
			break;
		case 10:
			icon = _img09;
			break;
		case 11:
			icon = _img29;
			break;
		case 12:
			icon = _img010;
			break;
		default:
			icon = _img210;
			break;
		}
		return icon;
	}

	public ImageIcon Group2() {
		Random n = new Random();
		int i = n.nextInt(14);
		ImageIcon icon = new ImageIcon();
		switch (i) {
		case 0:
			icon = _img34;
			break;
		case 1:
			icon = _img24;
			break;
		case 2:
			icon = _img05;
			break;
		case 3:
			icon = _img15;
			break;
		case 4:
			icon = _img36;
			break;
		case 5:
			icon = _img26;
			break;
		case 6:
			icon = _img07;
			break;
		case 7:
			icon = _img17;
			break;
		case 8:
			icon = _img38;
			break;
		case 9:
			icon = _img28;
			break;
		case 10:
			icon = _img39;
			break;
		case 11:
			icon = _img19;
			break;
		case 12:
			icon = _img310;
			break;
		default:
			icon = _img110;
			break;
		}
		return icon;
	}

	public void addApplication(UserInterface a) {
		_an = a;
	}

	public void update() {
		_an.update();
	}

	public void update02() {
		_an.update02();
	}
}
