package AccountBook;

public class CashBook {
	
	private String date;
	private String content;
	private boolean inEx;
	private int money;
	private String type;
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public boolean isInEx() {
		return inEx;
	}
	
	public void setInEx(boolean inEx) {
		this.inEx = inEx;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "CashBook [date=" + date + ", content=" + content + ", inEx=" + inEx + ", money=" + money + ", type="
				+ type + "]";
	}
	
	public CashBook() {
		super();
	}

	public CashBook(int inEx, String date, String type, String content, int money) {
		this.inEx=inEx==0? true : false;
		this.date=date;
		this.type=type;
		this.content=content;
		this.money=money;
	}

	
	
}
