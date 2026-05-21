package MemberManagement;

import java.util.Scanner;

///기능
///1. 맴버 추가
///2. 맴버 삽입
///3. 첫 맴버 삭제
///4. 마지막 맴버 삭제
///5. 선택 맴버 삭제
///6. 회원 번호 검색
///7. 이름 검색
///8. 다음 맴버 선택
///9. 선택 맴버 표시
///10. 전체 맴버 조회
///11. 전체 맴버 삭제

///맴버 데이터 
///1. 맴버ID
///2. 맴버이름


public class MemberManager {
	static Scanner stdIn = new Scanner(System.in);
	
	enum Menu {
		ADD_FIRST(  "맴버 삽입"),
        ADD_LAST(   "맴버 추가"),
        RMV_FIRST(  "처음 맴버 삭제"),
        RMV_LAST(   "마지막 맴버 삭제"),
        RMV_CRNT(   "선택 맴버 삭제 삭제"),
        CLEAR(      "전체 맴버 삭제"),
        SEARCH_NO(  "번호 검색"),
        SEARCH_NAME("이름 검색"),
        NEXT(       "다음 맴버 선택"),
        PRINT_CRNT( "선택 맴버 표시"),
        DUMP(       "전체 맴버 표시"),
        TERMINATE(  "종료");
		private final String message;                // 표시할 문자열
		
		static Menu MenuAt(int idx) {                // 순서가 idx번째인 열거를 반환
            for (Menu m : Menu.values())
                if (m.ordinal() == idx)
                    return m;
            return null;
        }
		
		Menu(String string) {                        // 생성자(constructor)
            message = string;
        }
		
		String getMessage() {                        // 표시할 문자열을 반환
            return message;
        }
		
		static int Count() {
			return Menu.values().length;
		}
		
	}
	
	//--- 메뉴 선택 ---//
	///숫자로 매뉴를 선택한다.
    static Menu SelectMenu() {
        int key;
        do {
            for (Menu m : Menu.values()) {
                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
                if ((m.ordinal() % 3) == 2 &&
                      m.ordinal() != Menu.TERMINATE.ordinal())
                    System.out.println();
            }
            System.out.print(" : ");
            key = stdIn.nextInt();
        } while (key < Menu.ADD_FIRST.ordinal() || 
                                            key > Menu.TERMINATE.ordinal());
        return Menu.MenuAt(key);
    }
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		System.out.println("메뉴 개수 : " + Menu.Count());
//		for (Menu m : Menu.values()) {
//			System.out.printf("(%d) %s  \n", m.ordinal(), m.getMessage());
//		}		
		Menu menu;
		menu = SelectMenu();
		
		System.out.println("선택된 매뉴 : " + menu.message);
		
		System.out.println("프로그램 종료");
	}

}
