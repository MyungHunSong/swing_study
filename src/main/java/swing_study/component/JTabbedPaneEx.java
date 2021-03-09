package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import swing_study.panel.TitlePanel;
import swing_study.panel.EmployeePanel;

public class JTabbedPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1;
	private JTabbedPane tabbedPane;
	private DeptPanel pDept;
	private TitlePanel pTitle;

	


	public JTabbedPaneEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서관리");
		
		pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, "직책관리");
		
		EmployeePanel pEmp = new EmployeePanel();
		tabbedPane.addTab("사원", null, pEmp, "사원관리");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btn1 = new JButton("확인");
		btn1.addActionListener(this);
		panel.add(btn1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
	}
	protected void actionPerformedBtn1(ActionEvent e) {
		
		//선택된 탭가져와서
		Component comp = tabbedPane.getSelectedComponent();
		System.out.println(comp);
		//getXX() 호출
		
		if(comp == pDept) {
			JOptionPane.showMessageDialog(null, pDept.getDepartment());
		}
		
		if(comp == pTitle) {
			JOptionPane.showMessageDialog(null, pTitle.getTitle());
		}
//		DeptPanel deptPanel = (DeptPanel) comp;
//		Department department = deptPanel.getDepartment();
//		JOptionPane.showMessageDialog(null, department);
//		deptPanel.clearTf();
		
		// 여기까진가~
		
		
		}
}
