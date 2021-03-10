package swing_study.component.table.abs;

import javax.swing.SwingConstants;

import swing_study.panel.Employee;

public class EmpTablePanel extends AbstractCustomTablePanel<Employee> {

	

	@Override
	protected void setAlignAndWidth() {
		 //컬럼내용 정렬
		 setTableCellAlign(SwingConstants.CENTER, 0, 1,2);
		 setTableCellAlign(SwingConstants.RIGHT,3, 4, 5);
		 
		 
		 //컬럼 너비 조정
		 setTableCellWidth( 100, 250, 100, 100, 100, 100);
		
		
	}

	@Override
	public String[] getColumnNames() {
		
		return new String[] {"사번", "사원명", "직책", "직속상사", "급여", "부서"};
	}
	
	@Override
	protected Object[] toArray(Employee t) {
	
		return new Object[] {t.getEmpNo()
								,t.getEmpName()
								,String.format("%s(%d) ", t.getTitle().gettName(),t.getTitle().gettNo())
								,t.getManager() == null ? "" : t.getManager().getEmpName()
								,String.format("%d ", t.getSalary())
								,String.format("%s(%d) ",t.getDept().getDeptName(), t.getDept().getDeptNo())
		};

	}
}
