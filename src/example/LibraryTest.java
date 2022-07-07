package example;

import java.util.ArrayList;
import java.util.List;

/*
 * 모든 책의 가격의 합을 출력.
 * 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력.
 */

class Book{
	private String name;
	private int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		System.out.println("====책 가격의 총 합====");
		int sum = bookList.stream().mapToInt(l -> l.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("====20000원 이상의 책이름 정렬해서 출력.====");
		bookList.stream().filter(l->l.getPrice()>=20000).map(b-> b.getName()).sorted().forEach(b-> System.out.println(b));
	
	}

}
