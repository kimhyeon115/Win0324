import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class WinJuminCheck extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfJumin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WinJuminCheck dialog = new WinJuminCheck();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WinJuminCheck() {
		setTitle("주민번호 체크기");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주민번호 입력 :");
		lblNewLabel.setBounds(44, 42, 97, 15);
		contentPanel.add(lblNewLabel);
		
		tfJumin = new JTextField();
		tfJumin.setBounds(164, 39, 209, 21);
		contentPanel.add(tfJumin);
		tfJumin.setColumns(10);
		
		JButton btnRun = new JButton("확  인");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strJumin = tfJumin.getText();
				if(strJumin.length() == 13) {								// 배열이 원하는 길이인지 비교
					int sum = 0, temp, check = 0, i;
					int arr[] = {2,3,4,5,6,7,8,9,2,3,4,5};					// 여러번 계산해야할 숫자를 배열로 저장
					for(i=0; i<12; i++) {
						temp = Integer.parseInt(strJumin.substring(i,i+1));	// 배열에서 필요 위치 값을 짜르기고 타입변환
						sum = sum + temp *arr[i];							// 배열속에 숫자 반복문 사용하여 개별 사용
						check = (11 - sum % 11) % 10;						// 계산후 끝자리만 남기는 수식?
					}														// i값을 반복문 외부에서 선언하였기에 
					int lastSu = Integer.parseInt(strJumin.substring(i,i+1));	// 반목문 완료후 i값은 13임을 이용
					if(lastSu == check) {
						JOptionPane.showMessageDialog(null, "유효한 주민번호 입니다");
					}else {
						String createJumin = strJumin.substring(0,12) + check;
						tfJumin.setText(createJumin);
					}
				}else {
					JOptionPane.showMessageDialog(null, "주민번호 자리수가 맞지 않습니다");
					tfJumin.requestFocus();
				}
			}
		});
		btnRun.setBounds(164, 208, 97, 23);
		contentPanel.add(btnRun);
		
		JTextArea tAr = new JTextArea();
		tAr.setBounds(44, 67, 329, 125);
		contentPanel.add(tAr);
	}
}

