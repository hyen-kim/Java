import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.omg.PortableInterceptor.ACTIVE;

public class Action2 extends JFrame implements ActionListener {
	JButton btn1, btn2;
	JLabel lbl;
	
	public Action2() {
		setTitle("�ϳ��� handler(ó����) ��ü ���");
		setLayout(new FlowLayout());
	
		btn1 = new JButton("����");
		btn2 = new JButton("����");
		lbl = new JLabel("��ư�� �����ϼ���.");
		
		add(btn1);
		add(btn2);
		add(lbl);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(900, 200, 150, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			lbl.setText("���ڹ�ư�� ���õǾ����ϴ�.");
		}else{
			lbl.setText("���ڹ�ư�� ���õǾ����ϴ�.");
		}

	}

	public static void main(String[] args) {
		new Action2();
	}

}
