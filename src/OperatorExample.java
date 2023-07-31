/*
*자바에서 지원하는 연산자들
*/
public class OperatorExample {

	public static void main(String[] args) {
		int x = 30, y = 5;
		
//	   산술연산자
		System.out.println(x + y); //문자일 경우에는 문자를 결합한다
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); //나누고 나온 나머지 연산자
		
//		+ 연산자 오버로딩(중복정의)
		System.out.println("합 = " + (x +y));
		System.out.println(10 + 50);
		System.out.println("장원종" + "바보");
		System.out.println(10 + "바보"); //숫자는 숫자 글자는 글자 서로 같아야함. 같이 않으면 10을 "10"(글자)으로 인식함
		System.out.println(10 + 30 + "바보"); //숫자와 숫자끼리 덧셈. 10 + 30 으로 계산하고 문자를 붙임. 사칙연산 우선
		System.out.println("바보" + 10 + 30); //문자와 숫자가 붙어짐. 바보+10 으로 하고 30을 글자차럼 붙임. 사칙연산 우선
		System.out.println("바보" + (10 + 30)); //괄호를 넣으면 10 + 30이 우선 계산되고 글자를 붙임
		
		
//		복합대입연산자(+=, -=, *=, /*, %=)
//		x = x + 5;
		x +=5;
		x -=5;
		x *=5;
		System.out.println(x);
		
		x = 10; 
		y = 5;
//		비교연산자(==, !=, >, >=,...)
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);

//      증감연산자( ++, --...)
//		x = x + 1;
//		x += 1 ;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		x = 10;
//		System.out.println(x++);
		System.out.println(++x);
		
		x = 30; 
		y = 50;
		
		System.out.println(x >=30 && y<=50);
		System.out.println(x < 30 && y<=50);
		System.out.println(x < 30 || y<=50);
		System.out.println(!true);
		
//		조건삼항연산자
		int score = 55;
		String result = score >= 60 ? "통과" : "실패";
		System.out.println(result);
		
//		기본 데이터타입 형변환
//		자동 형변환(Promotion - Up Casting)
		double some = 50;
		
//		강제 형변환(Demotion - Down Casting)
		double avg = 85.34567;
		System.out.println(avg);
		System.out.println((int)avg); // ()안에 int를 넣어서 강제로 int로 한다
		
		int avg2 = (int)avg;
		System.out.println(avg2);
		
		
		
	}

}
