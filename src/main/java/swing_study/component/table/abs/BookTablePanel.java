package swing_study.component.table.abs;

import javax.swing.SwingConstants;

import swing_study.panel.BookInfo;

@SuppressWarnings("serial")
public class BookTablePanel extends AbstractCustomTablePanel<BookInfo> {

	@Override
	public String[] getColumnNames() {
		
		return new String[] {"도서번호", "도서제목", "도서구분"};
	}
	
	@Override
	protected Object[] toArray(BookInfo b) {
		
		return new Object[] {b.getBookNo()
								, b.getBookName()
								,String.format("%d(%s)", b.getBookNumint().getBookNum(), b.getBookNumint().getKindTitle()), 
								};
	}

	@Override
	protected void setAlignAndWidth() {
		//컬럼 내용 정렬
		setTableCellAlign(SwingConstants.CENTER,1 ,2);
		
		//컬럼 너비 조정
		setTableCellWidth(150, 300, 200);
	}

	

}
