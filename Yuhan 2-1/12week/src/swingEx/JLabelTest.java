package swingEx;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest extends JFrame {
	
	public JLabelTest() {
		
		// Layout�� ��ġ������ ����
		setLayout(new FlowLayout());
		
		// JLabel�� ���� ȭ�鿡 ����ϱ� ���� ������Ʈ
		JLabel lbl1 = new JLabel("JLabel");
		JLabel lbl2 = new JLabel("�ǽ�");
		
		add(lbl1);	
		add(lbl2);
		
		//add(lbl1, "North");	// North ���� ����� �� �ִ� ���� border ���̾ƿ��� ���
		// add(lbl2, "South");
		
		setTitle("JLabel ������Ʈ ����");
		setBounds(250, 200, 600, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JLabelTest();	// ���� ������ ȣ��
	}
}
