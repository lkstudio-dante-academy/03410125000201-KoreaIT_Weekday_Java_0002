package Training.Training_03;

/*
 * Java 연습 문제 3
 * - 합계 및 평균 계산 프로그램 제작하기
 * - 정수를 입력 받아 누적 시킨다
 * - 입력 받은 수가 0 보다 클 경우 2 번 단계 반복
 * - 입력 받은 수가 0 이하 일 경우 합계와 평균을 출력한다
 *
 * Ex)
 * 1 번째 정수 입력 : 1
 * 2 번째 정수 입력 : 2
 * 3 번째 정수 입력 : 3
 * 4 번째 정수 입력 : 0
 *
 * 합계 : 6
 * 평균 : 2.0
 */

import java.util.Scanner;

/**
 * Training 3
 */
public class CT01Training_03 {
	/** 초기화 */
	public static void start(String[] args) {
		int nVal_Sum = 0;
		int nNumValues = 0;
		
		Scanner oScanner = new Scanner(System.in);
		
		do {
			System.out.printf("%d 번째 정수 입력 : ", nNumValues + 1);
			int nVal = oScanner.nextInt();
			
			// 입력이 종료 되었을 경우
			if(nVal <= 0) {
				break;
			}
			
			nVal_Sum += nVal;
			nNumValues += 1;
		} while(true);
		
		System.out.printf("\n합계 : %d\n", nVal_Sum);
		System.out.printf("평균 : %f\n", nVal_Sum / (float)nNumValues);
	}
}
