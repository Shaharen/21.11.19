
public class Exam02 {

	public static void main(String[] args) {
		// while�� Ȱ���Ͽ� 1���� 100���� ���� �� 3�� ����� ���

		int i = 1;

		/*while (true) {
			if (i == 100) {
				break;
			} else if (i % 3 == 0) {
				System.out.print(i);
				i++;
			} else {
				i++;
			}

		}
		*/
		while (i < 101) {
			i++;
			if(i % 3 == 0) {
				System.out.print(i);
			}
		}
		

	}

}
