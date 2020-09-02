package swingEx;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest extends JFrame {
	
	public JButtonTest() {
		
		setLayout(new FlowLayout());
		
		// JButton 
		JButton btn1 = new JButton("Ȯ��");
		JButton btn2 = new JButton("���");
		
		// JButton ����
		btn1.setBackground(Color.YELLOW);
		// JButton ���ڻ�
		btn1.setForeground(Color.RED);
		
		btn2.setBackground(Color.BLUE);
		btn2.setForeground(Color.WHITE);
		
		add(btn1);
		add(btn2);
		
		setTitle("JButton ����");
		setSize(500, 300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JButtonTest();
	}
}
