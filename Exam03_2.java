import java.util.Random;
import java.util.Scanner;

public class Exam03_2 {

	public static void main(String[] args) {
		// �������� �����ϱ�
		Random random = new Random(); // �������� �ڷ��� - �빮�ڷ� ����
		Scanner sc = new Scanner(System.in);
		
		int num1 = random.nextInt(5) + 1; // 1 ~ 5 ����
		int num2 = random.nextInt(5) + 1;

		System.out.println("PLUS GAME!!!");
		while (true) {
			System.out.print(num1 + "+" + num2 + " = ");
			int answer = sc.nextInt();
			int result = num1 + num2;
			
			if(answer == result) {
				System.out.println("�����Դϴ�!!!");
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;
			}else {
				System.out.println("�����Դϴ�...");
			}
		
		}

	}
}
