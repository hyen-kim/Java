import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ItemTest1 extends JFrame implements ItemListener {
	
	String[] checkStrs = {"���", "����", "�ڸ�", "����", "����"};
	int[] prices = {12000, 15000, 20000, 15000, 10000};
	JCheckBox[] checks = new JCheckBox[checkStrs.length];
	JTextArea ta;
	
	public ItemTest1() {
		setTitle("���� �ٱ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		JLabel lb = new JLabel("�ٱ��Ͽ� ���� ������ �������ּ���.");
		ta = new JTextArea();
		
		for (int i = 0; i < checkStrs.length; i++) {
			checks[i] = new JCheckBox(checkStrs[i]);
			p1.add(checks[i]);
			checks[i].addItemListener(this);
		}
		add(lb, "North");
		add(ta, "Center");
		add(p1, "South");
		setBounds(900, 200, 500, 300);
		setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		int total = 0;
		ta.setText("");
		
		for (int i = 0; i < checkStrs.length; i++) {
			if (checks[i].isSelected()) {
				ta.append("<<" + checkStrs[i] + "(" + prices[i] + "��)>>\n");
				total += prices[i];
			}
		}
		ta.append("���õ� ������ �ٱ��� �Ѿ��� " + total + "�� �Դϴ�.\n");
	}

	public static void main(String[] args) {
		new ItemTest1();
	}

}
