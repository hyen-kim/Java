package week01;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotion2 extends JFrame implements MouseListener, MouseMotionListener {
	
	JLabel lbl;
	
	public MouseMotion2() {
		setLayout(new FlowLayout());
		
		lbl = new JLabel();
		addMouseListener(this);
		addMouseMotionListener(this);
		
		add(lbl);
		setTitle("MouseListener & MouseMotionListener");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 200, 500, 400);
		setVisible(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		lbl.setText("���콺�� �巡�׵˴ϴ�. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		lbl.setText("���콺�� �̵��˴ϴ�. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		lbl.setText("���콺�� Ŭ���˴ϴ�. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lbl.setText("���콺�� ���Խ��ϴ�. (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lbl.setText("���콺�� �������ϴ�.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lbl.setText("���콺�� ���������ϴ�.");
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	public static void main(String[] args) {
		new MouseMotion2();
	}

}
