/*
 * Label 
 */
public class LabelExample {

	public static void main(String[] args) {
        //레이블 선언
		OUT:
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.println(i + "," +j);
				if(j == 5) {
					//break
					break OUT;
				}
			}
		}
				
	}

}
