package Practice.Practice_03;

/*
 * Java 과제 3
 * - 삼각형 형태로 배열 초기화하기
 * - 크기를 입력 받은 후 해당 크기만큼 2 차원 배열을 생성한다. (+ 즉, 정방 크기)
 * - 배열의 각 요소를 삼각형 형태로 초기화한다
 *
 * Ex)
 * 크기 입력 : 5
 *
 * =====> 배열 <=====
 *  1  0  0  0  0
 * 12  2  0  0  0
 * 11 13  3  0  0
 * 10 15 14  4  0
 *  9  8  7  6  5
 */

import java.util.Scanner;

/**
 * Practice 3
 */
public class CP01Practice_03 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("크기 입력 : ");
		int nSize = oScanner.nextInt();
		
		int[][] oValues = new int[nSize][nSize];
		setupValues(oValues);
		
		System.out.println("\n=====> 배열 <=====");
		
		for(int i = 0; i < oValues.length; ++i) {
			for(int j = 0; j < oValues[i].length; ++j) {
				System.out.printf("%4d", oValues[i][j]);
			}
			
			System.out.println();
		}
	}
	
	/** 값을 설정한다 */
	private static void setupValues(int[][] a_oOutValues) {
		int i = -1;
		int j = -1;
		
		int nVal = 0;
		int nVal_Max = (a_oOutValues.length * (a_oOutValues.length + 1)) / 2;
		
		int nTimes = a_oOutValues.length;
		
		while(nVal < nVal_Max) {
			for(int k = 0; k < nTimes; ++k) {
				a_oOutValues[++i][++j] = ++nVal;
			}
			
			nTimes -= 1;
			
			for(int k = 0; k < nTimes; ++k) {
				a_oOutValues[i][--j] = ++nVal;
			}
			
			nTimes -= 1;
			
			for(int k = 0; k < nTimes; ++k) {
				a_oOutValues[--i][j] = ++nVal;
			}
			
			nTimes -= 1;
		}
	}
}
