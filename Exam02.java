
public class Exam02 {

	public static void main(String[] args) {
		// while를 활용하여 1부터 100까지 숫자 중 3의 배수만 출력

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
