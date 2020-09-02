import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextTest extends JFrame{
	public TextTest() {
		// ���� ���� ���� (�����̳�)
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));	// ���� ����
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JLabel l1 = new JLabel("���� : ");
		JLabel l2 = new JLabel("��ȭ��ȣ : ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(20);
		
		// ù��° ���ڿ� ���� ������ �ؽ�Ʈ �ʵ尡 ���� �߰�
		p1.add(l1); p1.add(t1);
		// �ι�° ���ڿ� ��ȭ��ȣ�� �ؽ�Ʈ �ʵ尡 ���� �߰�
		p2.add(l2); p2.add(t2);
		
		// ū ���ڿ� ���� ���� �ΰ��� �߰�	--> ��ҹ��� �� ����
		add(p1, "North");
		add(p2, "Center");	// ��ġ Center�� ����
		
		
		setTitle("JTextField ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 200, 500, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextTest();
	}
	
}
