package Training.Training_07;

/*
 * Java 연습 문제 7
 * - 연습 문제 2 번을 메서드를 이용해서 구현하기
 * - 학점을 계산해서 반환하는 메서드 구현하기
 * - 세부 학점을 계산해서 반환하는 메서드 구현하기
 */

import java.util.Scanner;

/**
 * Training 7
 */
public class CT01Training_07 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int nScore = oScanner.nextInt();
		
		String oGrade = getGrade(nScore);
		String oGrade_Detail = getGrade_Detail(nScore);
		
		System.out.printf("%s%s 학점입니다.\n", oGrade, oGrade_Detail);
	}
	
	/** 학점을 반환한다 */
	private static String getGrade(int a_nScore) {
		// A 학점 일 경우
		if(a_nScore >= 90) {
			return "A";
		}
		// B 학점 일 경우
		else if(a_nScore >= 80) {
			return "B";
		}
		// C 학점 일 경우
		else if(a_nScore >= 70) {
			return "C";
		}
		// D 학점 일 경우
		else if(a_nScore >= 60) {
			return "D";
		}
		
		return "F";
	}
	
	/** 세부 학점을 반환한다 */
	private static String getGrade_Detail(int a_nScore) {
		// + 일 경우
		if(a_nScore >= 100 && a_nScore % 10 >= 7) {
			return "+";
		}
		
		return (a_nScore % 10 <= 3) ? "-" : "0";
	}
}
