import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowTest1 extends JFrame {
	
	public FlowTest1() {	// �⺻ ������
		setLayout(new FlowLayout());
		
		String[] strBtn = {"��", "��", "��", "��", "��"};
		JButton[] btns = new JButton[strBtn.length];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(strBtn[i]);
			add(btns[i]);
		}
		
		setTitle("FlowLayout ����");
		
		setBounds(200, 150, 200, 200);	// ���� ���� / ������ȭ����ǥ	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowTest1();		// �⺻ �����ڸ� ȣ���Ͽ� ��ü ����
	}
}
