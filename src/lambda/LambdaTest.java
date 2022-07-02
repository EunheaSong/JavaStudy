package lambda;

/*
 * ���ٸ� ����ؼ� �Լ��� ����ó�� ����� �� �ִ�!
 * �Ϲ������� ������ ���Ǵ� 3���� ��Ȳ�� Ȱ���غ���.
 * 1. Ư�� �ڷ����� ���� ���� �� ���� �����ؼ� ��� ex) int a= 10;
 * 2. �Ű������� �����ϱ� ex) int add(int x, int y);
 * 3. �޼����� ��ȯ ������ ��ȯ�ϱ� ex) return num;
 */

interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		//1. Ư�� �ڷ����� ���� ���� �� ���� ����. -> ���ٽ����� �������̽��� �߻� �޼��带 ����.
		PrintString lambdaPrint = str -> System.out.println(str); //���ٰ� �̷��� �������̽��� ������ �� �ȿ��ִ� �߻�޼��尡 �� ������ �ϰԵ�.
		lambdaPrint.showString("hi!");
		/*
		 * ���ٽ����� �������̽��� ������. str�� lambdaPrint�̰���. ��, �������̽�PrintString�̰� str�� �Ǵ� ����.
		 *  PrintString ���� �߻�޼���� ȭ��ǥ �ڷ� ���� �� ���� �ϰԵȴ�.
		 */
		
		//2. �Ű������� �����ϱ� 
		// ������ ����(lambdaPrint)�� ���ٽ��� �����ϰ�, �ش� ������ �Ű������� ����! �׷� �ش� �Լ� �ȿ��� ���ٽ��� �����ϰ���?!
		showMyString(lambdaPrint);
		 
		
		//3. �޼����� ��ȯ ���� ���ٽ� Ȱ��.
		PrintString reStr = returnPrint();
		reStr.showString("hi!!");
		
	}
	//�ش� �޼��带 ����ϴ� ���� static�̱� ������ �̰͵� static���� ����.
	static void showMyString(PrintString lambdaPrint) {
		lambdaPrint.showString("hihihi!");
	}
	
	static PrintString returnPrint() {
		return s -> System.out.println(s + "hello");
	}

}
