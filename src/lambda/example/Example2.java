package lambda.example;
//람다식의 타입과 형변환.

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
		
//		System.out.println(()->{}); //에러남. 람다식은 Object형으로 바로 형변환이 안됨. 
		System.out.println((MyFunction2)(()->{})); 
//		System.out.println((MyFunction2)(()->{}).toString()); //에러남. 함수형은 Object로 형변환을 해줘야 Object형처럼 사용할 수 있다.
		System.out.println(((Object)(MyFunction2)(()->{})).toString());

	}
	
	/*
	 * 출력 결과
	 * lambda.example.Example2$$Lambda$23/0x00000001000c03f8@6e8dacdf 이런 형식으로 출력이 된다.
	 * 일반적인 익명 객체인 경우, 외부클래스이름$번호 의 형식으로 나올텐데
	 * 람다식은 회부클래스이름$$Lambda$번호 와 같은 형식이다.
	 */

}
