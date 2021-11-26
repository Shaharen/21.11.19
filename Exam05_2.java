
public class Exam05_2 {

	public static void main(String[] args) {
		// 1 ~ 10까지의 3의 배수를 제외하고 출력
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				sum = sum;
			}else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
			

	}

}
