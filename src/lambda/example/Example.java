package lambda.example;
//�Լ��� �������̽� Ÿ���� �Ű������� ��ȯŸ��.

@FunctionalInterface
interface MyFunction {
	void run();

}
public class Example {
	
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction () {
		MyFunction f = () -> System.out.println("���մϴ���!");
		return f;
	}
		
	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("���մϴ�");
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("���Ѵٰ��");
			}
		};
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(
				()-> System.out.println("�Ű������� ���� ���ٽ� ����"));
		
	}

}
