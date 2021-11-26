import java.util.Random;
import java.util.Scanner;

public class Exam03_3 {

	public static void main(String[] args) {
		// 랜덤숫자 추출하기
		// 라이프 3
		Random random = new Random(); // 레버런스 자료형 - 대문자로 시작
		Scanner sc = new Scanner(System.in);

		int life = 3;

		System.out.println("PLUS GAME!!!");
		while (true) {							// 삭제
			int num1 = random.nextInt(5) + 1;	// 삭제
			int num2 = random.nextInt(5) + 1;	// 삭제
			while (true) {						// life > 0 -> 아래쪽 break 삭제
				System.out.print(num1 + "+" + num2 + " = ");
				int answer = sc.nextInt();
				int result = num1 + num2;

				if (answer == result) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println("오답입니다.");
					life -= 1;
					if (life == 0) {
						System.out.println("라이프가 없습니다.");
						break;
					}
				}
			}
			if (life == 0) {
				break;
			}
		}

	}

}
