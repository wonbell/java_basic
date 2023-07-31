import javax.swing.plaf.synth.SynthOptionPaneUI;

class DataTypeExample {
	public static void main(String[] args) {
		char ch1 = '가';
		char ch2 = 0xAC00;
		char ch3 = '\uAC00';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// 이스케이프 문자 처리
		String message = "\"자바\"는 애플리케이션 개발 \'최강\' 언어입니다";
		// ""나 ''를 설정하기 위해선 "앞에 \를 넣어준다
		System.out.println(message);
		String path = "C:\\a\\b\\c\\some.txt";
		System.out.println(path);
		
//		제어문자
        String message2 = "안녕하세요.\n 장원종입니다.\b";
        System.out.println(message2);
        
        String header = "번호\t이름\t나이";
        System.out.println(header);
        
        //boolean
        boolean isMan = false;
//        boolean flag = 0; 컴파일 에러
        System.out.println(isMan);
//        int double boolean string 제일 많이 쓴다
        
        
        
	}
}
