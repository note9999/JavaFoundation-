package Order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderAndShip {
  //  주문 가능한 품목 String으로 설정
  private static ArrayList<String> availableItems = new ArrayList<>();
  
  public static void main(String[] args) {
    // 셔츠,바지,모자,양말,신발 주문 
    availableItems.add("Shirt");
    availableItems.add("Pants");
    availableItems.add("Hat");
    availableItems.add("Socks");
    availableItems.add("Shoes");
    
    Scanner scanner = new Scanner(System.in);  //구매품목 입력하도록
    ArrayList<String> items = new ArrayList<>();
    
    // 고객이 주문하도록
    while (true) {
      System.out.println("주문할 품목의 이름을 입력하십시오(완료되면 '완료' 입력)");
      String item = scanner.nextLine();
      
      // 만약에 고객이 주문 완료 하면 루프탈출
      if (item.equalsIgnoreCase("완료")) {
        break;
      }
      
      // 고객이 "찾기"라는 단어를 입력한 경우 찾아보기를 호출
      if (item.equalsIgnoreCase("찾기")) {
        browseItems();
        continue;
      }
      
      
      items.add(item);
    }
    
    // 고객이 주문한 목록 알려주기 
    System.out.println("다음 상품들을 주문하셨습니다.");
    for (String item : items) {
      System.out.println(item);
    }
    
    // 배송 주소 입력
    System.out.println("배송받을 주소를 입력하세요.");
    String address = scanner.nextLine();
    
    // Validate the shipping address
    if (!validateAddress(address)) {
      System.out.println("잘못된 주소입니다. 올바른 주소를 입력하십시오.");
      return;
    }
    
    // 배송정보출력
    System.out.println("주문해 주셔서 감사합니다! 귀하의 물품은 다음 주소로 배송됩니다.");
    System.out.println(address);
  }
  
  
  private static void browseItems() {
    System.out.println("주문 가능한 품목은 다음과 같습니다.");
    for (String item : availableItems) {
      System.out.println(item);
    }
  }
  
  // 배송주소에 오류가 없는지 확인 
  private static boolean validateAddress(String address) {
	// 주소에 주소, 도시, 주 및 우편 번호가 포함되어 있는지 확인합니다.
    if (address.matches(address)) {
      return true;
    }
    return false;
  }
}

