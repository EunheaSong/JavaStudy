package lambda;

//3가지 방식
public class TestStringConcat {

	public static void main(String[] args) {

		//1. 인터페이스를 구현하는 기존 방식
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "java");

		//2. 람다식으로 사용
		/*
		 * 기존 방법으로 했을때는 인터페이스를 구현하는 클래스를 만들어 주었어야했는데, 
		 * 람다식으로 사용하니 그 과정 없이 사용할 수 있었다.
		 */
		StringConcat concat = (s1 , s2) -> System.out.println(s1+ " " +s2);
		concat.makeString("Hello", "java");
		
		//3. 익명 내부 클래스 사용
		StringConcat sccat = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ " " +s2);
			}
			
		};
		sccat.makeString("Hello", "java");
	}
	/*
	 * 구현한다음 계속 재사용이 될 것이라고 예상이 된다면, 기존 방식대로 클래스로 구현하여 사용하고,
	 * 일회성이라면 2,3번 방식도 좋다.
	 * 
	 * 함수형인터페이스는 메서드를 하나밖에 만들지 못한다. 
	 * 
	 */

}
