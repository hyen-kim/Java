import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridTest extends JFrame {
	public GridTest() {
		setLayout(new GridLayout(4, 3)); // 4�� 3�� -> ���� ������ �ְ� �ʹٸ� �ڿ� �� �߰�
		String[] call = {"*", "0", "#"};
		
		JButton[] btns = new JButton[12];

		for (int i = 0; i < btns.length; i++) {
			if (i < 9) {
				btns[i] = new JButton(i + 1 + ""); // �������� ���� �� ���⶧���� ���ڿ������� �ٲ�
			}else {
				btns[i] = new JButton(call[i-9]);
			}
			add(btns[i]);
		}
//		btns[9].setLabel("*");
//		btns[10].setLabel("0");
//		btns[11].setLabel("#");

		setTitle("Ű�е�");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridTest();
	}
}
