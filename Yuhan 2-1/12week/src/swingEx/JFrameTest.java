package swingEx;

import java.awt.Window;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	
	public JFrameTest() {
		setTitle("ù ��° ������"); 	// ����ǥ����
//		setSize(500, 300); 		// ����, ����
//		setLocation(300, 300);  // setLocation + setSize : ������ â�� ���ϴ� ��ġ�� ǥ��
		setBounds(300, 300, 500, 300);  // ���ϴ� ��ġ, ���ϴ� ũ��
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ â�� �ݾ��� �� ���α׷� ����
		setVisible(true); 		// ȭ�鿡 ���̰�
	}
	
	public static void main(String[] args) {
		new JFrameTest();	// �⺻ ������ ȣ��
	}
}
