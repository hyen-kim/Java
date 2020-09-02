import javax.swing.JButton;
import javax.swing.JFrame;

public class NullTest extends JFrame{
	
	public NullTest() {
		setLayout(null); 	// ��ġ�����ڸ� ���ִ� ���
		JButton btn1 = new JButton("One");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		
		// ������Ʈ ��ü������ �̷��� ũ�� ���� ����
		btn1.setBounds(200, 50, 100, 30);
		btn2.setBounds(150, 70, 100, 30);
		btn3.setBounds(250, 70, 100, 30);
		btn4.setBounds(200, 90, 100, 30);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		setTitle("null Layout ����");
		
		setBounds(300,300, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NullTest();
	}
}
