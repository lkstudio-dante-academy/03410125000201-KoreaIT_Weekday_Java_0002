package Practice.Practice_01;

/*
 * Java 과제 1
 * - 홀수/짝수 구분하기
 * - 개수를 입력 받아 해당 크기 만큼 배열을 생성한다
 * - 정수를 입력 받아 정수가 홀수 일 경우 배열의 왼쪽에서부터 채운다
 * - 입력 받은 정수가 짝수 일 경우 오른쪽에서부터 채운다
 * - 정수를 모두 입력 받았으면 배열을 출력한다
 *
 * Ex)
 * 개수 입력 : 5
 *
 * 1 번째 정수 입력 : 1
 * 2 번째 정수 입력 : 2
 * 3 번째 정수 입력 : 3
 * 4 번째 정수 입력 : 4
 * 5 번째 정수 입력 : 5
 *
 * =====> 배열 <=====
 * 1, 3, 5, 4, 2
 */

import java.util.Scanner;

/**
 * Practice 1
 */
public class CP01Practice_01 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("개수 입력 : ");
		int nNumValues = oScanner.nextInt();
		
		int nIdx_Odd = 0;
		int nIdx_Even = nNumValues - 1;
		
		int[] oValues = new int[nNumValues];
		
		for(int i = 0; i < oValues.length; ++i) {
			System.out.printf("%d 번째 정수 입력 : ", i + 1);
			int nVal = oScanner.nextInt();
			
			// 홀수 일 경우
			if(nVal % 2 != 0) {
				oValues[nIdx_Odd++] = nVal;
			} else {
				oValues[nIdx_Even--] = nVal;
			}
		}
		
		System.out.println("\n=====> 배열 <=====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		System.out.println();
	}
}
