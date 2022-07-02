package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//stresm.reduce test
/*
 * reduce()연산은 만든 스트림을 소모하면서 프로그래머가 직접 지정한 기능을 수행한다.
 * 처음부터 마지막까지 모든 요소를 소모하면서 반복하므로 최종 연산에 속한다.
 */
public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"무야호오오오오오오옹", "치킨", "기다린다", "답장을 해줘"};
		//reduce안에 람다식으로 기능 수행을 입력해주었다. 가장 긴 문자열을 반환하도록. 
		//매개변수의 첫번째 값은 초기값. 두번째 매개변수로는 람다식을 구현.
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->{
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
		}));
		
		//BinaryOperator인터페이스를 구현하여 reduce에 적용.
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
	}
}
//BinaryOperator인터페이스는 함수형인터페이스로, apply메서드를 꼭 구현해주어야한다. reduce에 매개변수로 입력해주면 apply 메서드가 실행된다.
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}
