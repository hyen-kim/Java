package swingEx;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx1 extends JFrame {
	
	private JLabel lb1, lb2;
	
	public LabelEx1() {	// �⺻������
		setLayout(new FlowLayout()); // Label �� �� ������ ��ġ�ϱ� ����
		lb1 = new JLabel("���� : ");
		lb2 = new JLabel("�ֹι�ȣ : ");
		
		add(lb1);
		add(lb2);
		
		setTitle("�� ����");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx1();
	}
}
