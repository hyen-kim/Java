import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListTest extends JFrame {
	public ListTest() {
		setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("���ϼ��� : ");
		String[] strlists = {"����", "����", "����", "�ڵ�", "������"};
		JList<String> list = new JList<String>(strlists);
		
		add(l1);
		add(list);
		
		setTitle("JList ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListTest();
	}
}
