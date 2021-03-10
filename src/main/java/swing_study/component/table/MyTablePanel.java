package swing_study.component.table;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class MyTablePanel extends JPanel {
	private JTable table;

	public MyTablePanel() {

		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setModel(getModel());
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 선택이 하나만 되도록 하는법
		scrollPane.setViewportView(table);
	}

	private DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;
	}

	// 내부 클래스로 변경지정 불가하게 맞춰주는것들.
	class CustomTableModel extends DefaultTableModel {

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);

		}

		@Override
		public boolean isCellEditable(int row, int column) {

			return false;
		}
	}

	// getData 를 가독성 잇게 표현해서 리턴 글을 최소화 시킨것.
	private Object[][] getData() {
		Object[][] datas = new Object[1][7];
		datas[0] = new Object[] { null, null, null, null, null, null, null };

		return datas;
	}

	// ----- 위쪽 컬럼값들. ------
	private String[] getColumnNames() {
		return new String[] { "학생번호", "학생명", "국어", "영어", "수학", "총점", "평균" };
	}

	// 무잇인가~~~~~~! 잘못됫다
	public void setList(List<Student> stdList) {
		Object[][] datas = new Object[stdList.size()][];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = toArray(stdList.get(i));
		}

		CustomTableModel model = new CustomTableModel(datas, getColumnNames());
		table.setModel(model);

		// 1 컬럼 위치 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1); // 테이블 가운대 정렬,
		setTableCellAlign(SwingConstants.RIGHT, 2, 3, 4, 5, 6);

		// 2 컬럼별 너비 조정.
		setTableCellWidth(50, 150, 80, 80, 80, 100, 100);
		
		
		// 3 색깔 조절
		setTableCellCondtion(2, 3, 4, 5, 6);

	}

	// 3. 조건에 맞는 셀 색조절(총점이 200 미만은 빨강)
	private void setTableCellCondtion(int... idx) {

		ConditionTableCellRenderer ctcr = new ConditionTableCellRenderer();
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(5).setCellRenderer(ctcr);

		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(ctcr);
		}
	}

	// align 이 CENTER 을 받아온다
	// align 이 RIGHT 를 받아온다. 왜? dtcr.setHorizontalAlignment(align); 이것을 보시라오
	private void setTableCellWidth(int... width) {
		// 컬럼별 너비 조정
		TableColumnModel tcm = table.getColumnModel();

		for (int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);

		}
	}

	// 가변 배열을써서 함수를 정렬 하는 메서드를 만들어준것
	private void setTableCellAlign(int align, int... idx) {
		// 컬럼 내용 정렬
		TableColumnModel tcm = table.getColumnModel(); // 7 개의 컬럼이니
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);

		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr); // 0번컬럼을 가운대로 정렬 해돌라

		}

	}

	// 함수로 만들어줘서 스튜던트 1차원 배열에 넣어주는 방법
	private Object[] toArray(Student std) {
		Object[] data = new Object[] { std.getStdNo(), std.getStdName(), std.getKor(), std.getEng(), std.getMath(),
				std.getTotal(), String.format("%.2f", std.getAverage()) };

		return data;
	}

	// 내부클래스이 내부 클래스 머지?? 머가 어떻게 되는겨
	private class CustomTalbeModel extends DefaultTableModel {

	}

	private class ConditionTableCellRenderer extends JLabel implements TableCellRenderer {

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {

			setText(value == null ? "" : value.toString());
			setOpaque(true);

			int total = (int) table.getValueAt(row, 5);
			if (total < 200) {
				setBackground(Color.RED);
			} else {
				setBackground(Color.WHITE);
			}
			setHorizontalAlignment(SwingConstants.RIGHT);

			return this;
		}

	}

}
