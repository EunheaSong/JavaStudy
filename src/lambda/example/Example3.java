package lambda.example;
//�ܺκ����� �����ϴ� ���ٽ�

@FunctionalInterface
interface MyFuunction3{
	void myMethod();
}
class Outer{
	int val=10;
	
	class Inner {
		int val=20;
		
		void method(int i) {
			int val=30;
//			i=10; //i�� �Ʒ�ó�� ���ٽ��� �ƴ� ��쿡 �̿��ϸ� ���� �����ص� ��밡��������, ���ٽĿ��� ���Ǵ� �������� �ڵ����� ���(final)�� ���� �ǹǷ� i�� val�� ������ �Ұ��ϴ�.
//			System.out.println("i: "+ i);
//			val = 50; //�� ���� �Ұ�.
			
			MyFuunction3 f = () -> {
			System.out.println("i: "+ i);
			System.out.println("val: "+ val);
			System.out.println("this.val: "+ ++this.val); 
			System.out.println("Outer.this.val: "+ ++Outer.this.val);
			};
			f.myMethod();
		}
	}
}
public class Example3 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); 
		inner.method(100);
	}

}
