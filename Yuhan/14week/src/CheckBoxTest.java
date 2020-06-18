import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxTest extends JFrame {
	public CheckBoxTest() {
		setLayout(new FlowLayout());
		
		String[] strChks = {"���", "������", "����", "����", "����"};
		JCheckBox[] chks = new JCheckBox[strChks.length];
		
		for (int i = 0; i < chks.length; i++) {
			chks[i] = new JCheckBox(strChks[i]);
			add(chks[i]);
		}
		
		chks[3].setSelected(true);	// ���ܸ� ����
		
		setTitle("üũ�ڽ� ����");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 400, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxTest();
	}
}
