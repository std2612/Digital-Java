package AccountBook;

import java.util.*;
import java.util.List;

public class AccountBook {
	int money;
	List<History> hList=new ArrayList<History>();
	
	public int getMoney() {
		return money;
	}

	public void setStartMoney(int money) {
		this.money = money;
	}

	public List<History> gethList() {
		return hList;
	}

	public void sethList(List<History> hList) {
		this.hList = hList;
	}

	public AccountBook() {
		super();
	}

	@Override
	public String toString() {
		return "현재 금액 : "+money+"\n내역\n"+hList;
	}
			
}