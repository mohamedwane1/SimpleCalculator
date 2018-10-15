import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class SimpleCalculator {

	private JFrame frmSimpleCalculator;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setResizable(false);
		frmSimpleCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mohamed\\eclipse-workspace\\SimpleCalculator\\calculator.png"));
		frmSimpleCalculator.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		frmSimpleCalculator.setTitle("Simple Calculator - by Mohamed Wane");
		frmSimpleCalculator.setBounds(100, 100, 1176, 776);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum1.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textFieldNum1.setBounds(15, 28, 548, 151);
		frmSimpleCalculator.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum2.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textFieldNum2.setBounds(583, 28, 548, 151);
		frmSimpleCalculator.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double num1 = Double.parseDouble(textFieldNum1.getText());
					double num2 = Double.parseDouble(textFieldNum2.getText());
					double ans = num1 + num2;
					textFieldAns.setText(Double.toString(ans));
				} catch (Exception e){
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
				}
			}
		});
		btnAdd.setBounds(15, 207, 521, 133);
		frmSimpleCalculator.getContentPane().add(btnAdd);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textFieldNum1.getText());
					double num2 = Double.parseDouble(textFieldNum2.getText());
					double ans = num1 - num2;
					textFieldAns.setText(Double.toString(ans));
				} catch (Exception e1){
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
				}
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnMinus.setBounds(610, 207, 521, 133);
		frmSimpleCalculator.getContentPane().add(btnMinus);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textFieldNum1.getText());
					double num2 = Double.parseDouble(textFieldNum2.getText());
					double ans = num1*num2;
					textFieldAns.setText(Double.toString(ans));
				} catch (Exception e2){
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
				}
			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnMulti.setBounds(15, 368, 521, 120);
		frmSimpleCalculator.getContentPane().add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textFieldNum1.getText());
					double num2 = Double.parseDouble(textFieldNum2.getText());
					double ans = num1/num2;
					textFieldAns.setText(Double.toString(ans));
				} catch (Exception e3){
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnDiv.setBounds(610, 368, 521, 120);
		frmSimpleCalculator.getContentPane().add(btnDiv);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textFieldAns.setBounds(455, 516, 663, 133);
		frmSimpleCalculator.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblTheAnswerIs = new JLabel("The answer is:");
		lblTheAnswerIs.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblTheAnswerIs.setBounds(176, 527, 286, 105);
		frmSimpleCalculator.getContentPane().add(lblTheAnswerIs);
	}

}
