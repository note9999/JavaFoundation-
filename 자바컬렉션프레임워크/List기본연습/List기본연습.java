import java.lang.reflect.Array;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //List
        // 순서가 있는 데이터의 집합 => Array(최초 길이를 알아야 함)
        // 처음에 있는 길이를 몰라도 만들 수 있음!
        // 1) Array => 정적배열
        // 2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어남)
        // - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        // - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공가능ㄹ 받아서 저장하니깐, 상관없다!

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언과 생성을 동시에

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(1));

        // 2번째 있는 값(15)를 바꾸어보자.
        intList.set(1,10);
        System.out.println(intList.get(1));


        System.out.println("-----------------------------");


        System.out.println(intList.get(0)); //-> 0번방에 있는 99값이 나옴
        //삭제
        intList.remove(0);
        System.out.println(intList.get(0));  // 0번방에 있는 99가 삭제되고, 15가 0번방이 되면서 15가 나옴

        //전체값 삭제
        intList.clear();
        System.out.println(intList.toString());

        }

    }

