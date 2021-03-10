package swing_study.component.table.abs;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import swing_study.panel.Department;



@SuppressWarnings("serial")
public abstract class AbstractCustomTablePanel<T> extends JPanel {
	private JTable table;

	
	public AbstractCustomTablePanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
	}
	
	
	
	private DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		
		return model;	
	}
	
	
	
	
	// ------getData-----
	private Object[][] getData() {
		return new Object[][] {
			{null, null, null},};
	}
	
	
	
	
	// ------getColumn----
	public abstract String[] getColumnNames();
	
	
	

	
	
// 	---------setList abstract 로 만든것-------
	public  void setList(List<T> list) {
		Object[][]data = new Object[list.size()][];
		 
		 for(int i =0; i < data.length; i++) {
			 data[i] = toArray(list.get(i));
		 }
		 CustomTableModel model = new CustomTableModel(data, getColumnNames());
		 table.setModel(model);
		 
		 
		 setAlignAndWidth();
	}
	
//	 //컬럼내용 정렬
//	 setTableCellAlign(SwingConstants.CENTER, 0, 1);
//	 
//	 //컬럼 너비 조정
//	 setTableCellWidth( 80, 100, 100);
	
	
	protected abstract void setAlignAndWidth();
	
	
	
	
	// -------------
	public void setTableCellAlign(int align, int...idx) {
		TableColumnModel tcm = table.getColumnModel();
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		for(int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	
	
	// -----------
	public void setTableCellWidth(int...width) {
		TableColumnModel tcm = table.getColumnModel();
		

		for(int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
	}
	
	
	
	
	
	protected abstract  Object[] toArray(T t);




	// customtableModel 이다.
	class CustomTableModel extends DefaultTableModel {

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);

		}

		
		
		
		
		@Override
		public boolean isCellEditable(int row, int column) {

			return false;
		}
	}
	

}