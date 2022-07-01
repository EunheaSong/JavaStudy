package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x, y) -> (x >= y) ? x:y;
		//if������ �ص� ���������, ���ٽ��� ������ �� �ִٸ� �ִ��� �����ϴ� ���� ����.
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
		
		
		/*
		 * �ڹٴ� ��ü�������α׷�. ��ü�� �����Ǿ�� �� �ȿ� �ִ� �޼��带 ����� �� �ִ�.
		 * �׷��� ���ٽ� ���������δ� �Ʒ��� ���� �͸� ���� Ŭ����(anonymous inner class)�� �����Ǿ� �����ȴ�. 
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
