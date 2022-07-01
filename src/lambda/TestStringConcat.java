package lambda;

//3���� ���
public class TestStringConcat {

	public static void main(String[] args) {

		//1. �������̽��� �����ϴ� ���� ���
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "java");

		//2. ���ٽ����� ���
		/*
		 * ���� ������� �������� �������̽��� �����ϴ� Ŭ������ ����� �־�����ߴµ�, 
		 * ���ٽ����� ����ϴ� �� ���� ���� ����� �� �־���.
		 */
		StringConcat concat = (s1 , s2) -> System.out.println(s1+ " " +s2);
		concat.makeString("Hello", "java");
		
		//3. �͸� ���� Ŭ���� ���
		StringConcat sccat = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ " " +s2);
			}
			
		};
		sccat.makeString("Hello", "java");
	}
	/*
	 * �����Ѵ��� ��� ������ �� ���̶�� ������ �ȴٸ�, ���� ��Ĵ�� Ŭ������ �����Ͽ� ����ϰ�,
	 * ��ȸ���̶�� 2,3�� ��ĵ� ����.
	 * 
	 * �Լ����������̽��� �޼��带 �ϳ��ۿ� ������ ���Ѵ�. 
	 * 
	 */

}
