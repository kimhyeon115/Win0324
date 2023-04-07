import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinF2C extends JDialog {
	private JTextField tff;
	private JTextField tfc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinF2C dialog = new WinF2C();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public WinF2C() {
		getContentPane().setLayout(null);
		setTitle("화씨를 섭씨 환산(F2C)");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblF = new JLabel("화씨(F)");
		lblF.setBounds(40, 36, 57, 15);
		getContentPane().add(lblF);
		
		tff = new JTextField();
		tff.setBounds(109, 33, 190, 21);
		getContentPane().add(tff);
		tff.setColumns(10);
		
		JButton btnf2c = new JButton("변환(F2C)");
		btnf2c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valueF1 = Double.parseDouble(tff.getText());
				double valueC1 = (valueF1 - 32) * 5 / 9;
				tfc.setText((Double.toString(valueC1)));
			}
		});
		btnf2c.setBounds(109, 80, 89, 23);
		getContentPane().add(btnf2c);
		
		JLabel lblC = new JLabel("섭씨(C)");
		lblC.setBounds(40, 132, 57, 15);
		getContentPane().add(lblC);
		
		tfc = new JTextField();
		tfc.setBounds(109, 129, 190, 21);
		getContentPane().add(tfc);
		tfc.setColumns(10);
		
		JButton btnc2f = new JButton("변환(C2F)");
		btnc2f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valueF2 = Double.parseDouble(tfc.getText());
				double valueC2 = (valueF2 * 9 /5 ) + 32;
				tff.setText(Double.toString(valueC2));
			}
		});
		btnc2f.setBounds(210, 80, 89, 23);
		getContentPane().add(btnc2f);

	}
}
