package 내부클래스;

public class Sample01 {

	public static void main(String[] args) {
		// 코드 완성
		Outer outer = new Outer();
		Outer.Inner oInner = outer.new Inner();
	
//		System.out.println(oInner.iv);
		oInner.method();
		
	}
}