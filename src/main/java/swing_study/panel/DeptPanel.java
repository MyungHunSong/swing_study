package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DeptPanel extends JPanel {
	private JTextField tfDeptNo;
	private JTextField tfDeptName;
	private JTextField tfFloor;
	
// jpanel은 기본적으로 플로우 레이아웃 이다
	
	public DeptPanel() {

		initialize();
	}
	
	public Department getDepartment() {
		int deptNo = Integer.parseInt(tfDeptNo.getText().trim());  // parseInt  set와 비슷한 개념 정수로 뺴돌라 라는 말
		String deptName = tfDeptName.getText().trim(); //trim() 공백 제거
		int floor = Integer.parseInt(tfFloor.getText().trim());
		return new Department(deptNo, deptName, floor);
		
	}
	public void setDepartment(Department department) {
//	밑애꺼랑 의미가 같다	tfDeptNo.setText(String.valueOf(department.getDeptNo()));
		tfDeptNo.setText(department.getDeptNo() + "");
		tfDeptName.setText(department.getDeptName());
		tfFloor.setText(department.getFloor() + "");
	}
	
	
	
	
	
	
	
	
	public void clearTf() {
//		밑애꺼랑 의미가 같다	tfDeptNo.setText(String.valueOf(department.getDeptNo()));
			tfDeptNo.setText("");
			tfDeptName.setText("");
			tfFloor.setText("");
		}
		
	
	
	
	
	
	
	
	
	
	
	private void initialize() {
		setBorder(new TitledBorder(null, "부서 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblDeptNo = new JLabel("부서번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tfDeptNo = new JTextField();
		add(tfDeptNo);
		tfDeptNo.setColumns(10);
		
		JLabel lblDeptName = new JLabel("부서명");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		tfDeptName.setColumns(10);
		add(tfDeptName);
		
		JLabel lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tfFloor = new JTextField();
		tfFloor.setColumns(10);
		add(tfFloor);
	}

}
