package JavaAlgorithmFundamentals8Questions;

public class Test07 {
// 다음은 배열에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 * 을 찍어서 
//	그래프를 그리는 프로그램이다
//	<실행 결과>
//	1:***
//	2:**
//	3:**
//	4:****

	public static void main(String[] args) {

		int[] arr = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] cnt = new int[4]; // 각 숫자별 개수보관배열
		int i, j;

		for (i = 0; i < arr.length; i++) {
//			arr[i] -1;                 개수를 저장하는 배열방 번호  
//		cnt[ arr[i]- 1 ]++;				해당 숫자의 개수를 저장하는 배열 위치 
			cnt[arr[i] - 1]++;
		}
		for (i = 0; i < cnt.length; i++) {
			System.out.print(i + 1 + " : ");
			for (j = 0; j < cnt[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
