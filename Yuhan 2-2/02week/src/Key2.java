import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Key2 extends JFrame implements KeyListener {
	
	// KeyListener�� ó���ϴ� �����ʵ�
	@Override
	public void keyPressed(KeyEvent e) {
		// �̺�Ʈ�� �߻��� Ű
		// �߻��� Ű �̺�Ʈ e�� ������ keyCode�� �־���
		int keyCode = e.getKeyCode();
		
		switch (keyCode) {
		case KeyEvent.VK_UP:	// Ű �ڵ尪 ������Ű�� ������ ��
			btn.setLocation(btn.getX(), btn.getY()-10);
			break;
			
		case KeyEvent.VK_DOWN:	
			btn.setLocation(btn.getX(), btn.getY()+10);
			break;

		case KeyEvent.VK_LEFT:	
			if (btn.getX() != 0) {
				btn.setLocation(btn.getX()-10, btn.getY());
			}
			break;

		case KeyEvent.VK_RIGHT:	
			btn.setLocation(btn.getX()+10, btn.getY());
			break;
			
		case KeyEvent.VK_F1:	
			btn.setBackground(Color.PINK);
			break;
			
		case KeyEvent.VK_F2:
			btn.setBackground(Color.ORANGE);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	
	JButton btn;
	// �⺻ ������
	public Key2() {
		setTitle("�����̴� ��ư (����Ű)");
		setLayout(null); 	// ��ġ�����ڸ� null ��
		
		// ��ư�� ���� ����
		btn = new JButton("Move");
		btn.setBounds(50, 50, 70, 30);
		add(btn);
		
		addKeyListener(this);		// ���� ��ü�� ó���ڸ� �ǹ��ϴ� this ���
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 300, 500, 300);
		setVisible(true);
		
		requestFocus(); 	// �޼ҵ� ��Ŀ���� ����
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Key2();
	}

}
