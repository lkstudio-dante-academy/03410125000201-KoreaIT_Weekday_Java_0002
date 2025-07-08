package Training.Training_18;

/*
 * Java 연습 문제 18
 * - 미로 탈출하기
 * - 정해진 미로의 시작 위치에서 목적지까지 경로를 계산하기
 * - 출발지는 S, 목적지는 E, 이동 경로는 * 로 표시한다 (+ 단, # 기호는 이동 불가)
 *
 * Ex)
 * =====> 미로 - 탈출 전 <=====
 * ##S##
 * #   #
 * # # #
 * # # #
 * # #E#
 *
 * =====> 미로 - 탈출 후 <=====
 * ##*##
 * # **#
 * # #*#
 * # #*#
 * # #*#
 */

/**
 * Training 18
 */
public class CT01Training_18 {
	/** 초기화 */
	public static void start(String[] args) {
		char[][] oMap = {
				{ '#', '#', 'S', '#', '#' },
				{ '#', ' ', ' ', ' ', '#' },
				{ '#', ' ', '#', '#', '#' },
				{ '#', ' ', ' ', ' ', '#' },
				{ '#', '#', ' ', 'E', '#' }
		};
		
		System.out.println("=====> 맵 - 탐색 전 <=====");
		printMap(oMap);
		
		CPoint oPos_Start = findPos(oMap, 'S');
		findPath(oMap, oPos_Start);
		
		System.out.println("\n=====> 맵 - 탐색 후 <=====");
		printMap(oMap);
	}
	
	/** 위치를 탐색한다 */
	private static CPoint findPos(char[][] a_oMap, char a_chLetter) {
		for(int i = 0; i < a_oMap.length; ++i) {
			for(int j = 0; j < a_oMap[i].length; ++j) {
				// 문자가 존재 할 경우
				if(a_chLetter == a_oMap[i][j]) {
					CPoint oPoint = new CPoint();
					oPoint.m_nX = j;
					oPoint.m_nY = i;
					
					return oPoint;
				}
			}
		}
		
		return null;
	}
	
	/** 경로를 탐색한다 */
	private static boolean findPath(char[][] a_oMap, CPoint a_oPos) {
		boolean bIsValidA = a_oPos.m_nX >= 0 &&
				a_oPos.m_nX < a_oMap[0].length;
		
		boolean bIsValidB = a_oPos.m_nY >= 0 &&
				a_oPos.m_nY < a_oMap.length;
		
		// 맵을 벗어났을 경우
		if(!bIsValidA || !bIsValidB) {
			return false;
		}
		
		// 경로 탐색이 불가능 할 경우
		if(a_oMap[a_oPos.m_nY][a_oPos.m_nX] == '#' ||
				a_oMap[a_oPos.m_nY][a_oPos.m_nX] == '*') {
			return false;
		}
		
		char chLetter_Prev = a_oMap[a_oPos.m_nY][a_oPos.m_nX];
		a_oMap[a_oPos.m_nY][a_oPos.m_nX] = '*';
		
		// 목적지 일 경우
		if(chLetter_Prev == 'E') {
			return true;
		}
		
		int[] oOffsets_X = {
				0, 0, 1, -1
		};
		
		int[] oOffsets_Y = {
				1, -1, 0, 0
		};
		
		for(int i = 0; i < oOffsets_X.length; ++i) {
			CPoint oPos_Next = new CPoint();
			oPos_Next.m_nX = a_oPos.m_nX + oOffsets_X[i];
			oPos_Next.m_nY = a_oPos.m_nY + oOffsets_Y[i];
			
			// 탐색에 성공했을 경우
			if(findPath(a_oMap, oPos_Next)) {
				return true;
			}
		}
		
		a_oMap[a_oPos.m_nY][a_oPos.m_nX] = chLetter_Prev;
		return false;
	}
	
	/** 맵을 출력한다 */
	private static void printMap(char[][] a_oMap) {
		for(int i = 0; i < a_oMap.length; ++i) {
			for(int j = 0; j < a_oMap[i].length; ++j) {
				System.out.printf("%c", a_oMap[i][j]);
			}
			
			System.out.println();
		}
	}
}
