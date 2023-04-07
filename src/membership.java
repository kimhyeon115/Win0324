import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class membership extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField text_id;
	private JTextField text_pw1;
	private JTextField text_pw2;
	private JTextField text_name;
	private JTextField text_mail;
	private JTextField text_tel;
	private JTextField text_addr;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			membership dialog = new membership();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public membership() {
		setTitle("가입 정보");
		setBounds(100, 100, 403, 369);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("아이디");
			lblNewLabel.setBounds(60, 10, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("비밀번호");
			lblNewLabel_1.setBounds(60, 45, 57, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("비밀번호");
			lblNewLabel_2.setBounds(60, 78, 57, 15);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("이  름");
			lblNewLabel_3.setBounds(60, 115, 57, 15);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("메  일");
			lblNewLabel_4.setBounds(60, 150, 57, 15);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("전화번호");
			lblNewLabel_5.setBounds(60, 186, 57, 15);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("주  소");
			lblNewLabel_6.setBounds(60, 226, 57, 15);
			contentPanel.add(lblNewLabel_6);
		}
		{
			text_id = new JTextField();
			text_id.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						text_pw1.requestFocus();
					}
				}
			});
			text_id.setBounds(143, 7, 116, 21);
			contentPanel.add(text_id);
			text_id.setColumns(10);
		}
		{
			text_pw1 = new JTextField();
			text_pw1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						text_pw2.requestFocus();
					}
				}
			});
			text_pw1.setBounds(143, 42, 116, 21);
			contentPanel.add(text_pw1);
			text_pw1.setColumns(10);
		}
		{
			text_pw2 = new JTextField();
			text_pw2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						text_name.requestFocus();
					}
				}
			});
			text_pw2.setBounds(143, 75, 116, 21);
			contentPanel.add(text_pw2);
			text_pw2.setColumns(10);
		}
		{
			text_name = new JTextField();
			text_name.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						text_mail.requestFocus();
					}
				}
			});
			text_name.setBounds(143, 112, 116, 21);
			contentPanel.add(text_name);
			text_name.setColumns(10);
		}
		{
			text_mail = new JTextField();
			text_mail.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						text_tel.requestFocus();
					}
				}
			});
			text_mail.setBounds(143, 147, 116, 21);
			contentPanel.add(text_mail);
			text_mail.setColumns(10);
		}
		{
			text_tel = new JTextField();
			text_tel.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						text_addr.requestFocus();
					}
				}
			});
			text_tel.setBounds(143, 183, 116, 21);
			contentPanel.add(text_tel);
			text_tel.setColumns(10);
		}
		{
			text_addr = new JTextField();
			text_addr.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnSave.requestFocus();
					}
				}
			});
			text_addr.setBounds(143, 223, 116, 21);
			contentPanel.add(text_addr);
			text_addr.setColumns(10);
		}
		{
			btnSave = new JButton("회원가입");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tfId = text_id.getText();
					String tfPw1 = text_pw1.getText();
					String tfPw2 = text_pw2.getText();
					String tfName = text_name.getText();
					String tfMail = text_mail.getText();
					String tfTel = text_tel.getText();
					String tfAddr = text_addr.getText();

					String sql = "insert into XXXTBL values('" + tfId + "','";
					sql = sql + tfPw1 + "','" + tfName + "')";
					System.out.println(sql);
				}
			});
			btnSave.setBounds(60, 281, 97, 23);
			contentPanel.add(btnSave);
		}
		{
			JButton btnCancel = new JButton("취  소");
			btnCancel.setBounds(187, 281, 97, 23);
			contentPanel.add(btnCancel);
		}
		{
			JButton btnDuplication = new JButton("중복확인");
			btnDuplication.setFont(new Font("굴림", Font.PLAIN, 12));
			btnDuplication.setBounds(271, 6, 81, 23);
			contentPanel.add(btnDuplication);
		}
		{
			JButton btnNewButton = new JButton("찾기...");
			btnNewButton.setBounds(271, 222, 81, 23);
			contentPanel.add(btnNewButton);
		}
	}

}
