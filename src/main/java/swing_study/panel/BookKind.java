package swing_study.panel;

public class BookKind {
	public int BookNum;
	public String kindTitle;
	
	
	public BookKind(int bookNum, String kindTitle) {
		BookNum = bookNum;
		this.kindTitle = kindTitle;
	}


	public int getBookNum() {
		return BookNum;
	}


	public void setBookNum(int bookNum) {
		BookNum = bookNum;
	}


	public String getKindTitle() {
		return kindTitle;
	}


	public void setKindTitle(String kindTitle) {
		this.kindTitle = kindTitle;
	}


	@Override
	public String toString() {
		return String.format("BookKind [BookNum=%s, kindTitle=%s]", BookNum, kindTitle);
	}
	
	
	
}
