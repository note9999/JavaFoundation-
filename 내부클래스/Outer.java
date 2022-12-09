package 내부클래스;


public class Outer {
	int value = 10;
	
	class Inner {
		int iv= 100;
		int value=20;
		
		void method() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}

}
