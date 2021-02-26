package swing_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JpanerEx extends JFrame implements ActionListener {

	private DeptPanel contentPane;
	private JButton btnSetDept;
	private DeptPanel pDept;
	private JButton btnClear;
	private JButton btnGetDept;

	public JpanerEx() {
		initialize();
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 100, 450, 300);
		contentPane = new DeptPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pDept = new DeptPanel();
		contentPane.add(pDept, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnSetDept = new JButton("부서 설정");
		btnSetDept.addActionListener(this);
		panel.add(btnSetDept);
		
		btnGetDept = new JButton("부서 가져오기");
		btnGetDept.addActionListener(this);
		panel.add(btnGetDept);
		
		btnClear = new JButton("초기화");
		btnClear.addActionListener(this);
		panel.add(btnClear);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGetDept) {
			actionPerformedBtnGetDept(e);
		}
		if (e.getSource() == btnClear) {
			actionPerformedBtnClear(e);
		}
		if (e.getSource() == btnSetDept) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		Department dept = new Department(1, "기획", 9);
		pDept.setDepartment(dept);
	}
	protected void actionPerformedBtnClear(ActionEvent e) {
		pDept.clearTf();
	}
	protected void actionPerformedBtnGetDept(ActionEvent e) {
		Department dept = pDept.getDepartment();
		JOptionPane.showMessageDialog(null, dept);
	}
}
