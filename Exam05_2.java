
public class Exam05_2 {

	public static void main(String[] args) {
		// 1 ~ 10������ 3�� ����� �����ϰ� ���
		
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
