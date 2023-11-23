

public class Main {

    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점!
        // ++,--

        int a = 10;
        int b = 10;
        int val = ++a + b--;
        System.out.println(val); // 11 + 9 로 20이 나올까?
        // 아니다, ++a는 a에 1을 먼저 더하고 연산을 하지만 b는 연산을 먼저 실행한 후 -1을 뺀다.
        System.out.println(a);
        System.out.println(b);  // 따로 했을 땐 9로 잘 나옴
        //21을 나오게 하고싶다면 b-- -> --b로 바꾸어야한다.
    }
}
