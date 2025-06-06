package Training.Training_12;

/*
 * Java 연습 문제 12
 * - 경우의 수 구하기
 * - 가격이 다른 물건 3 개가 존재한다
 * - 소지 금액을 입력 받은 후 금액을 모두 소비해서 구입 할 수 있는 물건 조합을 모두 구한다
 *
 * Ex)
 * 물건 A 가격 : 50
 * 물건 B 가격 : 250
 * 물건 C 가격 : 500
 *
 * 소지 금액 입력 : 1000
 *
 * =====> 구입 가능 조합 <=====
 * 물건 A (0 개), 물건 B (0 개), 물건 C (2 개)
 * 물건 A (0 개), 물건 B (2 개), 물건 C (1 개)
 * 물건 A (5 개), 물건 B (1 개), 물건 C (1 개)
 * ...이하 생략
 */

import java.util.Scanner;

/**
 * Training 12
 */
public class CT01Training_12 {
	/** 초기화 */
	public static void start(String[] args) {
		System.out.printf("물건 A 가격 : %d\n", PRICE_STUFF_A);
		System.out.printf("물건 B 가격 : %d\n", PRICE_STUFF_B);
		System.out.printf("물건 C 가격 : %d\n", PRICE_STUFF_C);
		
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("\n소지 금액 입력 : ");
		int nAmount = oScanner.nextInt();
		
		System.out.println("\n=====> 구입 가능 조합 <=====");
		
		for(int i = 0; i <= nAmount; i += PRICE_STUFF_A) {
			for(int j = 0; j <= nAmount; j += PRICE_STUFF_B) {
				for(int k = 0; k <= nAmount; k += PRICE_STUFF_C) {
					// 조합이 불가능 할 경우
					if(i + j + k != nAmount) {
						continue;
					}
					
					int nNumStuffsA = i / PRICE_STUFF_A;
					int nNumStuffsB = j / PRICE_STUFF_B;
					int nNumStuffsC = k / PRICE_STUFF_C;
					
					System.out.printf("물건 A (%d 개), 물건 B (%d 개), 물건 C (%d 개)\n",
							nNumStuffsA, nNumStuffsB, nNumStuffsC);
				}
			}
		}
	}
	
	/**
	 * 가격
	 */
	private static final int PRICE_STUFF_A = 50;
	private static final int PRICE_STUFF_B = 250;
	private static final int PRICE_STUFF_C = 500;
}
