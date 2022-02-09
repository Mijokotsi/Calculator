import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	
	String operator;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 399, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(58, 0, 312, 57);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBounds(10, 51, 365, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.setEnabled(false);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				double sqrtAnswer = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+sqrtAnswer);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRoot.setBounds(10, 166, 59, 57);
		frame.getContentPane().add(btnRoot);
		
		JButton btninverse = new JButton("1/x");
		btninverse.setEnabled(false);
		btninverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// To calculate inverse of a number
				double inverseAnswer = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+inverseAnswer);
			}
		});
		btninverse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btninverse.setBounds(10, 233, 59, 57);
		frame.getContentPane().add(btninverse);
		
		JButton btnxy = new JButton("x^y");
		btnxy.setEnabled(false);
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "x^y";
			}
		});
		btnxy.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnxy.setBounds(10, 300, 59, 57);
		frame.getContentPane().add(btnxy);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a =Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlusMinus.setBounds(10, 568, 59, 57);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnexp = new JButton("e^x");
		btnexp.setEnabled(false);
		btnexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double expAnswer = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+expAnswer);
			}
		});
		btnexp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnexp.setBounds(79, 166, 59, 57);
		frame.getContentPane().add(btnexp);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double sinAnswer = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+sinAnswer);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSin.setBounds(148, 166, 59, 57);
		frame.getContentPane().add(btnSin);
		
		JButton btnLog = new JButton("log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double logAnswer = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+logAnswer);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLog.setBounds(79, 233, 59, 57);
		frame.getContentPane().add(btnLog);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPercent.setBounds(79, 300, 59, 57);
		frame.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn7.setBounds(79, 367, 59, 57);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn4.setBounds(79, 434, 59, 57);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// This code is for taking input from the user for the particular button
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn1.setBounds(79, 501, 59, 57);
		frame.getContentPane().add(btn1);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClear.setBounds(148, 300, 59, 57);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn8.setBounds(148, 367, 59, 57);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn5.setBounds(148, 434, 59, 57);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn2.setBounds(148, 501, 59, 57);
		frame.getContentPane().add(btn2);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if(textField.getText().length() > 0) {
					
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Windings", Font.PLAIN, 22));
		btnBackSpace.setBounds(217, 300, 59, 57);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn9.setBounds(217, 367, 59, 57);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn6.setBounds(217, 434, 59, 57);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn3.setBounds(217, 501, 59, 57);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDot.setBounds(217, 568, 59, 57);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				second = Double.parseDouble(textField.getText());
				
				if(operator == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "-") {
					result = first - second; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "*") {
					result = first * second; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "/") {
					result = first / second; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "%") {
					result = first % second; 
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "x^y") {
					
					double res = 1;
					for(int i=0;i<second;i++) {
						res = first * res;
					}
					 
					answer = String.format("%.2f", res);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEqual.setBounds(286, 568, 59, 57);
		frame.getContentPane().add(btnEqual);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn0.setBounds(79, 568, 128, 57);
		frame.getContentPane().add(btn0);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.setEnabled(false);
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ans = Double.parseDouble(textField.getText());
				
				double fact = 1;
				while(ans != 0) {
					
					fact = fact*ans;
					
					ans--;
				}
				
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnFactorial.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFactorial.setBounds(10, 501, 59, 57);
		frame.getContentPane().add(btnFactorial);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.setEnabled(false);
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = (Double.parseDouble(textField.getText()));
				
				// This code is to calculate the square of a number
				a = a*a;      
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnx2.setBounds(10, 434, 59, 57);
		frame.getContentPane().add(btnx2);
		
		JButton btnx3 = new JButton("x^3");
		btnx3.setEnabled(false);
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                double a = (Double.parseDouble(textField.getText()));
				
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnx3.setBounds(10, 367, 59, 57);
		frame.getContentPane().add(btnx3);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double cosAnswer = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+cosAnswer);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCos.setBounds(217, 166, 59, 57);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double tanAnswer = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+tanAnswer);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTan.setBounds(286, 166, 59, 57);
		frame.getContentPane().add(btnTan);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDivide.setBounds(286, 501, 59, 57);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMul.setBounds(286, 434, 59, 57);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSub.setBounds(286, 367, 59, 57);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnAdd.setBounds(286, 300, 59, 57);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Code to calculate sin hyperbolic for the given 
				double sinhAnswer = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+sinhAnswer);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSinh.setBounds(148, 233, 59, 57);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Code to calculate cos hyperbolic for the given 
				double coshAnswer = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+coshAnswer);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCosh.setBounds(217, 233, 59, 57);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Code to calculate tan hyperbolic for the given 
				double tanhAnswer = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+tanhAnswer);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnTanh.setBounds(286, 233, 59, 57);
		frame.getContentPane().add(btnTanh);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Disabling the number buttons
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				
				// Disabling the operator buttons
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnEqual.setEnabled(true);
				btnPercent.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				
				// Disabling the scientific buttons
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnexp.setEnabled(true);
				btnLog.setEnabled(true);
				btninverse.setEnabled(true);
				btnRoot.setEnabled(true);
				
				// Disabling the special operations buttons
				btnFactorial.setEnabled(true);
				btnx2.setEnabled(true);
				btnx3.setEnabled(true);
				btnxy.setEnabled(true);
				
				// Disabling the special character operators
				btnClear.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnDot.setEnabled(true);
				
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(10, 139, 59, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
				// Disabling the number buttons
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				
				// Disabling the operator buttons
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnEqual.setEnabled(false);
				btnPercent.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				
				// Disabling the scientific buttons
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnexp.setEnabled(false);
				btnLog.setEnabled(false);
				btninverse.setEnabled(false);
				btnRoot.setEnabled(false);
				
				// Disabling the special operations buttons
				btnFactorial.setEnabled(false);
				btnx2.setEnabled(false);
				btnx3.setEnabled(false);
				btnxy.setEnabled(false);
				
				// Disabling the special character operators
				btnClear.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnDot.setEnabled(false);
				
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnOff.setBounds(79, 139, 59, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
