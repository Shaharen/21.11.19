import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// �������� �����ϱ�
		Random random = new Random(); // �������� �ڷ��� - �빮�ڷ� ����
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME!!!");
		while (true) {
			int num1 = random.nextInt(5) + 1; // 1 ~ 5 ����
			int num2 = random.nextInt(5) + 1;

			System.out.print(num1 + "+" + num2 + " = ");
			int answer = sc.nextInt();
			int result = num1 + num2;

			if (answer == result) {
				System.out.println("�����Դϴ�!!!");
			} else {
				while (answer != result) {
					System.out.println("�����Դϴ�...");
					System.out.print(num1 + "+" + num2 + " = ");
					answer = sc.nextInt();
					if (answer == result) {
						System.out.println("�����Դϴ�!!!");
					}
				} sc.close();

			}
			
			
		}
		
	}

}
