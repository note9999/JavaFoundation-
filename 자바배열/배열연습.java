import java.util.Arrays;

public class 배열연습 {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArray3 = new int[3];
        boolean[] boolArray = new boolean[3];
        String[] stringArray2 = new String[3];

        // 배열 선언 먼저! -> 나중에 초기화
        int[] intArray2;
        intArray2 = new int[3];

        // 생성한 배열을 '순회' -> 배열의 값을 하나씩 뽑아서 조회한다.
        // (1) 단건 조회
        System.out.println(intArray3[1]);
        // (2) 다건 조회

         // 배열 초기화 하기
        // 1. 배열에 특정값 대입해서 선언
        int[] intArr5 = { 1, 2, 3, 4, 5};
        String[] stringArray = {"a","b","c","d"};
        // 2. for문을 통해서 대입
        for(int i=0; i<intArr5.length;i++){
           intArr5[i]=i;
        }
       // 다건출력
        for (int i=0;i<intArr5.length;i++) {
            System.out.println(intArr5[i]);
        }

        for ( int item: intArr5) {
            System.out.println(item);

            // 배열의 주소를 모두 같은 값으로 초기화
            Arrays.fill(intArr5,1 );

            for( int item2: intArr5) {
                System.out.println(item2);
            }
        }
    }
}
