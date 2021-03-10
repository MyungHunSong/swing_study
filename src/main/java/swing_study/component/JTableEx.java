package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import swing_study.component.table.MyTablePanel;
import swing_study.component.table.Student;
import swing_study.panel.Department;
import swing_study.panel.Employee;
import swing_study.panel.Title;
import swing_study.component.table.DeptTablePanel;
import swing_study.component.table.abs.TitleTablePanel;
import swing_study.component.table.abs.EmpTablePanel;

public class JTableEx extends JFrame {

	private JPanel contentPane;
	private JPanel pTable1;
	private JPanel pTable2;
	private JPanel pTable4;
	private JTable table1;
	private JPanel pTable3;
	private MyTablePanel pCustomTable2;
	private DeptTablePanel pDeptTable3;
	
	private List<Student> stdList = new ArrayList<>();
	private List<Department> deptList = new ArrayList<>();
	private List<Title> titleList = new ArrayList<Title>();
	private List<Employee> empList = new ArrayList<Employee>();
	
	private DeptTablePanel pDeptPanel3;
	private TitleTablePanel pTitlePanel4;
	
	private JPanel pTable5;
	private JPanel pTable6;
	private EmpTablePanel pEmpTable5;
	
	
	// Employee(int empNo, String empName, Title title, Employee manager, int salary, Department dept)
	public JTableEx() {
		stdList.add(new Student(1, "김인환", 60, 60, 60));
		stdList.add(new Student(2, "이태훈", 70, 71, 80));
		stdList.add(new Student(3, "김상건", 90, 92, 100));
		stdList.add(new Student(4, "전수린", 60, 63, 67));
		
		deptList.add(new Department(1, "개발", 8));
		deptList.add(new Department(2, "기획", 9));
		deptList.add(new Department(3, "총무", 10));
		
		titleList.add(new Title(1, "사장"));
		titleList.add(new Title(2, "부장"));
		titleList.add(new Title(3, "과장"));
		
		empList.add(new Employee(1, "김상건", titleList.get(0),null , 4500000, deptList.get(0)));
		empList.add(new Employee(2, "이태훈", titleList.get(1), new Employee(1, "신사숙녀"), 3500000, deptList.get(1)));
		empList.add(new Employee(3, "이태훈", titleList.get(1), new Employee(1, "신사숙녀"), 3500000, deptList.get(1)));
		
		
		initialize();
		
	}
	private void initialize() {
		setTitle("JTable 예");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		
		pTable1 = new JPanel(); // JTable 할라믄 BorderLayOut으로 바꾸는게 좋다
		pTable1.setBorder(new TitledBorder(null, "\uAE30\uBCF8 \uD14C\uC774\uBE14 \uC0DD\uC131", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pTable1);
		pTable1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane1 = new JScrollPane();
		pTable1.add(scrollPane1, BorderLayout.CENTER);
		
		// table 1 기본테이블
		table1 = new JTable();
		table1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		table1.setModel(getModel());
		scrollPane1.setViewportView(table1);
		
		pTable2 = new JPanel();
		pTable2.setBorder(new TitledBorder(null, "CustomTable", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pTable2);
		pTable2.setLayout(new BorderLayout(0, 0));
		
		
		pTable3 = new JPanel();
		contentPane.add(pTable3);
		pTable3.setLayout(new BorderLayout(0, 0));
		
		pTable4 = new JPanel();
		contentPane.add(pTable4);
		pTable4.setLayout(new BorderLayout(0, 0));
		
		
		
		// CustomTable2 를 수정 해줘야함
		pCustomTable2 = new MyTablePanel();
		pCustomTable2.setList(stdList);
		pTable2.add(pCustomTable2, BorderLayout.CENTER);
		
		
		
		// --- 
		pDeptPanel3 = new DeptTablePanel();
		pDeptPanel3.setList(deptList);
		pTable3.add(pDeptPanel3, BorderLayout.CENTER);
		
		
		
		
		
		//--- TitlePanel4
		pTitlePanel4 = new TitleTablePanel();
		pTitlePanel4.setList(titleList);
		pTable4.add(pTitlePanel4, BorderLayout.CENTER);
		
		pTable5 = new JPanel();
		contentPane.add(pTable5);
		pTable5.setLayout(new BorderLayout(0, 0));
		
		pEmpTable5 = new EmpTablePanel();
		pEmpTable5.setList(empList);
		pTable5.add(pEmpTable5, BorderLayout.CENTER);
		
		pTable6 = new JPanel();
		contentPane.add(pTable6);
		pTable6.setLayout(new BorderLayout(0, 0));
	}
	
	
	
	
	// ----- getModel로 뺀 기본 테이블들------- 이러러로ㅓ로러로ㅓㄹ런 방법도 있구나.
	private DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;
	}
	
	
	// 요게 테이블 필드가 수정당하지 않도록 하기위한 클래스다
	private class CustomTableModel extends DefaultTableModel{

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
			
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			
			return false;
		} 
		
		
		
	}
	

	// getData() 메서드
	private Object[][] getData() {
		return new Object[][] {
			{1, "박유진", 10, "여자"},
			{2, "이태훈", 11, "남자"},
		};
	}
	
	
	// getColumNames 메서드
	private String[] getColumnNames() {
		return new String[] {
			"학생번호", "학생명", "나이", "성별"
		};
	}

}
