package week01;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Key1 extends JFrame implements KeyListener {
	JLabel lbl;
	public Key1() {
		setLayout(new FlowLayout());
		lbl = new JLabel("Ű�� �Է��� ������.");
		add(lbl);
		addKeyListener(this);
		setTitle("KeyListener");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 200, 500, 400);
		setVisible(true);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		lbl.setText("Ű�� ������ �����Դϴ�. => " + KeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		lbl.setText("������ Ű�� �����ϴ� �����Դϴ�. => " + KeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		lbl.setText("������ [����]Ű�� �����ϴ� �����Դϴ�. => " + e.getKeyChar()));
	}

	public static void main(String[] args) {
		new Key1();
	}

}
