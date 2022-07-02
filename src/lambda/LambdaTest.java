package lambda;

/*
 * 람다를 사용해서 함수를 변수처럼 사용할 수 있다!
 * 일반적으로 변수가 사용되는 3가지 상황에 활용해본다.
 * 1. 특정 자료형을 변수 선언 후 값을 대입해서 사용 ex) int a= 10;
 * 2. 매개변수로 전달하기 ex) int add(int x, int y);
 * 3. 메서드의 반환 값으로 반환하기 ex) return num;
 */

interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		//1. 특정 자료형을 변수 선언 후 값을 대입. -> 람다식으로 인터페이스의 추상 메서드를 구현.
		PrintString lambdaPrint = str -> System.out.println(str); //람다가 이렇게 인터페이스를 받으면 그 안에있는 추상메서드가 이 행위를 하게됨.
		lambdaPrint.showString("hi!");
		/*
		 * 람다식으로 인터페이스를 구현함. str이 lambdaPrint이거임. 즉, 인터페이스PrintString이게 str이 되는 것임.
		 *  PrintString 안의 추상메서드는 화살표 뒤로 오게 될 일을 하게된다.
		 */
		
		//2. 매개변수로 전달하기 
		// 위에서 변수(lambdaPrint)에 람다식을 대입하고, 해당 변수를 매개변수로 전달! 그럼 해당 함수 안에서 람다식이 동작하겠지?!
		showMyString(lambdaPrint);
		 
		
		//3. 메서드의 반환 값에 람다식 활용.
		PrintString reStr = returnPrint();
		reStr.showString("hi!!");
		
	}
	//해당 메서드를 사용하는 곳이 static이기 때문에 이것도 static으로 구현.
	static void showMyString(PrintString lambdaPrint) {
		lambdaPrint.showString("hihihi!");
	}
	
	static PrintString returnPrint() {
		return s -> System.out.println(s + "hello");
	}

}
