package lambda.example;
//���ٽ��� Ÿ�԰� ����ȯ.

@FunctionalInterface
interface MyFunction2{
	void myMethod();
	
}
public class Example2 {

	public static void main(String[] args) {
		MyFunction2 f = () -> {};
		Object obj = (MyFunction2)(
				() -> {});
		String str = ((Object)(MyFunction2)(
				() -> {})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()->{}); //������. ���ٽ��� Object������ �ٷ� ����ȯ�� �ȵ�. 
		System.out.println((MyFunction2)(()->{})); 
//		System.out.println((MyFunction2)(()->{}).toString()); //������. �Լ����� Object�� ����ȯ�� ����� Object��ó�� ����� �� �ִ�.
		System.out.println(((Object)(MyFunction2)(()->{})).toString());

	}
	
	/*
	 * ��� ���
	 * lambda.example.Example2$$Lambda$23/0x00000001000c03f8@6e8dacdf �̷� �������� ����� �ȴ�.
	 * �Ϲ����� �͸� ��ü�� ���, �ܺ�Ŭ�����̸�$��ȣ �� �������� �����ٵ�
	 * ���ٽ��� ȸ��Ŭ�����̸�$$Lambda$��ȣ �� ���� �����̴�.
	 */

}
