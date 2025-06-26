package Training.Training_17;

/*
 * Java 연습 문제 17
 * - 상점 시뮬레이션 구현하기
 * - 상점에는 개수가 정해진 물건들이 존재한다
 * - 사용자는 상점에서 물건을 구입 할 수 있다. (+ 단, 재고가 소진 된 물건은 구매 불가)
 *
 * Ex)
 * =====> 물건 목록 <=====
 * 1. 물건 A 구입 (재고 : 2)
 * 2. 물건 B 구입 (재고 : 3)
 * 3. 물건 C 구입 (재고 : 1)
 * 4. 종료
 *
 * 선택 : 3
 * 물건 C 을(를) 구입했습니다.
 *
 * =====> 물건 목록 <=====
 * 1. 물건 A 구입 (재고 : 2)
 * 2. 물건 B 구입 (재고 : 3)
 * 3. 물건 C 구입 (재고 : 0)
 * 4. 종료
 *
 * 선택 : 3
 * 물건 C 는 모든 재고가 소진되었습니다.
 */

import java.util.Scanner;

/**
 * Training 17
 */
public class CT01Training_17 {
	/** 초기화 */
	public static void start(String[] args) {
		CStore oStore = new CStore(2, 3, 1);
		Scanner oScanner = new Scanner(System.in);
		
		do {
			oStore.showStuffs();
			int nNumber = oScanner.nextInt();
			
			// 종료 일 경우
			if(nNumber == CStore.EXIT) {
				break;
			}
			
			String[] oNames_Stuff = {
					"", "물건 A", "물건 B", "물건 C"
			};
			
			String oName_Stuff = oNames_Stuff[nNumber];
			
			try {
				oStore.buyStuff(nNumber);
				System.out.printf("%s 을(를) 구입했습니다.\n", oName_Stuff);
			} catch(Exception oException) {
				System.out.printf("%s 은(는) 재고가 모두 소진되었습니다.\n", oName_Stuff);
			}
			
			System.out.println();
		} while(true);
		
		System.out.println("프로그램을 종료합니다.");
	}
}
