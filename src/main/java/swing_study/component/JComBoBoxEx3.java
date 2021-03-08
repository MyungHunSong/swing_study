package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;

import org.omg.CORBA.INITIALIZE;

import swing_study.panel.Department;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import swing_study.panel.DeptPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComBoBoxEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private List<Department> deptList = new ArrayList<Department>();
	private DeptPanel pDept;
	private DefaultComboBoxModel<Department> model;
	private JButton btnAdd;
	private JComboBox cmbDept;
	private JButton btnOk;
	
	
	
	public JComBoBoxEx3() {
		
		deptList.add(new Department(1, "기획", 8));
		deptList.add(new Department(2, "영업", 18));
		deptList.add(new Department(3, "개발", 28));
		
		initialize();
	}
	
	
	public void initialize(){
		setTitle("JComboBox 실전예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));
		
		pDept = new DeptPanel();
		pLeft.add(pDept, BorderLayout.CENTER);
		
		JPanel pBtn = new JPanel();
		pLeft.add(pBtn, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pBtn.add(btnAdd);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		cmbDept = new JComboBox<Department>(new Vector<>(deptList));
		//model = new DefaultComboBoxModel<Department>();
		//cmbDept.setModel(model);
		pRight.add(cmbDept);
		
		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		pRight.add(btnOk);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}
	protected void actionPerformedBtnAdd(ActionEvent e) {
		System.out.println("123");
		System.out.println(pDept.getDepartment());
		Department addDept = pDept.getDepartment();
		
		if(deptList.contains(addDept)) {
			JOptionPane.showMessageDialog(null, "중복 ㄲㅈ");
			return;
		}
		
		
		cmbDept.addItem(addDept);
		JOptionPane.showMessageDialog(null, "추가됨");
		
		
		
		
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "111");
	}
}
