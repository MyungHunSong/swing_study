package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;

public class EmployeePanel extends JPanel {
	private JTextField tfNo;
	private JTextField tfName;
	private JPasswordField pfPass1;
	private JTextField pfPass2;
	private JComboBox cmbTitle;
	private JComboBox cmbManger;
	private JSpinner spinSalary;
	private JComboBox cmbDept;
	private JDateChooser dateHire;

	public EmployeePanel() {

		initialize();
	}

	private void initialize() {
		setBorder(new TitledBorder(null, "사원 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));

		JPanel pItem = new JPanel();
		add(pItem, BorderLayout.CENTER);
		pItem.setLayout(new GridLayout(0, 2, 10, 0));

		JLabel lblNo = new JLabel("사원 번호");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblNo);

		tfNo = new JTextField();
		tfNo.setColumns(10);
		pItem.add(tfNo);

		JLabel lblName = new JLabel("사원명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblName);

		tfName = new JTextField();
		tfName.setColumns(10);
		pItem.add(tfName);

		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblTitle);

		cmbTitle = new JComboBox();
		pItem.add(cmbTitle);

		JLabel lblManager = new JLabel("직속상사");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblManager);

		cmbManger = new JComboBox();
		pItem.add(cmbManger);

		JLabel lblSalary = new JLabel("급여");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblSalary);

		spinSalary = new JSpinner();
		pItem.add(spinSalary);

		JLabel lblDept = new JLabel("부서");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblDept);

		cmbDept = new JComboBox();
		pItem.add(cmbDept);

		JLabel lblHireDate = new JLabel("입사일");
		lblHireDate.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblHireDate);

		dateHire = new JDateChooser();
		pItem.add(dateHire);

		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass1);

		pfPass1 = new JPasswordField();
		pItem.add(pfPass1);

		JLabel lblPass2 = new JLabel("비멀번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass2);

		pfPass2 = new JTextField();
		pItem.add(pfPass2);
		pfPass2.setColumns(10);

		JPanel spacePanel = new JPanel();
		pItem.add(spacePanel);
		spacePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel lblResultPanel = new JPanel();
		pItem.add(lblResultPanel);
		lblResultPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel pTop = new JPanel();
		add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel pPic = new JPanel();
		pTop.add(pPic);
		pPic.setLayout(new BorderLayout(0, 0));

		JLabel lblPic = new JLabel("");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\common.jpg"));
		lblPic.setPreferredSize(new Dimension(100, 120));
		pPic.add(lblPic, BorderLayout.CENTER);

		JPanel pBtnPic = new JPanel();
		pPic.add(pBtnPic, BorderLayout.SOUTH);

		JButton btnAddPic = new JButton("사진 추가");
		pBtnPic.add(btnAddPic);
	}
	
	public void setEmployee(Employee employee) {
		
	}
	
	public Employee getEmployee() {
		return null;
	}
	
	public void clearTf() {
		
	}

}