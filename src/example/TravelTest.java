package example;

import java.util.ArrayList;
import java.util.List;

//람다식과 스트림의 활용.
public class TravelTest {
/*
 * 시나리오
 * 1. 고객의 명단을 출력합니다.
 * 2. 여행의 총 비용을 계산합니다.
 * 3. 고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.
 */
	public static void main(String[] args) {
		TravelCustomer customerKim = new TravelCustomer("김태연",34,15000);
		TravelCustomer customerLim = new TravelCustomer("임윤아",33,30000);
		TravelCustomer customerSeo = new TravelCustomer("서주현",32,20000);
		TravelCustomer customerJo = new TravelCustomer("조유리",21,10000);
	
		List<TravelCustomer>customerList = new ArrayList<>();
		customerList.add(customerSeo);
		customerList.add(customerLim);
		customerList.add(customerKim);
		customerList.add(customerJo);
		
		System.out.println("===고객 명단 출력===");
		customerList.stream().map(c -> c.getName()).forEach(n -> System.out.println(n));

		int sum = customerList.stream().mapToInt(c-> c.getPrice()).sum();
		System.out.println("===고객들의 총 여행 비용은" + sum + "원 입니다.===");
		
		System.out.println("===나이가 30세 이상인 고객 명단 정렬하여 출력===");
		customerList.stream().filter(c -> c.getAge() >= 30).map(c -> c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
