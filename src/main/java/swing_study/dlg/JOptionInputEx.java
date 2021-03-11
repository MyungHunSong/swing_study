package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JOptionInputEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1;
	private JLabel lblRes1;
	private JLabel lbl2;
	private JButton btn2;
	private JLabel lblRes2;
	private JPanel panel2;
	private JPanel panel1;
	private JLabel lbl3;
	private JPanel panel3;
	private JLabel lblRes3;
	private JButton btn3;
	private JLabel lbl4;
	private JPanel panel4;
	private JButton btn4;
	private JLabel lblRes4;
	
	
	
	public JOptionInputEx() {
		initialize();
	}
	private void initialize() {
		setTitle("인풋맨");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 749, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lbl1 = new JLabel("JOptionPane.showInputDialog(\"We are Young Maybe...\");");
		contentPane.add(lbl1);
		
		panel1 = new JPanel();
		contentPane.add(panel1);
		panel1.setLayout(new GridLayout(0, 2, 0, 0));
		
		btn1 = new JButton("InputBtn1");
		panel1.add(btn1);
		
		lblRes1 = new JLabel("");
		panel1.add(lblRes1);
		lblRes1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblRes1.setHorizontalAlignment(SwingConstants.CENTER);
		btn1.addActionListener(this);
		
		lbl2 = new JLabel("JOptionPane.showInputDialog(message, initialSelectionValue);");
		contentPane.add(lbl2);
		
		panel2 = new JPanel();
		contentPane.add(panel2);
		panel2.setLayout(new GridLayout(0, 2, 0, 0));
		
		btn2 = new JButton("InputBtn2");
		panel2.add(btn2);
		
		lblRes2 = new JLabel("");
		panel2.add(lblRes2);
		lblRes2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes2.setFont(new Font("굴림", Font.PLAIN, 20));
		
		lbl3 = new JLabel("JOptionPane.showInputDialog(parentComponent, message, title, messageType)");
		contentPane.add(lbl3);
		
		panel3 = new JPanel();
		contentPane.add(panel3);
		panel3.setLayout(new GridLayout(0, 2, 0, 0));
		
		btn3 = new JButton("InputBtn3");
		btn3.addActionListener(this);
		panel3.add(btn3);
		
		lblRes3 = new JLabel("");
		panel3.add(lblRes3);
		
		lbl4 = new JLabel("String res = JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue);");
		contentPane.add(lbl4);
		
		panel4 = new JPanel();
		contentPane.add(panel4);
		panel4.setLayout(new GridLayout(0, 2, 0, 0));
		
		btn4 = new JButton("InputBtn4");
		btn4.addActionListener(this);
		panel4.add(btn4);
		
		lblRes4 = new JLabel("");
		panel4.add(lblRes4);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn4) {
			actionPerformedBtn4(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
		
		try {
		if (e.getSource() == btn2) {
			actionPerformedBtn1(e);
		}
		
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
		}catch (NullPointerException e1) {
			System.out.println(e1.getMessage());
			//e1.printStackTrace();
		}
	}
	
	
	protected void actionPerformedBtn1(ActionEvent e) {
		String res  = JOptionPane.showInputDialog("난 쵝오다.");
		
		if(res.length() == 0 || res == null) {
			lblRes1.setText("꺼져라");
		}else {
			lblRes1.setText("그렇지");
		}
		
	}
	
	
	
	protected void actionPerformedBtn2(ActionEvent e) {
		String res  = JOptionPane.showInputDialog("이름을 입력", "갓명훈");
		
		
		if(res != null) {
			lblRes2.setText("지랄하네");
		}
		
		
		
		
	}
	protected void actionPerformedBtn3(ActionEvent e) {
		JOptionPane.showInputDialog(null, "이름 입력1","제목", JOptionPane.ERROR_MESSAGE);     			//ERROR_MESSAGE
		JOptionPane.showInputDialog(null, "이름 입력2","제목", JOptionPane.INFORMATION_MESSAGE);			//INFORMATION_MESSAGE	
		JOptionPane.showInputDialog(null, "이름 입력3","제목", JOptionPane.WARNING_MESSAGE);				//WARNING_MESSAGE
		JOptionPane.showInputDialog(null, "이름 입력4","제목", JOptionPane.QUESTION_MESSAGE);			//QUESTION_MESSAGE
		JOptionPane.showInputDialog(null, "이름 입력5","제목", JOptionPane.PLAIN_MESSAGE);				//PLAIN_MESSAGE
		
	}
	protected void actionPerformedBtn4(ActionEvent e) {
		String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "Apple.jpg");
		
		String[] selectionValues = {"박유진", "유한솔", "송명훈", "이나연", "우정아"};
		String initialSelectionValue = "박유진";
		
		
		
		Object res = JOptionPane.showInputDialog(
				null,
				"이름을 선택하라",
				"이름 선택스",
				JOptionPane.QUESTION_MESSAGE,
				icon, selectionValues,
				initialSelectionValue);
		lblRes4.setText("선택한 입력은" + res);
		
		
		
	//ERROR_MESSAGE
	//INFORMATION_MESSAGE	
	//WARNING_MESSAGE
	//QUESTION_MESSAGE
	//PLAIN_MESSAGE
		
	}
}
