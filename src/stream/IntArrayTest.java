package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
	
	public static void main (String[]args) {
		
		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		IntStream intStream = Arrays.stream(arr);
		int sum2 = intStream.sum();
		System.out.println(sum2);
		
//		int count = (int)intStream.count();
//		System.out.println(count);
		//������ �̹� intStream���� ������ �ѹ� �߱� ������ count������ ������ ����. 
		//stream�� �� �� ����ϸ� �Ҹ�ȴ�! �ٽ� ������ �ϰ� �ʹٸ� ���� ������־���Ѵ�.
		int count2 = (int)Arrays.stream(arr).count();
		System.out.println(count2);
		//count : �迭�� �ε��� ������ ��ȯ�Ѵ�. 
		
	}	
	
}
