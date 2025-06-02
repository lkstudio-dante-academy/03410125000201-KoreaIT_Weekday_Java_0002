package Training.Training_10;

/*
 * Java 연습 문제 10
 * - 바위 가위 보 게임 제작하기
 * - 바위 (1), 가위 (2), 보 (3) 중 하나를 입력 받는다
 * - 컴퓨터는 랜덤하게 선택한다
 * - 사용자의 입력과 컴퓨터의 입력을 비교해서 결과를 출력한다
 * - 사용자가 이겼거나 비겼을 경우 게임을 다시 진행한다
 * - 사용자가 패배했을 경우 게임 종료 및 전적을 출력한다
 *
 * Ex)
 * 선택 (1. 바위, 2. 가위, 3. 보) : 1
 * 결과 : 승리 (나 - 바위, 컴퓨터 - 가위)
 *
 * 선택 (1. 바위, 2. 가위, 3. 보) : 2
 * 결과 : 무승부 (나 - 가위, 컴퓨터 - 가위)
 *
 * 선택 (1. 바위, 2. 가위, 3. 보) : 1
 * 결과 : 패배 (나 - 바위, 컴퓨터 - 보)
 *
 * 전적 : 1 승 1 무 1 패
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 10
 */
public class CT01Training_10 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		Scanner oScanner = new Scanner(System.in);
		
		int nCount_Win = 0;
		int nCount_Draw = 0;
		
		do {
			System.out.print("선택 (1. 바위, 2. 가위, 3. 보) : ");
			
			int nSelect = oScanner.nextInt();
			int nSelect_Computer = oRandom.nextInt(1, 4);
			
			int nResult = getResult(nSelect, nSelect_Computer);
			
			String oStr_Select = selectToStr(nSelect);
			String oStr_ComputerSelect = selectToStr(nSelect_Computer);
			
			String oStr_Result = resultToStr(nResult);
			System.out.printf("결과 : %s (나 - %s, 컴퓨터 - %s)\n\n", oStr_Result, oStr_Select, oStr_ComputerSelect);
			
			// 패배했을 경우
			if(nResult == RESULT_LOSE) {
				break;
			}
			
			nCount_Win += (nResult == RESULT_WIN) ? 1 : 0;
			nCount_Draw += (nResult == RESULT_DRAW) ? 1 : 0;
		} while(true);
		
		System.out.printf("전적 : %d 승 %d 무 1 패\n", nCount_Win, nCount_Draw);
		System.out.println("프로그램을 종료합니다.");
	}
	
	/**
	 * 결과
	 */
	private static final int RESULT_WIN = 1;
	private static final int RESULT_DRAW = 2;
	private static final int RESULT_LOSE = 3;
	
	/** 결과를 반환한다 */
	private static int getResult(int a_nSelect, int a_nSelect_Computer) {
		// 무승부 일 경우
		if(a_nSelect == a_nSelect_Computer) {
			return RESULT_DRAW;
		}
		
		int nSelect_Next = (a_nSelect % 3) + 1;
		return (nSelect_Next == a_nSelect_Computer) ? RESULT_WIN : RESULT_LOSE;
	}
	
	/** 선택 -> 문자열로 변환한다 */
	private static String selectToStr(int a_nSelect) {
		String[] oStrings = {
				"", "바위", "가위", "보"
		};
		
		return oStrings[a_nSelect];
	}
	
	/** 결과 -> 문자열로 변환한다 */
	private static String resultToStr(int a_nResult) {
		String[] oStrings = {
				"", "승리", "무승부", "패배"
		};
		
		return oStrings[a_nResult];
	}
}
