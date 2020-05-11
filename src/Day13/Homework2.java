package Day13;

import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=30;
		Product[] pList=new Product[size];
		char answer=0;
		int i;
		for(i=0; answer!='n' && i<size; i++) {
			System.out.print("상품을 등록하겠습니까?(y/n) : ");
			answer=sc.next().charAt(0);
			switch(answer) {
			case 'y':	case 'Y':
				pList[i]=input(sc);
				break;
			case 'n':	case 'N':
				break;
			}
		}
		System.out.println("지금까지 등록된 상품 리스트");
		int total=0;
		for(int j=0; j<i-1; j++) {
			pList[j].print(j);
			total+=pList[j].price;
		}
		System.out.println("총 가격 : "+total+"원");
		sc.close();
	
	}
	public static Product input(Scanner sc) {
		
		System.out.print("상품명 : ");
		String name=sc.next();
		System.out.print("가격 : ");
		int price=sc.nextInt();
		Product tmp=new Product(name, price);
		
		return tmp;
		
	}
	

}
class Product{
	String name;
	int price;
	public Product() {
		
	}
	public Product(String name, int price) {
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void print() {
		System.out.printf("상품명 : %s, 가격 : %d원%n", name, price);
	}
	public void print(int num) {
		System.out.print((num+1)+". ");
		print();
	}
	
}
	

