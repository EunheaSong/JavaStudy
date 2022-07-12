package lambda.example;

import java.util.function.*;

// 함수형 인터페이스를 미리 정의해놓은 java.util.function 패키지.
public class Example5 {

	public static void main(String[] args) {
		Predicate<String> isEmptyStr = s -> s.length() == 0;
		String s ="";
		
		if(isEmptyStr.test(s))
			System.out.println("This is an empty String");
		
		
		
	}

}
