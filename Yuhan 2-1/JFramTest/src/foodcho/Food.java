package foodcho;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Food {
	private static JTextField txt1;
	private static JTextField txt2;
	private static JTextField txt3;
	private static JTextField total;
	
	static int cnt1 = 0;
	static int cnt2 = 0;
	static int cnt3 = 0;
	
	static int sum1 = 0;
	static int sum2 = 0;
	static int sum3 = 0;
	static int sumtotal = 0;
	
	
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		// ȭ�� â�̸� 
		j.setTitle("FoodCount");
		
		
		// �̹����κ�
		JLabel img = new JLabel("");	// �̹����� ������ �󺧷� �߰� !!!!!!!!!!!!!!!!!!!!!
		img.setIcon(new ImageIcon("C:\\Users\\\uD61C\uCF69\uC774\\Desktop\\GitHub-\\Java\\Yuhan\\JFramTest\\src\\\uC9EC\uBF55.jpg"));
		img.setBounds(27, 68, 684, 383);
		j.getContentPane().add(img);
		
		j.setSize(750, 600);
		j.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(132, 26, 124, 27);
		j.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(354, 26, 115, 27);
		j.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(580, 26, 131, 27);
		j.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		total = new JTextField();
		total.setBounds(212, 470, 499, 57);
		j.getContentPane().add(total);
		total.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uCD1D\uAE08\uC561");
		lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 42));
		lblNewLabel.setBounds(37, 470, 143, 53);
		j.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("\uC9EC\uBF55");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// «�� ��ư
				cnt1++;
				String cnt11 = String.valueOf(cnt1);
				txt1.setText(cnt11);
				sum1 = cnt1 * 5000;
				sumtotal = sum1 + sum2 + sum3;
				total.setText(sumtotal + "�� �Դϴ�."); 
				ImageIcon icon = new ImageIcon("«��.jpg");
				img.setIcon(icon);
			}
		});
		btn1.setBounds(17, 25, 115, 29);
		j.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("\uC9DC\uC7A5");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ¥�� ��ư
				cnt2++;
				String cnt22 = String.valueOf(cnt2);
				txt2.setText(cnt22);
				sum2 = cnt2 * 5000;
				sumtotal = sum1 + sum2 + sum3;
				total.setText(sumtotal + "�� �Դϴ�."); 
				ImageIcon icon = new ImageIcon("¥��.jpg");
				img.setIcon(icon);
			}
		});
		btn2.setBounds(263, 25, 90, 29);
		j.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("\uC6B0\uB3D9");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �쵿 ��ư
				cnt3++;
				String cnt33 = String.valueOf(cnt3);
				txt3.setText(cnt33);
				sum3 = cnt3 * 5000;
				sumtotal = sum1 + sum2 + sum3;
				total.setText(sumtotal + "�� �Դϴ�."); 
				ImageIcon icon = new ImageIcon("�쵿.jpg");
				img.setIcon(icon);
			}
		});
		btn3.setBounds(476, 25, 101, 29);
		j.getContentPane().add(btn3);
		
		
	
	
	
		j.setVisible(true);
	
	}
}
