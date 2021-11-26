
public class Exam04 {

	public static void main(String[] args) {
		// for 문 (초기화; 검사; 반복후 작업)
		// 횟수가 정해진 경우에 사용 (언제부터 - 초기화구문 / 언제까지 - 검사 조건)
		// 초기화 -> 검사 -> 실행문장 -> 반복후 작업
		// -> 검사 -> 실행문장 -> 반복후작업 -> ..... -> 검사 false -> 반복끝
		
		// 1을 5번 출력하시오
		for(int i = 1; i <= 5; i++) {		// 반복 완료 후 i = 6 임
			System.out.println(1);
		}
		// 11부터 30까지 출력
		for(int i = 11; i <= 30; i++) {
			System.out.println(i);
		}
		// 96에서 53까지 출력
		for(int i = 96; i >= 53; i--) {
			System.out.println(i);
		}
		
		

	}

}
