package JavaAlgorithmFundamentals8Questions;

// 다음은 숫자맞추기 게임을 작성한 것이다 1과 사이의 100값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다
// 사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다
// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고
// 몇번만에 숫자를 맞췄는 지 알려준다
// ex) 컴퓨터가 랜덤을 1~100숫자를 정함 ->80이라고 가정
// 숫자 입력 :50 -> 입력한 숫자보다크다, 숫자 입력: 90 입력한 숫자보다 작다
// 마지막에 정답을 입력하면 맞췄습니다. 총 시도 횟수는 3번입니다. 
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 100) + 1; // 1부터 100까지 숫자생성시키기 

		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		int numGuesses = 0;
		while (guess != number) {
			System.out.println("숫자를 입력하세요 :");
			guess = scanner.nextInt();
			numGuesses++;

			if (guess < number) {
				System.out.println("입력한 숫자보다 큽니다.");
			} else if (guess > number) {
				System.out.println("입력한 숫자보다 작습니다.");
			}
		}
		System.out.println("맞췄습니다. " + " 총 시도횟수: " + numGuesses);
	}
}
