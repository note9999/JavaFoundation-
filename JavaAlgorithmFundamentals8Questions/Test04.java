package JavaAlgorithmFundamentals8Questions;

import java.util.Scanner;

//int 타입의 변수 num을 입력받아 각자리의 합을 더한 결과를 출력하는 코드를 완성하라
//만약 변수 num의 값이 12345라면, '1+2+3+4+5' 의 결과인 15를 출력하라
//숫자입력:12345
//결과:15
public class Test04 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	        int sum = 0;
	        int number;
	        System.out.print("숫자입력: ");
	        number = sc.nextInt();


	        while (number > 0) {
	            sum += number % 10; // sum= sum+ number%10

	            number /= 10;			
	        }

	        System.out.println("결과입력: " + sum);
	    }
	}