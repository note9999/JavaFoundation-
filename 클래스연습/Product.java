package 클래스연습;

class Product {
	int price;
	int bonusPoint;
	
	
	Product() {
		
	}
	
	Product(int price) {
		this.price = price;
		bonusPoint=(int) (price/10.0);
	}
}

