
public class Exam05 {

	public static void main(String[] args) {
		// 1 ~ 100까지 3의 배수의 합을 출력
		
		// 1)
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);
		
		// 2)
		int sum2 = 0;
		for (int i = 3 ; i <= 100 ; i += 3) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		// 3)
		int sum3 = 0;
		for (int i = 1; i <= 100/3 ; i++) {
			sum3 = sum3 + 3*i ;
		}
		System.out.println(sum3);

	}

}
