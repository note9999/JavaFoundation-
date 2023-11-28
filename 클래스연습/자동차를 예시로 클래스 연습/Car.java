package carClass;

// 클래스를 만들기 위해서는 4가지 STEP이 필요하다.

import org.w3c.dom.ls.LSOutput;

// 1. 설계도 선언( 클래스 선언)
// 2. 객체가 가지고 있어야 할 속성(필드) 정의 // 변수 형태
// 3. 객체를 생성하는 방식 정의(생성자)
// - constructor
// 4. 객체가 가지고 있어야할 행위(메서드) 정의
public class Car {
    // <필드영역>
    String Company; // 자동차 회사
    String model;  // 자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격
    double speed; // 자동차 속도
    char gear;  // 자동차 기어(후진,드라이브,중립 등)
    boolean lights; // 자동차 조명상태

    // 생성자 : (기본적으로 Class와 동일하게) 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로
    // 들어와야하는 지 정의한다.
    public Car () {
    //<생성자 영역>
    // 아무것도없는형태
    // 기본생성자 : 생략 가능
        System.out.println("생성자가 호출되었습니다. 객체가 생성됩니다.");

    }
    //<메서드 영역>

    // gasPedal
     //input: km/h
     //output : speed
        double gasPedal(double kmh) {
            speed = kmh; // speed는 위(class 안에)에 선언해놓은( speed를 말함
            return speed;
        }
    //brakePedal
     //input: x
     //output:speed
        double breakPedal() {
         speed = 0;
         return speed;
        }

    //changeGear
     //input:gear(char type)
     //output:gear
        char changeGear (char type){
            gear = type;
            return gear;
        }

    //onOffLight
     //input:x
     //output:Lights(boolean)
        boolean onOffLights () {
        lights = !lights;
        return lights;
        }

    //horn
     //inout:x
     //output:x
        void horn () {
            System.out.println("빵빵!");
        }
}
