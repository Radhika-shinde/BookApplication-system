package bookApplication;

public class Book {
	
	private int bookId;
	private String bookName;
	private Double bookPrice;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookId,String bookName,double bookPrice) {
		super();
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		
	}
	
	
	
	

}
