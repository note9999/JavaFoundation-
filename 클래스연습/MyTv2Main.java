package 클래스연습;

/**
 * MyTv2 클래스의 멤버변수 isPowerOn, Channel, Volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이
 * 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 메서드를 추가하시오
 */

	public class MyTv2Main {

	public static void main(String[] args) {

		MyTv2 t = new MyTv2();

		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());

		t.setVolume(20);
		System.out.println("CH : " + t.getVolume());

	}

}