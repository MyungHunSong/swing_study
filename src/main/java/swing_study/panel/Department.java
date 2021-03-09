package swing_study.panel;

public class Department {
	private int deptNo;
	private String deptName;
	private int floor;
	
	public Department() {

	}
	
	
// private List<Employee> empList;
	public Department(int deptNo) {
		this.deptNo = deptNo;
	}

	

	public Department(String deptName) {
		this.deptName = deptName;
	}
	

	
	

	public Department(int deptNo, String deptName, int floor) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.floor = floor;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s (%d)", deptName, floor);
	}
	
	

}
