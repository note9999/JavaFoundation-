package JavaAlgorithmFundamentals8Questions;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Test08 {

	public static void main(String[] args) {
		// 거슬러 줄 금액을 입력받아 계산한다.
		// 보유한 동전의 개수로 거스름돈을 지불할 수 없으면
		// '거스름 돈이 부족합니다.' 라고 출력하고 종료한다.
		// 지불할 돈이 충분히 있으면 거스름돈을 지불한 만큼 가진돈에서 뺴고
		// 남은 동전의 개수를 화면에 출력한다.
		// 출력 결과
//		거스름 받을 금액을 입력하세요. 2680
//		money:2680
//		500원:5
//		100원:1
//		50원:1
//		10원:3
//		==남은 동전의개수--
//		500원:0
//		100원:4
//		50원:4
//		10원:2

		int[] coinUnit = { 500, 100, 50, 10 }; // 동전 단위 저장 배열
		int[] coin = { 5, 5, 5, 5 }; // 동전 개수 저장 배열
		int[] passCoin = new int[4];
		int money;

		System.out.print("거스름 받을 금액을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();

		for (int i = 0; i < coin.length; i++) {

			passCoin[i] = money / coinUnit[i]; // 금액에서 동전 단위 나눠서 동전 개수를 구함

			if (passCoin[i] > coin[i]) { // 가지고 있는 동전 개수보다 큰 지 물어본느 것
				passCoin[i] = coin[i]; // 임시저장된 공간에 내가 가지고 있는 동전 개수로
				coin[i] = 0;
			} else {
				coin[i] = coin[i] - passCoin[i]; // 내가 가진 동전개수에서 임시저장 동전 개수를 뺴줌
			}

			money = money - (coinUnit[i] * passCoin[i]); // 2700원 이라면 500원짜리 다섯개로 2500원 빼줘서 200원 남기는 작업

		}
		if (money > 0) {
			System.out.println("거슬러줄 잔돈이 부족합니다.");
		} else {

			System.out.println("거슬러준 동전개수");
			for (int i = 0; i < coin.length; i++) {
				System.out.println(coinUnit[i] + "원" + coin[i] + "개");

				System.out.println("===남은동전개수====");
				for (i = 0; i < coin.length; i++) {
					System.out.println(coinUnit[i] + "원" + coin[i] + "개");
				}
			}
		}
	}
}
