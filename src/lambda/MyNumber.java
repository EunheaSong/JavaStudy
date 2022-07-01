package lambda;


/*
 * 함수형 인터페이스. 람다식을 선언하기 위한 인터페이스. 람다가 익명함수와 매개변수만으로 구현이 되므로 ,
 * 단하나의 메소드만 가능. 
 * @FunctionalInterface => 함수형 인터페이스임을 표시함.
 * 인터페이스가 람다식에서 사용될 경우, 람다에서는 하나의 메소드밖에 인식하지 못하기 때문에 사용하게되면 오류가 발생하는데, 
 * @FunctionalInterface이 그것을 미리 인터페이스안에서 메소드를 작성하는 순간에 오류가 나도록 해준다.
 */
@FunctionalInterface 
public interface MyNumber {
	int getMaxNumber(int num1, int num2);
//	void add(); -> 메소드를 추가하니 오류발생.
}
