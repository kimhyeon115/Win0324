import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginTap extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField text_id;
	private JTextField text_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			loginTap dialog = new loginTap();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public loginTap() {
		setTitle("Tap Login");
		setBounds(100, 100, 462, 268);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("아 이 디");
			lblNewLabel.setFont(new Font("양재본목각체M", Font.PLAIN, 12));
			lblNewLabel.setBounds(45, 42, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("비밀번호");
			lblNewLabel_1.setFont(new Font("양재본목각체M", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(45, 78, 57, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			text_id = new JTextField();
			text_id.setText("asdf1234");
			text_id.setBounds(137, 39, 150, 21);
			contentPanel.add(text_id);
			text_id.setColumns(10);
		}
		{
			text_pw = new JTextField();
			text_pw.setBounds(137, 75, 150, 21);
			contentPanel.add(text_pw);
			text_pw.setColumns(10);
		}
		{
			JButton btnLogin = new JButton("로그인하기");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String userId = text_id.getText();	//text_id의 값을 문자타입으로 가져오기
					String userPw = text_pw.getText();	//text_pw의 값을 문자타입으로 가져오기
					
					if(userId.equals("asdf1234")) {		//문자열 비교는 반드시 equals사용
						if(userPw.equals("1234")) {		//문자열 비교는 반드시 equals사용
							JOptionPane.showMessageDialog(null, "로그인 하였습니다");//기본api 알림창 보여주기
							WinF2C winf2c = new WinF2C();
							winf2c.setModal(true);		//winf2c객체 window가 떠있는 동안 이전 창이 안잡힘
							winf2c.setVisible(true);	//winf2c객체를 window상태로 보여주기
							
						}else {
							JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다");
							WinRootformula wrf = new WinRootformula();
							wrf.setModal(true);
							wrf.setVisible(true);
						}
					}else { 
						JOptionPane.showMessageDialog(null, "존재하지 않은 아이디 입니다");		
					}
				}
			});
			btnLogin.setForeground(Color.BLACK);
			btnLogin.setBackground(Color.ORANGE);
			btnLogin.setBounds(309, 39, 97, 57);
			contentPanel.add(btnLogin);
		}
		
		JCheckBox CheckBox1 = new JCheckBox("아이디 저장");
		CheckBox1.setBounds(81, 122, 103, 23);
		contentPanel.add(CheckBox1);
		
		JCheckBox CheckBox2 = new JCheckBox("보안접속");
		CheckBox2.setBounds(188, 122, 103, 23);
		contentPanel.add(CheckBox2);
		
		JButton btnSave = new JButton("회원가입...");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				membership mbs = new membership();
				mbs.setVisible(true);
			}
		});
		btnSave.setBounds(81, 163, 97, 23);
		contentPanel.add(btnSave);
		
		JButton btnFind = new JButton("아이디 비밀번호 찾기");
		btnFind.setBounds(190, 163, 150, 23);
		contentPanel.add(btnFind);
	}
}
