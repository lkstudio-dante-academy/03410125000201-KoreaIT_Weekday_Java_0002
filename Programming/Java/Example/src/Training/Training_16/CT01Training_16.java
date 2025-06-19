package Training.Training_16;

/*
 * Java 연습 문제 16
 * - 콘솔 그림판 제작하기
 * - 도형은 3 가지 형태가 존재한다 (+ 선, 삼각형, 사각형)
 * - 사용자로부터 도형을 입력 받아 해당 도형을 생성한다
 * - 도형은 색상 정보를 지니고 있다 (+ 빨간색, 녹색, 파란색)
 * - 단, 색상은 도형을 생성 할 때 랜덤하게 설정한다
 * 
 * Ex)
 * =====> 메뉴 <=====
 * 1. 선 추가
 * 2. 삼각형 추가
 * 3. 사각형 추가
 * 4. 모든 도형 그리기
 * 5. 종료
 * 
 * 선택 : 1
 * 빨간색 선을 추가했습니다.
 *
 * 선택 : 2
 * 녹색 삼각형을 추가했습니다.
 *
 * 선택 : 4
 * 빨간색 선을 그렸습니다.
 * 녹색 삼각형을 그렸습니다.
 */

import java.util.Scanner;

/*
 * Training 16
 */
public class CT01Training_16 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		do {
			printMenu();
			int nMenu = oScanner.nextInt();
			
			// 종료 일 경우
			if(nMenu == MENU_EXIT) {
				break;
			}
			
			System.out.println();
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/**
	 * 메뉴
	 */
	private static final int MENU_ADD_LINE = 1;
	private static final int MENU_ADD_TRIANGLE = 2;
	private static final int MENU_ADD_RECTANGLE = 3;
	private static final int MENU_DRAW_SHAPES_ALL = 4;
	private static final int MENU_EXIT = 5;
	
	/** 메뉴를 출력한다 */
	private static void printMenu() {
		System.out.println("=====> 메뉴 <=====");
		System.out.println("1. 선 추가");
		System.out.println("2. 삼각형 추가");
		System.out.println("3. 사각형 추가");
		System.out.println("4. 모든 도형 그리기");
		System.out.println("5. 종료");
		
		System.out.print("\n선택 : ");
	}
}
