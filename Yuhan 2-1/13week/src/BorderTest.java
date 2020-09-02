import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderTest extends JFrame{
	
	public BorderTest() {
		setLayout(new BorderLayout(20, 30));	// ������Ʈ�� ������ ����
		String[] strBtn = {"North", "South", "East", "West", "Center"};
		JButton[] btns = new JButton[strBtn.length];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(strBtn[i]);
			add(btns[i],strBtn[i]);	
			// ��ġ�� �������� ������ center�� ���Ƿ�
			// ��ġ�� ��Ȯ�ϰ� �����ؾ��Ѵ�.
		}
		
		setTitle("BorderLayout ����");
		
		setBounds(200, 200, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderTest();	// ��ü�� �����ϸ鼭 �⺻������ ȣ��
	}
}
