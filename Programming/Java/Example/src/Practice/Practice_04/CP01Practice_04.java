package Practice.Practice_04;

/*
 * Java 과제 4
 * - 슬라이드 퍼즐 게임 제작하기
 * - 5 x 5 배열을 생성 후 0 ~ 24 까지 무작위로 초기화한다 (+ 단, 0 은 공백으로 처리)
 * - 위치를 입력 받은 후 위치 주변에 공백이 존재 할 경우 공백과 숫자 위치를 변경한다
 * - 모든 숫자 위치가 정렬 되었을 경우 게임 종료
 *
 * Ex)
 *  6  2  7  4  5
 *  1  3 13  9 17
 * 11 18  8 20 15
 * 16 10 12 19 14
 * 24 22 23 21
 *
 * 위치 입력 (행, 열) : 3 4
 *
 *  6  2  7  4  5
 *  1  3 13  9 17
 * 11 18  8 20 15
 * 16 10 12 19
 * 24 22 23 21 14
 *
 * ...이하 생략
 *
 *  1  2  3  4  5
 *  6  7  8  9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23    24
 *
 * 위치 입력 (행, 열) : 4 4
 *
 *  1  2  3  4  5
 *  6  7  8  9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24
 *
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Practice 4
 */
public class CP01Practice_04 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		int[][] oValues = new int[5][5];
		setupValues(oValues);
		
		printValues(oValues);
	}
	
	/** 값을 설정한다 */
	private static void setupValues(int[][] a_oOutValues) {
		int nVal = 0;
		Random oRandom = new Random();
		
		for(int i = 0; i < a_oOutValues.length; ++i) {
			for(int j = 0; j < a_oOutValues[i].length; ++j) {
				a_oOutValues[i][j] = nVal++;
			}
		}
		
		for(int i = 0; i < a_oOutValues.length; ++i) {
			for(int j = 0; j < a_oOutValues[i].length; ++j) {
				int nRow = oRandom.nextInt(0, a_oOutValues.length);
				int nCol = oRandom.nextInt(0, a_oOutValues[i].length);
				
				int nTemp = a_oOutValues[i][j];
				a_oOutValues[i][j] = a_oOutValues[nRow][nCol];
				a_oOutValues[nRow][nCol] = nTemp;
			}
		}
	}
	
	/** 값을 출력한다 */
	private static void printValues(int[][] a_oValues) {
		for(int i = 0; i < a_oValues.length; ++i) {
			for(int j = 0; j < a_oValues[i].length; ++j) {
				int nVal = a_oValues[i][j];
				System.out.printf("%4s", (nVal <= 0) ? " " : Integer.toString(nVal));
			}
			
			System.out.println();
		}
	}
}
