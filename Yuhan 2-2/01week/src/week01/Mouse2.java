package week01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse2 extends JFrame implements MouseListener {

	JLabel lbl;
	JButton btn;
	
	public Mouse2() {
		setLayout(new FlowLayout());
		setTitle("���콺 �̺�Ʈ ���α׷���");
		lbl = new JLabel("���콺 ��ư�� ���۽�Ű����.");
		btn = new JButton("���콺�� Ŭ���غ�����.");
		add(lbl);
		add(btn);
		btn.addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		lbl.setText("��ư�� Ŭ���Ǿ����ϴ�.");
		lbl.setForeground(Color.RED);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lbl.setText("��ư�� ���콺�� ���Խ��ϴ�.");
		btn.setBackground(Color.BLUE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lbl.setText("��ư���� �������Խ��ϴ�.");
		btn.setBackground(Color.YELLOW);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lbl.setText("��ư�� ���Ƚ��ϴ�.");
		btn.setForeground(Color.BLACK);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	public static void main(String[] args) {
		new Mouse2();

	}

}
