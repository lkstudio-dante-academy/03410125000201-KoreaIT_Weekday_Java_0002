package Training.Training_05;

/*
 * Java 연습 문제 5
 * - 구구단 출력하기
 * - 정수 2 개를 입력 받아 작은 수부터 큰 수에 해당하는 구구단 출력하기
 *
 * Ex)
 * 정수 (2 개) 입력 : 4 2
 *
 * =====> 2 단 <=====
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * ...이하 생략
 *
 * =====> 3 단 <=====
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * ...이하 생략
 *
 * =====> 4 단 <=====
 * 4 * 1 = 4
 * 4 * 2 = 8
 * 4 * 3 = 12
 * ...이하 생략
 */

import java.util.Scanner;

/**
 * Training 5
 */
public class CT01Training_05 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("정수 (2 개) 입력 : ");
		
		int nValA = oScanner.nextInt();
		int nValB = oScanner.nextInt();
		
		// A 가 클 경우
		if(nValA > nValB) {
			int nTemp = nValA;
			nValA = nValB;
			nValB = nTemp;
		}
		
		for(int i = nValA; i <= nValB; ++i) {
			System.out.printf("=====> %d 단 <=====\n", i);
			
			for(int j = 1; j < 10; ++j) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			
			System.out.println();
		}
	}
}
