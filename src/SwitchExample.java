/*
 *  조건(분기)문 if 
 */
public class SwitchExample {

	public static void main(String[] args) {
		int score = 88;
//		단순 if문. if가 한줄이면 {}생략 가능하지만 하지 않는게 좋다.
		if(score >= 60) {
			System.out.println("참 잘했어요");
		
		}
		
		System.out.println("참 잘했어요...");
		
//		if ~ else ~
	
		if (score >=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	   String result = score >= 60 ? "합격" : "불합격";
	   System.out.println(result);
	   
	   int num = 56;
	   if ((num % 2) == 0) {
		System.out.println("짝수");
	} else {
        System.out.println("홀수");
	}
	   
		
//	   다중 if 문
	   if (score >= 90) {
		System.out.println("수");
	} else if(score >= 80){
        System.out.println("우");
	} else if(score >= 70){
        System.out.println("미");
	} else if(score >= 60){
        System.out.println("양");
	} else {
        System.out.println("가");
	} 
		
	
	}
	
	   
	
}
