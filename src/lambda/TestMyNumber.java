package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y) ? x:y;
		//if문으로 해도 상관없지만, 람다식은 생략할 수 있다면 최대한 생략하는 것이 좋다.
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
		
		
		/*
		 * 자바는 객체지향프로그램. 객체가 생성되어야 그 안에 있는 메서드를 사용할 수 있다.
		 * 그래서 람다식 내부적으로는 아래와 같이 익명 내부 클래스(anonymous inner class)가 생성되어 구현된다. 
		 */
		int i = 100;
		MyNumber aaa = new MyNumber() {

			@Override
			public int getMaxNumber(int num1, int num2) {
				// TODO Auto-generated method stub
				System.out.println(i);
				return 0;
			}
			
		};

	}

}
