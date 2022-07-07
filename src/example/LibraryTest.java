package example;

import java.util.ArrayList;
import java.util.List;

/*
 * ��� å�� ������ ���� ���.
 * å�� ������ 20000�� �̻��� å�� �̸��� �����Ͽ� ���.
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
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		System.out.println("====å ������ �� ��====");
		int sum = bookList.stream().mapToInt(l -> l.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("====20000�� �̻��� å�̸� �����ؼ� ���.====");
		bookList.stream().filter(l->l.getPrice()>=20000).map(b-> b.getName()).sorted().forEach(b-> System.out.println(b));
	
	}

}
