package lambda.example;

import java.util.function.*;

// �Լ��� �������̽��� �̸� �����س��� java.util.function ��Ű��.
public class Example5 {

	public static void main(String[] args) {
		Predicate<String> isEmptyStr = s -> s.length() == 0;
		String s ="";
		
		if(isEmptyStr.test(s))
			System.out.println("This is an empty String");
		
		
		
	}

}
