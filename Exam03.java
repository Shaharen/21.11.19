import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 랜덤숫자 추출하기
		Random random = new Random(); // 레버런스 자료형 - 대문자로 시작
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME!!!");
		while (true) {
			int num1 = random.nextInt(5) + 1; // 1 ~ 5 까지
			int num2 = random.nextInt(5) + 1;

			System.out.print(num1 + "+" + num2 + " = ");
			int answer = sc.nextInt();
			int result = num1 + num2;

			if (answer == result) {
				System.out.println("정답입니다!!!");
			} else {
				while (answer != result) {
					System.out.println("오답입니다...");
					System.out.print(num1 + "+" + num2 + " = ");
					answer = sc.nextInt();
					if (answer == result) {
						System.out.println("정답입니다!!!");
					}
				} sc.close();

			}
			
			
		}
		
	}

}
