package example;

import java.util.ArrayList;
import java.util.List;

//���ٽİ� ��Ʈ���� Ȱ��.
public class TravelTest {
/*
 * �ó�����
 * 1. ���� ����� ����մϴ�.
 * 2. ������ �� ����� ����մϴ�.
 * 3. �� �� 20�� �̻��� ����� �̸��� �����Ͽ� ����մϴ�.
 */
	public static void main(String[] args) {
		TravelCustomer customerKim = new TravelCustomer("���¿�",34,15000);
		TravelCustomer customerLim = new TravelCustomer("������",33,30000);
		TravelCustomer customerSeo = new TravelCustomer("������",32,20000);
		TravelCustomer customerJo = new TravelCustomer("������",21,10000);
	
		List<TravelCustomer>customerList = new ArrayList<>();
		customerList.add(customerSeo);
		customerList.add(customerLim);
		customerList.add(customerKim);
		customerList.add(customerJo);
		
		System.out.println("===�� ��� ���===");
		customerList.stream().map(c -> c.getName()).forEach(n -> System.out.println(n));

		int sum = customerList.stream().mapToInt(c-> c.getPrice()).sum();
		System.out.println("===������ �� ���� �����" + sum + "�� �Դϴ�.===");
		
		System.out.println("===���̰� 30�� �̻��� �� ��� �����Ͽ� ���===");
		customerList.stream().filter(c -> c.getAge() >= 30).map(c -> c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
