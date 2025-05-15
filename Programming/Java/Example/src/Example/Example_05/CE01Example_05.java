package Example.Example_05;

/*
 * 조건문이란?
 * - 프로그램의 흐름을 제어하는 제어문 중 하나로서 주어진 조건에 따라 프로그램의 흐름을 분산 시키는 기능을
 * 의미한다. (+ 즉, 조건문을 활용하면 다양한 결과를 출력하는 프로그램을 제작하는 것이 가능하다.)
 */

import java.util.Scanner;

/**
 * Example 5 (조건문)
 */
public class CE01Example_05 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int nScore = oScanner.nextInt();
		
		System.out.println("\n=====> if ~ else 조건문 <=====");
		
		// F 학점 일 경우
		if(nScore < 60) {
			System.out.println("F 학점입니다.");
		} else {
			// A 학점 일 경우
			if(nScore >= 90) {
				System.out.println("A 학점입니다.");
			}
			// B 학점 일 경우
			else if(nScore >= 80) {
				System.out.println("B 학점입니다.");
			}
			// C 학점 일 경우
			else if(nScore >= 70) {
				System.out.println("C 학점입니다.");
			}
			// D 학점 일 경우
			else {
				System.out.println("D 학점입니다.");
			}
		}
		
		System.out.println("\n=====> switch ~ case 조건문 <=====");
		
		switch(nScore / 10) {
			case 9:
			case 10:
				System.out.println("A 학점입니다.");
				
				/*
				 * break 키워드란?
				 * - 점프문 중 하나로서 프로그램의 흐름을 가장 가까운 조건문 or 반복문 밖으로
				 * 이동 시키는 역할을 수행하는 키워드를 의미한다. (+ 즉, break 키워드는
				 * 프로그램의 흐름을 제어하는 제어문 중 하나라는 것을 알 수 있다.)
				 *
				 * switch ~ case 조건문은 if ~ else 조건문과 달리 조건을 만족한 명령문만을 실행하는 것이
				 * 아니기 때문에 특정 조건을 만족하는 명령문만을 실행하고 싶다면
				 * 반드시 break 키워드를 명시해서 프로그램의 흐름을 switch ~ case 조건문 밖으로
				 * 이동 시켜줘야한다.
				 */
				break;
			
			case 8:
				System.out.println("B 학점입니다.");
				break;
			
			case 7:
				System.out.println("C 학점입니다.");
				break;
			
			case 6:
				System.out.println("D 학점입니다.");
				break;
			
			default:
				System.out.println("F 학점입니다.");
				break;
		}
	}
}
