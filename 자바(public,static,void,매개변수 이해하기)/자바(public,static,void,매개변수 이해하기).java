//[JDK]
//역할1. 컴파일러
//역할2. JRE
//역할3. JDB  디버깅


// 클래스 : .java를 class로 바꿀 때 기준이 됨
// public : 제어자, 메인클래스를 어디까지 접근하게 할꺼냐,  publuc(어디서든 접근이 가능함)
// Main클래스의 이름은 .java의 이름과 동일시 시켜주어야함

public class Main {

    // 메인 메소드
    // 자바 프로젝트(앱)는 제일 먼저 클래스의 MAIN 메소드를 실행시킨다.
    // = JVM의 약속
    // static: 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현
    // void: 메서드 출력값의 데이터 타입 -> 출력은 없다.
    // output

    // input
    // 매개변수 자리 : (String[] args)
    public static void main(String[] args) {


       // 객체 : 특징(속성,변수). 행동(메소드)
       // . 하위요소를 표현할 때 . 를 쓴다

       System.out.print("Hello and welcome!");

    }
}
