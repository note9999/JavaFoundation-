package JavaAlgorithmFundamentals8Questions;

import java.util.Scanner;

// 입력받은 숫자가 회문수인지 아닌지 출력하는 프로그램을 완성하시오
//회문수란? 12321, 15751, 131 -> 앞으로 읽어도 뒤로 읽어도 똑같은것
public class Test06 {

	public static void main(String[] args) {

		int num; // 입력받는 숫자
		int tmp;	// 임시저장
		int result=0;		// 뒤집은 숫자 저장
		
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();

		tmp= num;
		
		while(tmp!=0){
			
		result = result*10+ tmp%10;
		tmp=tmp/10; //123456의 몫이 12345가 됨
		}
		if (num==result) {
			System.out.println("회문수입니다.");
		}else {
			System.out.println("회문수가 아닙니다.");
		}
	}

}
