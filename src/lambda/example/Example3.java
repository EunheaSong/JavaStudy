package lambda.example;
//외부변수를 참조하는 람다식

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
//			i=10; //i를 아래처럼 람다식이 아닌 경우에 이용하면 값을 수정해도 사용가능하지만, 람다식에서 사용되는 변수들은 자동으로 상수(final)로 간주 되므로 i와 val은 수정이 불가하다.
//			System.out.println("i: "+ i);
//			val = 50; //값 수정 불가.
			
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
