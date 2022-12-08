package JavaAlgorithmFundamentals8Questions;
//1+(-2)+3+(-4)... 와 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상 되는지 구하시오. 결과: 199 

public class Test02 {

	public static void main(String[] args) {

		int sum = 0; // 합계 저장 변수 
		int num=0; // 숫자(양수,음수 둘다 표현)
		int i=0; // 숫자( 양수, 음수 표현 x)
		int s=1;
	
	 while (true) {
		 i++;
		 num=i*s;
	 
		 sum = sum+num;
		 s=s*-1;
	 	
		 if (sum>=100) {
			 break;
		 	}
	 	}
	System.out.println("숫자: "+num);
	System.out.println("합계: "+ sum);
	}
}
