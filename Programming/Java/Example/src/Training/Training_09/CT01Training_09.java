package Training.Training_09;

/*
 * Java 연습 문제 9
 * - 배열 반전하기
 * - 1 ~ 99 범위의 중복 되지 않은 수 10 개를 추출한다
 * - 배열을 자체를 반전 시킨 결과를 출력한다. (+ 단, 추가적인 배열 사용 X)
 */

import java.util.Random;

/**
 * Training 9
 */
public class CT01Training_09 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		
		int nNumValues = 0;
		int[] oValues = new int[10];
		
		while(nNumValues < oValues.length) {
			int j = 0;
			int nVal = oRandom.nextInt(1, 100);
			
			for(j = 0; j < nNumValues; ++j) {
				// 값이 존재 할 경우
				if(nVal == oValues[j]) {
					break;
				}
			}
			
			// 중복 값이 없을 경우
			if(j >= nNumValues) {
				oValues[nNumValues++] = nVal;
			}
		}
		
		System.out.println("=====> 원본 배열 <=====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
		
		int nIdx_Left = 0;
		int nIdx_Right = oValues.length - 1;
		
		while(nIdx_Left < nIdx_Right) {
			int nTemp = oValues[nIdx_Left];
			oValues[nIdx_Left] = oValues[nIdx_Right];
			oValues[nIdx_Right] = nTemp;
			
			nIdx_Left += 1;
			nIdx_Right -= 1;
		}
		
		System.out.println("\n\n=====> 반전 배열 <=====");
		
		for(int nVal : oValues) {
			System.out.printf("%d, ", nVal);
		}
	}
}
