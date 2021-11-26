import java.util.Random;
import java.util.Scanner;

public class Exam03_2 {

	public static void main(String[] args) {
		// 랜덤숫자 추출하기
		Random random = new Random(); // 레버런스 자료형 - 대문자로 시작
		Scanner sc = new Scanner(System.in);
		
		int num1 = random.nextInt(5) + 1; // 1 ~ 5 까지
		int num2 = random.nextInt(5) + 1;

		System.out.println("PLUS GAME!!!");
		while (true) {
			System.out.print(num1 + "+" + num2 + " = ");
			int answer = sc.nextInt();
			int result = num1 + num2;
			
			if(answer == result) {
				System.out.println("정답입니다!!!");
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;
			}else {
				System.out.println("오답입니다...");
			}
		
		}

	}
}
