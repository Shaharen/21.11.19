import java.util.Random;
import java.util.Scanner;

public class Exam03_3 {

	public static void main(String[] args) {
		// �������� �����ϱ�
		// ������ 3
		Random random = new Random(); // �������� �ڷ��� - �빮�ڷ� ����
		Scanner sc = new Scanner(System.in);

		int life = 3;

		System.out.println("PLUS GAME!!!");
		while (true) {							// ����
			int num1 = random.nextInt(5) + 1;	// ����
			int num2 = random.nextInt(5) + 1;	// ����
			while (true) {						// life > 0 -> �Ʒ��� break ����
				System.out.print(num1 + "+" + num2 + " = ");
				int answer = sc.nextInt();
				int result = num1 + num2;

				if (answer == result) {
					System.out.println("�����Դϴ�.");
					break;
				} else {
					System.out.println("�����Դϴ�.");
					life -= 1;
					if (life == 0) {
						System.out.println("�������� �����ϴ�.");
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
