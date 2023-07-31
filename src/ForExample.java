/*
 *  for 반복문
 */
public class ForExample {

	public static void main(String[] args) {

		for (int index = 0; index < 100; index++) {
			System.out.println("바보바보바보");
		}
//		for 안에 있는 index는 개별 index. 위의 index와 아래의 index는 다름.

		int result = 0;
		for (int index = 1; index <= 100; index++) {
			result += index;
		}
		System.out.println(result);

//		중첩 for문을 이용한 사각형 출력
		for (int i = 0; i < 5; i++) {// 행 반복
			for (int j = 0; j < 5; j++) {// 열 반복
				System.out.print('*');
			}
			System.out.println();
		}
			for (int l = 2; l <= 9; l++) {
				for (int k = 1; k <=l-1;  k++) {
					System.out.print('&');
			} 
			System.out.println();
		}
			for (int i = 0; i <= 10; i++) {// 행 반복
				for (int j = 0; j <= i; j++) {// 열 반복
					System.out.print((j+1) + "");
				}
				System.out.println();
			}
			
			for (int i = 0; i < 10; i++) {// 행 반복
				for (int j = 9; j >= i; j--) {// 열 반복
					System.out.print('*');
				}
				System.out.println();
			}
			
//			중첩for문을 활용한 구구단 출력
			for (int i = 2; i <= 9; i++) {// 행 반복
				for (int j = 1; j <= 9; j++) {// 열 반복
					System.out.print(i+"*"+j+"="+(i*j) + "\t");
//					직접 다 쓰지 말고 하나의 식을 만들고 넣으면서 쓴다.
				}
				System.out.println();
			}
	
	}

}
