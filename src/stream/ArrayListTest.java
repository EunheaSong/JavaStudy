package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//List를 사용하여 Stream test.
public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tom");
		sList.add("Jin");
		sList.add("Mia");
		
		Stream<String> sStream = sList.stream();
		sStream.forEach(s -> System.out.println(s));
		/*
		 * forEach는 최종 연산자이다.
		 * 반복문의 forEach문을 실행하는 것과 같은 효과.
		 */
		for(String s : sList) {
			System.out.println(s);
		}
		
		//forEach는 최종 연산자이므로, 최종 연산이 끝났기 때문에 새로 스트림을 생성해야한다.
		System.out.println("==sorting==");
		sList.stream().sorted().forEach(s -> System.out.println(s));
		/*
		 * sorted는 정렬(소팅)을 하는 중간 연산자이다. 
		 * 기본으로 내림차순 정렬이된다.문자의 경우 abc 가나다 순.
		 * 기본 자료형은 소팅 기준이 이미 생성되어 있는데, 새로 만든 클래스를 가지고 정렬을 하고 싶을 경우,
		 * comparable을 정의해서 원하는 정렬기준을 넣어주고 사용해야한다.
		 */
		
	}

}
