/*
 *  조건(분기)문 switch 
 */
public class IFExample {

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
		case 1:System.out.println("1입니다");  
		case 2:System.out.println("2입니다"); break;
		case 3:System.out.println("3입니다"); break;
		case 4:System.out.println("4입니다"); break;
		case 5:System.out.println("5입니다"); break;
		default: System.out.println("일치하는 값이 없습니다"); 
		}
//if else와는 다르게 break;를 써야한다 break; 는 중괄호 바깥으로 이동시키는 제어값. break가 없으면 없는 부분은 나온다.
	    
		char some = 'a';
		switch (some) {
		case 'a':System.out.println("1입니다");  
		case 'b':System.out.println("2입니다"); break;
		case 'c':System.out.println("3입니다"); break;
		case 'd':System.out.println("4입니다"); break;
		case 'e':System.out.println("5입니다"); break;
		default: System.out.println("일치하는 값이 없습니다"); 
		}
		
		int score = 88;
		switch (score/10) {
		case 10 :
		case 9: System.out.println("수입니다"); break;
		case 8: System.out.println("우입니다"); break;
		case 7: System.out.println("미입니다"); break;
		case 6: System.out.println("양입니다"); break;
		default: System.out.println("가입니다"); break;			
		}
		
			
	
	    int x = 50, y = 30;
	    char operator = '*';
	    switch (operator) {
		case '+': System.out.println("합 =" + (x +y));	break;
		case '-': System.out.println("뺄셈 =" + (x - y)); break;
		case '*': System.out.println("곱셈 =" + (x * y)); break;
		case '/': System.out.println("나눗셈 =" + (x / y));	break;
        
		}
	}
	
}
	
	
	
	   
	

