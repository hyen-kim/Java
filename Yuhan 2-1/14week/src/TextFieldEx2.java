import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx2 extends JFrame{
	public TextFieldEx2() {
		// ���� ���� ���� (�����̳�)
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));	
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));	// �⺻������ 5
		
		JLabel l1 = new JLabel("���� : ");
		JLabel l2 = new JLabel("��ȭ��ȣ : ");
		JLabel l3 = new JLabel("�ּ� : ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField("���� ��� �ִ� �ּ� ����", 35);
		
		// ù��° ���ڿ� ���� ������ �ؽ�Ʈ �ʵ尡 ���� �߰�
		p1.add(l1); p1.add(t1);
		// �ι�° ���ڿ� ��ȭ��ȣ�� �ؽ�Ʈ �ʵ尡 ���� �߰�
		p2.add(l2); p2.add(t2);
		// ����° ���ڿ� �ּҿ� �ؽ�Ʈ �ʵ尡 ����  �߰�
		p3.add(l3); p3.add(t3);
		
		
		// ū ���ڿ� ���� ���� �ΰ��� �߰�	--> ��ҹ��� �� ����
		add(p1, "North");
		add(p2, "Center");	// ��ġ Center�� ���� ����
		add(p3, "South");
		
		setTitle("JTextField ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 200, 500, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx2();
	}
	
}
