package Training.Training_06;

/*
 * Java 연습 문제 6
 * - 다양한 모양 출력하기
 * - 라인 수를 입력 받아 라인 수 만큼 다양한 모양 출력하기
 *
 * Ex)
 * 라인 수 입력 : 5
 * *   *
 *  * *
 *   *
 *  * *
 * *   *
 *
 * *****
 *    *
 *   *
 *  *
 * *****
 *
 * *   *
 * **  *
 * * * *
 * *  **
 * *   *
 *
 * *
 * **
 * ***
 * ****
 * *****
 *
 * *****
 * ****
 * ***
 * **
 * *
 *
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *
 * *****
 *  ****
 *   ***
 *    **
 *     *
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */

import java.util.Scanner;

/**
 * Training 6
 */
public class CT01Training_06 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("라인 수 입력 : ");
		int nNumLines = oScanner.nextInt();
		
		for(int i = 0; i < nNumLines; ++i) {
			for(int j = 0; j < nNumLines; ++j) {
				boolean bIsStarA = i == j;
				boolean bIsStarB = j == (nNumLines - 1) - i;
				
				System.out.printf("%s", (bIsStarA || bIsStarB) ? "*" : " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < nNumLines; ++i) {
			for(int j = 0; j < nNumLines; ++j) {
				boolean bIsStarA = i == 0;
				boolean bIsStarB = j == (nNumLines - 1) - i;
				boolean bIsStarC = i == nNumLines - 1;
				
				System.out.printf("%s", (bIsStarA || bIsStarB || bIsStarC) ? "*" : " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < nNumLines; ++i) {
			for(int j = 0; j < nNumLines; ++j) {
				boolean bIsStarA = j == 0;
				boolean bIsStarB = j == nNumLines - 1;
				boolean bIsStarC = i == j;
				
				System.out.printf("%s", (bIsStarA || bIsStarB || bIsStarC) ? "*" : " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < nNumLines; ++i) {
			for(int j = 0; j < nNumLines; ++j) {
				boolean bIsStar = j <= i;
				System.out.printf("%s", bIsStar ? "*" : " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = nNumLines - 1; i >= 0; --i) {
			for(int j = 0; j < nNumLines; ++j) {
				boolean bIsStar = j <= i;
				System.out.printf("%s", bIsStar ? "*" : " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < nNumLines; ++i) {
			for(int j = nNumLines - 1; j >= 0; --j) {
				boolean bIsStar = j <= i;
				System.out.printf("%s", bIsStar ? "*" : " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = nNumLines - 1; i >= 0; --i) {
			for(int j = nNumLines - 1; j >= 0; --j) {
				boolean bIsStar = j <= i;
				System.out.printf("%s", bIsStar ? "*" : " ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		int nWidth_Max = (nNumLines * 2) - 1;
		
		for(int i = 0; i < nNumLines; ++i) {
			int nCenter = nWidth_Max / 2;
			
			for(int j = 0; j < nWidth_Max; ++j) {
				boolean bIsStar = j >= nCenter - i && j <= nCenter + i;
				System.out.printf("%s", bIsStar ? "*" : " ");
			}
			
			System.out.println();
		}
	}
}
