class IntegerExample {
	public static void main(String[] args) {
		//정수 여러가지 표기법
		
		int num1 = 128; //10진수 표기
		int num2 = 0b0101; //2진수 표기
		int num3 = 007; //8진수 표기
		int num4 = 0x10AB; //16진수 표기
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		long balace = 11111111111L;
		//long은 뒤에 L을 넣어줘야함

		//실수 표현
		float pi = 3.14F;
		double pi2 = 3.14345356484646845646486468468468468464564213131321;
		//15자리까지 표현 알아서 자름
		System.out.println(pi2);

	
	}
}
