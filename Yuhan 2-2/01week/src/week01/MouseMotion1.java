package week01;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseMotion1 extends JFrame implements MouseMotionListener {
	JLabel lbl;
	public MouseMotion1() {
		setLayout(new FlowLayout());
		lbl = new JLabel("���콺�� �巡�� �Ǵ� �����̼���.");
		add(lbl);
		addMouseMotionListener(this);
		setTitle("MouseMotionListener ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		lbl.setText("�巡�� �ǰ� ���� : " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lbl.setText("�����̰� ���� : " + e.getX() + ", " + e.getY());
	}

	public static void main(String[] args) {
		new MouseMotion1();
	}
}
