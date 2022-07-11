package lambda.example;
//함수형 인터페이스 타입의 매개변수와 변환타입.

@FunctionalInterface
interface MyFunction {
	void run();

}
public class Example {
	
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction () {
		MyFunction f = () -> System.out.println("런합니다잉!");
		return f;
	}
		
	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("런합니다");
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("런한다고요");
			}
		};
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(
				()-> System.out.println("매개변수에 직접 람다식 구현"));
		
	}

}
