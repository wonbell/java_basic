/*
 *  반복문 while 
 */
public class WhileExample {

	public static void main(String[] args) {
		int index = 0;
		while (index <= 100) {
			System.out.println("바보바보바보!!!!");	
            index ++;		
		}
		// ++ 넣음으로써 +1 +2 +3 ......까지 가서 true 값이 <=100 이아닌 false 나올때까지 100번 나옴
		
		int result = 0;
		index = 1;
		while (index <= 100) {
//			result = result + index;
			result += index;
			index++;
		}
	System.out.println("누적합 :" + result);
	
	
	   int sum = 0, oddSum = 0, evenSum = 0;
	   index = 1;
       while (index <=100) {
		sum += index;
		if((index % 2) == 0) {
		    evenSum += index;
		}else {	
            oddSum += index;		
		}
		
			index++;
	}	  
	System.out.println("누적합 :" + (oddSum + evenSum));
    System.out.println("홀수합 :" + oddSum);
	System.out.println("짝수합 :" + evenSum);
	
	index = 0;
	do { 
		System.out.println("풀스택 웹 개발자과정 화이팅");
        index++;	
	} while (index < 100);
       
       
	}
	
}
