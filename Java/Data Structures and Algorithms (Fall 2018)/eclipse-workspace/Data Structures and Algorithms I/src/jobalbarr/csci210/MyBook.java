package jobalbarr.csci210;

public class MyBook {

	private String title;
	private int pageCnt;
	private double price;

	public MyBook(String title, int pageCnt, double price) {
		this.title = title;
		this.pageCnt = pageCnt;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public double getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s    %d pg    $%4.2f", title, pageCnt, price);
	}

}