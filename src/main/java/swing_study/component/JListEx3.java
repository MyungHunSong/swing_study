package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class JListEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private DeptPanel pLeftCenter;
	private JList<Department> deptList;
	private DefaultListModel<Department> model;
	private JPanel panel;
	private JPanel pRight;
	
	
	
	
	private JButton btn1;
	private JButton btn4;
	private JButton btn2;
	private JButton btn3;
	
	
	
	
	
	public JListEx3() {
		initialize();
		
		model.addElement(new Department(1, "기획", 8));
		model.addElement(new Department(2, "영업", 18));
		model.addElement(new Department(3, "개발", 28));
	}
	private void initialize() {
		setTitle("JList응용");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 686, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 0));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));
		
		pLeftCenter = new DeptPanel();
		pLeft.add(pLeftCenter, BorderLayout.CENTER);
		
		JPanel pLeftSouth = new JPanel();
		pLeft.add(pLeftSouth, BorderLayout.SOUTH);
		
		
		
		pRight = new JPanel();
		pRight.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uBD80\uC11C\uBAA9\uB85D", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pRight);
		pRight.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pRight.add(scrollPane);
		
		deptList = new JList();
		deptList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		model = new DefaultListModel<Department>();
		deptList.setModel(model);
		scrollPane.setViewportView(deptList);
		
		panel = new JPanel();
		pRight.add(panel, BorderLayout.SOUTH);
		
		// BTN집합소
		btn1 = new JButton("추가");
		btn1.addActionListener(this);
		pLeftSouth.add(btn1);
		
		btn2 = new JButton("확인");
		btn2.addActionListener(this);
		panel.add(btn2);
		
		btn3 = new JButton("수정");
		btn3.addActionListener(this);
		panel.add(btn3);
		
		btn4 = new JButton("삭제");
		btn4.addActionListener(this);
		panel.add(btn4);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}

		if (e.getSource() == btn4) {
			actionPerformedBtn4(e);
		}

		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn1) {
			if(btn1.getText().equals("추가")) { //여기서 btn1.getText().equals("추가")비교해준다
			actionPerformedBtn1(e);
			}else {
				actionPerformedUpdateBtn1(e);
			}
		}
			
		
		
	}
	
// UpdateBtn1	
	private void actionPerformedUpdateBtn1(ActionEvent e) {
		System.out.println(123);
		Department updateDept = pLeftCenter.getDepartment();
		int idx = deptList.getSelectedIndex();
		model.set(idx, updateDept);
//		pLeftCenter.clearTf();
		
	}
	protected void actionPerformedBtn1(ActionEvent e) {
		Department dept = pLeftCenter.getDepartment();
		pLeftCenter.clearTf();
		model.addElement(dept);
		JOptionPane.showMessageDialog(null, "추가 되엇습니다.");
		
		
	}
	
	//확인
	protected void actionPerformedBtn2(ActionEvent e) {
		//int idx = deptList.getSelectedIndex(); Department selDept = model.get(idx);
		//String message1 = String.format("%d %s %d", selDept.getDeptNo(),
		// selDept.getDeptName(),selDept.getFloor());
		 
		Department dept = deptList.getSelectedValue(); //선택된것 가지고 오는것 //index로 하면 일이 번거러워짐
		String message = String.format("%d %s %d", dept.getDeptNo(), dept.getDeptName(),dept.getFloor());
		JOptionPane.showMessageDialog(null, message );
	}
	
	
//	protected void actionPerformedBtn3(ActionEvent e) {
//		Department dept = deptList.getSelectedValue();
//		pLeftCenter.setDepartment(dept); // set으로 가져오면 돼는거
//		
//		btn1.setText("수정");
//	}
	protected void actionPerformedBtn4(ActionEvent e) {
		int idx = deptList.getSelectedIndex();
	 	model.remove(idx);	
	}
	
	protected void actionPerformedBtn3(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		pLeftCenter.setDepartment(dept);
		btn1.setText("수정");
	}
}
