package Homework;

import java.util.Scanner;

public class HomeworkEx2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=30;
		Product[] p=new Product[size];
		char answer=0;
		System.out.print("상품을 등록하겠습니까?(y/n) : ");
		answer=sc.next().charAt(0);
		while(answer!='n') {
			switch(answer) {
			case 'y':
				input(sc);
		
			}
		}
	
	}
	public static Product input(Scanner sc) {
		Product tmp=new Product();
		System.out.print("상품명 : ");
		String productName=sc.next();
		System.out.print("가격 : ");
		int price=sc.nextInt();
		tmp.setProductName(productName);
		tmp.setPrice(price);
		
		return tmp;
		
	}

}
class Product{
	String productName;
	int price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
	

