import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5;
	public FlowLayoutEx() {
		setTitle("FlowLayout ����");
		
		setLayout(new FlowLayout());
		
		btn1 = new JButton("��");
		btn2 = new JButton("��");
		btn3 = new JButton("��");
		btn4 = new JButton("��");
		btn5 = new JButton("��");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FlowLayoutEx obj = new FlowLayoutEx();
	}
}
