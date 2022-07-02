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
		//위에서 이미 intStream으로 연산을 한번 했기 때문에 count에서는 에러가 난다. 
		//stream은 한 번 사용하면 소모된다! 다시 연산을 하고 싶다면 새로 만들어주어야한다.
		int count2 = (int)Arrays.stream(arr).count();
		System.out.println(count2);
		//count : 배열의 인덱스 갯수를 반환한다. 
		
	}	
	
}
