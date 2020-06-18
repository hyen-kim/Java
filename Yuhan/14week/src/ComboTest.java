import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboTest extends JFrame {
	public ComboTest() {
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("�Ļ� : ");
		JLabel l2 = new JLabel("���� : ");
		String[] strMeals = {"�丶���Ľ�Ÿ", "������ũ", "������", "������", "�Ұ��"};
		String[] strDrinks = {"ȭ��Ʈ����", "�������", "�ݶ�", "���̴�", "��ġ��"};
		
		JComboBox<String> comboM = new JComboBox<String>(strMeals);
		JComboBox<String> comboD = new JComboBox<String>(strDrinks);
		
		add(l1); add(comboM);
		add(l2); add(comboD);
		
		setTitle("JComboBox ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboTest();
	}
}
