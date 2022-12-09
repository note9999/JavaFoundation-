package 자바연습;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품 저장 배열
	int i = 0; // cart배열 변수에 사용될 인덱스

	void buy(Product p) {
//      1. 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "를 살수 없습니다.");
			return;
		}
//      2. 가진 돈이 충분하면 제품의 가격을 가진 돈에서 뺌
		money = money - p.price;

//      3. 장바구니에 구입한 물건을 담는다 ( add메서드 호출 )
		add(p);
	}

	void add(Product p) {
//      1. i 값이 장바구니 크기보다 같거나 크면?
		if (i >= cart.length) {
//         1-1. 기존 장바구니보다 2배 큰 새로운 배열을 생성
			Product[] temp = new Product[cart.length * 2];
//         1-2. 기존 장바구니의 내용을 새로운 배열에 복사     
			System.arraycopy(cart, 0, temp, 0, cart.length);
//         1-3. 새로운 장바구니와 기존 장바구니를 교체
			cart = temp;
		}
//      2. 물건을 장바구니(cart)에 저장, 그리고 i 증가
		cart[i] = p;
		i++;
	}

	void summary() {
		int i;
		int sum = 0;
//      1. 장바구니에 담긴 물건의 목록을 만들어 출력
		for (i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + ",");

//      2. 장바구니에 담긴 물건의 가격을 모두 더해서 출력
			sum = sum + cart[i].price;
		}
		System.out.println();
		System.out.println("사용한 금액 : " + sum);
//      3. 물건을 사고 남은 금액(돈)을 출력
		System.out.println("남은 금액 : " + money);
	}
}