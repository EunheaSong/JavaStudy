package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//List�� ����Ͽ� Stream test.
public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tom");
		sList.add("Jin");
		sList.add("Mia");
		
		Stream<String> sStream = sList.stream();
		sStream.forEach(s -> System.out.println(s));
		/*
		 * forEach�� ���� �������̴�.
		 * �ݺ����� forEach���� �����ϴ� �Ͱ� ���� ȿ��.
		 */
		for(String s : sList) {
			System.out.println(s);
		}
		
		//forEach�� ���� �������̹Ƿ�, ���� ������ ������ ������ ���� ��Ʈ���� �����ؾ��Ѵ�.
		System.out.println("==sorting==");
		sList.stream().sorted().forEach(s -> System.out.println(s));
		/*
		 * sorted�� ����(����)�� �ϴ� �߰� �������̴�. 
		 * �⺻���� �������� �����̵ȴ�.������ ��� abc ������ ��.
		 * �⺻ �ڷ����� ���� ������ �̹� �����Ǿ� �ִµ�, ���� ���� Ŭ������ ������ ������ �ϰ� ���� ���,
		 * comparable�� �����ؼ� ���ϴ� ���ı����� �־��ְ� ����ؾ��Ѵ�.
		 */
		
	}

}
