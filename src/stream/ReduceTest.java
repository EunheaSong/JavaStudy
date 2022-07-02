package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//stresm.reduce test
/*
 * reduce()������ ���� ��Ʈ���� �Ҹ��ϸ鼭 ���α׷��Ӱ� ���� ������ ����� �����Ѵ�.
 * ó������ ���������� ��� ��Ҹ� �Ҹ��ϸ鼭 �ݺ��ϹǷ� ���� ���꿡 ���Ѵ�.
 */
public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"����ȣ��������������", "ġŲ", "��ٸ���", "������ ����"};
		//reduce�ȿ� ���ٽ����� ��� ������ �Է����־���. ���� �� ���ڿ��� ��ȯ�ϵ���. 
		//�Ű������� ù��° ���� �ʱⰪ. �ι�° �Ű������δ� ���ٽ��� ����.
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->{
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
		}));
		
		//BinaryOperator�������̽��� �����Ͽ� reduce�� ����.
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
	}
}
//BinaryOperator�������̽��� �Լ����������̽���, apply�޼��带 �� �������־���Ѵ�. reduce�� �Ű������� �Է����ָ� apply �޼��尡 ����ȴ�.
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}
