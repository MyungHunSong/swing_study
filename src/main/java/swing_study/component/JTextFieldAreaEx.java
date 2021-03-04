package swing_study.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JTextFieldAreaEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JPasswordField pfPass;
	private JPasswordField pfPass2;
	private JTextArea tA;
	private JLabel lblConfirm;
	private JDateChooser dateChooser;
	private JButton btnAddInsert;
	private JButton btnAddCancle;

	
	public JTextFieldAreaEx() {
		initialize();
	}
	private void initialize() {
		setTitle("텍스트 필드 관련");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pCenter.add(scrollPane, BorderLayout.EAST);
		
		tA = new JTextArea();
		tA.setEditable(false);
		pCenter.add(tA, BorderLayout.CENTER);
		
		JPanel pNorth = new JPanel();
		pNorth.setPreferredSize(new Dimension(200, 250));
		pNorth.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblName);
		
		tfName = new JTextField();
		pNorth.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblPass = new JLabel("비밀 번호");
		lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass);
		
		pfPass = new JPasswordField();
		pfPass.getDocument().addDocumentListener(listener);
		pNorth.add(pfPass);
		
		JLabel lblPass2 = new JLabel("비밀 번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass2);
		
		pfPass2 = new JPasswordField();
		pfPass2.getDocument().addDocumentListener(listener);
		pNorth.add(pfPass2);
		
		JPanel panel = new JPanel();
		pNorth.add(panel);
		
		lblConfirm = new JLabel("불일치");
		lblConfirm.setFont(new Font("굴림", Font.BOLD, 12));
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setForeground(Color.RED);
		pNorth.add(lblConfirm);
		
		JLabel lblBirths = new JLabel("생년월일");
		lblBirths.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblBirths);
		
		dateChooser = new JDateChooser(new Date());
		dateChooser.getCalendarButton().addActionListener(this);
		pNorth.add(dateChooser);
		
		btnAddInsert = new JButton("추가");
		btnAddInsert.addActionListener(this);
		pNorth.add(btnAddInsert);
		
		btnAddCancle = new JButton("취소");
		btnAddCancle.addActionListener(this);
		pNorth.add(btnAddCancle);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAddCancle) {
			actionPerformedBtnAddCancle(e);
		}
		if (e.getSource() == btnAddInsert) {
			actionPerformedBtnAddInsert(e);
		}
		if (e.getSource() == dateChooser.getCalendarButton()) {
			actionPerformedDateChooserCalendarButton(e);
		}
		if (e.getSource() == tfName) {
			actionPerformedTfName(e);
		}
	}
	protected void actionPerformedTfName(ActionEvent e) {
		if(tfName.getText().length()!=0) {
			Date d = dateChooser.getDate();
			String msg = String.format("%s - %tF%n", tfName.getText(), d);
			tA.append(msg);
			ClearAng();
			
		}else {
			pfPass2.setText("");
			pfPass.requestFocus(); //커서가 가도록 하는 기능
			pfPass.selectAll();
		}
	}
	
	protected void actionPerformedDateChooserCalendarButton(ActionEvent e) {
		
	}
	protected void actionPerformedBtnAddInsert(ActionEvent e) {
		
		if(lblConfirm.getText().equals("일치")) {
			Date d =dateChooser.getDate();
			String msg = String.format("%s - %tF%n", tfName.getText(), d);
			tA.append(msg);
			
			ClearAng();
		}else{
			pfPass2.setText("");
			pfPass.requestFocus(); //커서가 가도록 하는 기능
			pfPass.selectAll();
		}		
	}
	protected void actionPerformedBtnAddCancle(ActionEvent e) {
		ClearAng();
	}
	
	 DocumentListener listener = new DocumentListener() {
		
		 @Override
			public void removeUpdate(DocumentEvent e) {
				getMessage();
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				getMessage();
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				getMessage();
				
			}

			private void getMessage() { // char터 배열로 받아 왓기에
				String pw1 = new String(pfPass.getPassword()); // 캐릭터 배열을 스트링으로 넣어줌
				String pw2 = String.valueOf(pfPass2.getPassword());
				if(pw1.equals(pw2)) {
					lblConfirm.setText("일치");
				}else {
					lblConfirm.setText("불일치");
				}
				
			}
	};
	// 클리어 시키는 것
	private void ClearAng() {
		tfName.setText("");
		pfPass.setText("");
		pfPass2.setText("");
		dateChooser.setDate(new Date());
		lblConfirm.setText("");
		tfName.requestFocus();
	}
}
