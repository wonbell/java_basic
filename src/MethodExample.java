/*
 *  메소드(함수) 정의 및 사용
 */
public class MethodExample {

    /*
     *  구구단을 출력하는 메소드 정의
     */
	static void printGugudan() {
		for (int i = 2; i <= 11; i++) {// 행 반복
			for (int j = 1; j <= 9; j++) {// 열 반복
				System.out.print(i+"*"+j+"="+(i*j) + "\t");
//				직접 다 쓰지 말고 하나의 식을 만들고 넣으면서 쓴다.
			}
			System.out.println();
		}
	}
	/*
	 * 단을 입력받아 해당 단을 출력하는 기능. dan은 매개변수 
	 */
	static void printDan(int dan) {
	     for (int i = 1; i < 10 ; i++) {
			System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
		}
	     System.out.println();
	}
	
	
	/*
	 * 두개의 정수를 입력(전달)받아 해당 정수의 합을 반환하는 기능 
	 */
	static int sum (int x, int y) {
		return x + y;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("구구단 출력하기");
		// 구구단 출력 메소드 사용(호출)
		printGugudan();
		System.out.println(">>>>>>>>>>>>>>>");
		printGugudan();
		printGugudan();
		System.out.println(">>>>>>>>>>>>>>>");
		
//		5단출력
		printDan(5); // 5를 전달인자(Argument)
		System.out.println(">>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>");
		printDan(7);
		
		//메소드에서 준 int x 와는 다른 int x
		
		int x = 500, y = 566468;
		
		int result = sum(x, y);
		
		System.out.println(result);
		
		System.out.println(sum(5, 10));
		
	}
			
	
}
