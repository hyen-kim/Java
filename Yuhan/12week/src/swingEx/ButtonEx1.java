package swingEx;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx1 extends JFrame {
	private JButton btn1, btn2;
	
	public ButtonEx1() {
		setTitle("��ư ����");
		setLayout(new FlowLayout());
		
		btn1 = new JButton("����");
		btn2 = new JButton("���");
		
		add(btn1);
		add(btn2);
		
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonEx1();
	}
}
