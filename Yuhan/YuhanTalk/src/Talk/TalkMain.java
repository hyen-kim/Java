package Talk;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class TalkMain {
	private static JTextField YID;
	private static JTextField YPW;
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.getContentPane().setBackground(new Color(240, 255, 240));
		
		// ȭ�� â �̸�
		j.setTitle("Yuhan Talk");
		
		// â ������
		j.setSize(580, 690);
		j.getContentPane().setLayout(null);
		
		
		YID = new JTextField();
		YID.setFont(new Font("���� ��� Semilight", Font.PLAIN, 18));
		YID.setText("Username");
		YID.setBounds(77, 313, 414, 53);
		j.getContentPane().add(YID);
		YID.setColumns(10);
		
		
		JButton login = new JButton("LOGIN");
		login.setForeground(new Color(255, 255, 255));
		login.setFont(new Font("���� ���", Font.BOLD, 18));
		login.setBackground(Color.LIGHT_GRAY);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// �α��� ��ư Ŭ�� ��
				JOptionPane.showMessageDialog(null, "�α��� ����");
				
			}
		});
		
		login.setBounds(77, 440, 414, 53);	// �α��� ��ư ��ġ
		j.getContentPane().add(login);		// �α��� ��ư �߰�
		
		JButton join = new JButton("JOIN");
		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ȸ������ ��ư Ŭ�� ��
			}
		});
		join.setForeground(new Color(255, 255, 255));
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("���� ���", Font.BOLD, 18));
		join.setBounds(77, 495, 414, 53);
		j.getContentPane().add(join);
		
		YPW = new JTextField();
		YPW.setFont(new Font("���� ��� Semilight", Font.PLAIN, 18));
		YPW.setHorizontalAlignment(SwingConstants.LEFT);	// ���ڸ� ���ʺ���
		YPW.setText("PassWord");
		YPW.setBounds(77, 372, 414, 53);
		j.getContentPane().add(YPW);
		YPW.setColumns(10);
		
		JLabel title = new JLabel("Yuhan Talk");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(new Color(102, 205, 170));
		title.setFont(new Font("�޸յձ�������", Font.BOLD, 50));
		title.setBounds(59, 26, 414, 114);
		j.getContentPane().add(title);

		

		
		j.setResizable(true); // ������ ũ�� ����
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// �����ư Ȱ��ȭ
		j.setVisible(true);	// â ���̱�
	}
}
