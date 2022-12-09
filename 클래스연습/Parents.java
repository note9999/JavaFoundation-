package 클래스연습;

public class Parents{

	public static void main(String[] args) {
	  //GroundUnit gu = new GroundUnit();
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		/**
		 * 클래스가 다음과 같이 정의되어 있을 때 형변환을 올바르게 하지 않을 것을 모두 고르시오.
		 */
		
		/** 업캐스팅 */
		//업캐스팅이 이루어진 것 만 다운캐스팅이 가능
		//다운캐스팅은 그냥은 안됨
		
	/**1번 */		u = (Unit)ac; //형변환 가능
	/**2번 */ 	u = ac; //1번이랑 같은 것 업캐스팅해서 들어간것
	/**3번 (o)*/ 	GroundUnit gu = (GroundUnit)u; //유닛을 그라운드 유닛에 다운캐스팅
										//(Unit u = new GroundUnit(); <-- 이게 있기 때문에 가능)
	/**4번 */ 	AirUnit au = ac; //부모의 부모 클래스라 업스캐스팅이여서 가능
	/**5번 */		t = (Tank)u; // <-- 다운캐스팅시 바로 아래 단계인 녀석만 가능해서 5번은 불가
	/**6번 */		GroundUnit ga = t; 
		
	}

}

class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}