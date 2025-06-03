package Training.Training_08;

/*
 * Java 연습 문제 8
 * - 하노이 탑 시뮬레이션 제작하기
 * - 원반 번호를 입력 받아 해당 번호를 옮기는 시뮬레이션 메서드 구현하기
 *
 * Ex)
 * 원반 번호 입력 : 3
 * 1 번 원반 : A -> C 이동
 * 2 번 원반 : A -> B 이동
 * 1 번 원반 : C -> B 이동
 * 3 번 원반 : A -> C 이동
 * 1 번 원반 : B -> A 이동
 * 2 번 원반 : B -> C 이동
 * 1 번 원반 : A -> C 이동
 */

import java.util.Scanner;

/**
 * Training 8
 */
public class CT01Training_08 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("원반 번호 입력 : ");
		int nNumDisc = oScanner.nextInt();
		
		printResult_HanoiTower(nNumDisc, "A", "C", "B");
	}
	
	/** 하노이 탑 결과를 출력한다 */
	private static void printResult_HanoiTower(int a_nNumDisc, String a_oFrom, String a_oTo, String a_oBuffer) {
		// 결과 출력이 불가능 할 경우
		if(a_nNumDisc <= 0) {
			return;
		}
		
		printResult_HanoiTower(a_nNumDisc - 1, a_oFrom, a_oBuffer, a_oTo);
		System.out.printf("%d 번 원반 : %s -> %s 이동\n", a_nNumDisc, a_oFrom, a_oTo);
		
		printResult_HanoiTower(a_nNumDisc - 1, a_oBuffer, a_oTo, a_oFrom);
	}
}
