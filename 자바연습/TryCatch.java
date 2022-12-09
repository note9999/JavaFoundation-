package 자바연습;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수

		while (true) {
			count++;
			try {
				System.out.print("1과 100사이의 값을 입력하세요 :");
				input = new Scanner(System.in).nextInt();

				if (answer > input) {
					System.out.println("더 큰 수를 입력하세요.");

				} else if (answer < input) {
					System.out.println("더 작은 수를 입력하세요.");

				} else {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 " + count + "번입니다.");
					break;
				}
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
			}
		}
	}
}
