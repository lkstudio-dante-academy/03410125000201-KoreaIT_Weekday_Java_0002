package Example.Example_04;

/*
 * 연산자 (Operator) 란?
 * - 데이터나 프로그램의 흐름을 제어하는 특별한 의미를 지니는 기호 (심볼) 을 의미한다. (+ 즉,
 * 연산자를 활용하면 데이터를 프로그램의 목적에 맞게 연산하는 것이 가능하다.)
 *
 * Java 연산자 종류
 * - 산술 연산자 (+, -, *, /, %)
 * - 관계 연산자 (<, >, <=, >=, ==, !=)
 * - 논리 연산자 (&&, ||, !)
 * - 증감 연산자 (++, --)
 * - 비트 연산자 (&, |, ^, <<, >>, ~)
 * - 할당 연산자 (=, +=, -=, *=, /= 등등...)
 * - 기타 연산자 (조건 연산자, 형변환 연산자, 우선 순위 연산자 등등...)
 */

import java.util.Scanner;

/**
 * Example 4 (연산자)
 */
public class CE01Example_04 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		System.out.print("정수 (2 개) 입력 : ");
		
		int nValA = oScanner.nextInt();
		int nValB = oScanner.nextInt();
		
		/*
		 * 산술 연산자의 결과는 피연산자의 자료형을 따라가기 때문에 / 와 같은 연산을 처리 할 때는 주의가
		 * 필요하다.
		 *
		 * Ex)
		 * int nValA = 10;
		 * int nValB = 20;
		 *
		 * int nResult = nValA / nValB;			<- 0
		 *
		 * 위와 같이 nResult 변수에는 0.5 가 아닌 0 이 할당된다. (+ 즉, / 연산자의 피연산자가
		 * 정수이기 때문에 결과 데이터도 정수가 나왔다는 것을 알 수 있다.)
		 *
		 * 또한 산술 연산자에 사용되는 피연산자의 자료형은 서로 동일해야한다.
		 *
		 * 만약 피연산자의 자료형이 서로 다를 경우 내부적으로 피연산자의 자료형을 일치 시킨 후 연산이
		 * 처리되는 특징이 존재한다. (+ 즉, 두 피연산자 중 하나의 자료형을 일시적으로 변경 된다는 것을
		 * 알 수 있다.)
		 *
		 * 피연산자의 자료형이 일시적으로 변경 되는 것을 묵시적 형변환 or 암시적 형변환 이라고 하며
		 * 묵시적 형변환은 가능하면 연산 후 데이터의 손실이 최대한 덜 발생하는 방향으로 이루어진다.
		 *
		 * Ex)
		 * int nVal = 10;
		 * float fVal = 20.0f;
		 *
		 * float fResult = nVal / fVal;			<- 0.5
		 *
		 * 위와 같이 fResult 변수에는 0.5 가 할당된다. (+ 즉, 정수는 소수점을 표현하는 것이
		 * 불가능하기 때문에 nVal 변수가 지니고 있는 데이터를 실수로 변경 후 연산이 처리 되었다는 것을
		 * 알 수 있다.)
		 *
		 * 형변환 연산자란?
		 * - 데이터의 자료형을 일시적으로 변경하는 연산자를 의미한다. (+ 즉, 형변환 연산자를 활용하면
		 * 데이터의 해석 방법을 일시적으로 변경해서 연산을 처리하는 것이 가능하다.)
		 *
		 * Ex)
		 * int nValA = 10;
		 * int nValB = 20;
		 *
		 * float fResult = nValA / (float)nValB;			<- 0.5
		 *
		 * 위와 같이 fResult 변수에는 0.5 가 할당된다. (+ 즉, 형변환 연산자에 의해 nValB 가
		 * 지니고 있던 데이터가 일시적으로 실수 데이터로 변경 되어서 연산이 처리 되었다는 것을 알 수 있다.)
		 */
		System.out.println("\n=====> 산술 연산자 <=====");
		System.out.printf("%d + %d = %d\n", nValA, nValB, nValA + nValB);
		System.out.printf("%d - %d = %d\n", nValA, nValB, nValA - nValB);
		System.out.printf("%d * %d = %d\n", nValA, nValB, nValA * nValB);
		System.out.printf("%d / %d = %d\n", nValA, nValB, nValA / nValB);
		System.out.printf("%d %% %d = %d\n", nValA, nValB, nValA % nValB);
		
		/*
		 * 아래와 같이 관계 연산자의 결과는 참 or 거짓을 표현하는 boolean 데이터가 반환되기 때문에
		 * 해당 데이터를 출력하기 위해서 %s 서식 문자가 사용 된 것을 알 수 있다.
		 */
		System.out.println("\n=====> 관계 연산자 <=====");
		System.out.printf("%d < %d = %s\n", nValA, nValB, nValA < nValB);
		System.out.printf("%d > %d = %s\n", nValA, nValB, nValA > nValB);
		System.out.printf("%d <= %d = %s\n", nValA, nValB, nValA <= nValB);
		System.out.printf("%d >= %d = %s\n", nValA, nValB, nValA >= nValB);
		System.out.printf("%d == %d = %s\n", nValA, nValB, nValA == nValB);
		System.out.printf("%d != %d = %s\n", nValA, nValB, nValA != nValB);
	}
}
