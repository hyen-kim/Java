package week01;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse1 extends JFrame implements MouseListener {

	JLabel lbl;
	
	public Mouse1() {
		
		setLayout(new FlowLayout());
		setTitle("���콺 �̺�Ʈ ù ��° ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lbl = new JLabel("���콺�� �����غ�����.");
		add(lbl);
		addMouseListener(this);
		setBounds(200, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		lbl.setText("���콺�� Ŭ���Ǿ����ϴ�.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lbl.setText("���콺�� ���η� ���Խ��ϴ�.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lbl.setText("���콺�� �ܺη� �������ϴ�.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lbl.setText("���콺 ��ư�� ���Ƚ��ϴ�.");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		lbl.setText("���콺 ��ư�� ���� �Ǿ����ϴ�.");
	}
	
	public static void main(String[] args) {
		new Mouse1();
	}

}
