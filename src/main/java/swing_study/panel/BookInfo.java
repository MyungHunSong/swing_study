package swing_study.panel;

public class BookInfo {
	private int bookNo;
	private String bookName;
	private BookKind bookNumint;
	
	
	
	
	



	public BookInfo(int bookNo, String bookName, BookKind bookNumint) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookNumint = bookNumint;
	}



	public int getBookNo() {
		return bookNo;
	}



	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public BookKind getBookNumint() {
		return bookNumint;
	}



	public void setBookNumint(BookKind bookNumint) {
		this.bookNumint = bookNumint;
	}



	@Override
	public String toString() {
		return String.format("BookInfo [bookNo=%s, bookName=%s, bookNumint=%s]", bookNo, bookName, bookNumint);
	}



	
	
	
	
	
}
