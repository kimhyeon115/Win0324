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

public class WinRootformula extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfA;
	private JTextField tfB;
	private JTextField tfC;
	private JTextField tfX1;
	private JTextField tfX2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WinRootformula dialog = new WinRootformula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WinRootformula() {
		setTitle("근의 공식");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbla = new JLabel("a의 값");
			lbla.setBounds(39, 28, 57, 15);
			contentPanel.add(lbla);
		}
		{
			JLabel lblb = new JLabel("b의 값");
			lblb.setBounds(39, 56, 57, 15);
			contentPanel.add(lblb);
		}
		{
			tfA = new JTextField();
			tfA.setBounds(108, 25, 116, 21);
			contentPanel.add(tfA);
			tfA.setColumns(10);
		}
		{
			tfB = new JTextField();
			tfB.setBounds(108, 53, 116, 21);
			contentPanel.add(tfB);
			tfB.setColumns(10);
		}
		{
			JLabel lblc = new JLabel("c의 값");
			lblc.setBounds(39, 81, 57, 15);
			contentPanel.add(lblc);
		}
		{
			tfC = new JTextField();
			tfC.setBounds(108, 84, 116, 21);
			contentPanel.add(tfC);
			tfC.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("x의 값");
			lblNewLabel_3.setBounds(39, 155, 57, 15);
			contentPanel.add(lblNewLabel_3);
		}
		{
			tfX1 = new JTextField();
			tfX1.setBounds(108, 152, 116, 21);
			contentPanel.add(tfX1);
			tfX1.setColumns(10);
		}
		{
			tfX2 = new JTextField();
			tfX2.setBounds(108, 184, 116, 21);
			contentPanel.add(tfX2);
			tfX2.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("근값 계산");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double a = Double.parseDouble(tfA.getText());
					double b = Double.parseDouble(tfB.getText());
					double c = Double.parseDouble(tfC.getText());
					
					if(b*b - 4*a*c >= 0) {
					double x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
					double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
					tfX1.setText(Double.toString(x1));
					tfX2.setText(Double.toString(x2));
					}else {
						JOptionPane.showMessageDialog(null, "허수 발생", "다시 입력", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnNewButton.setBounds(281, 151, 97, 23);
			contentPanel.add(btnNewButton);
		}
	}

}
