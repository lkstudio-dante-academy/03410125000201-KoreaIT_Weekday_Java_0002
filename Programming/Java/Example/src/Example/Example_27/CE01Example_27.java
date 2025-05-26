package Example.Example_27;

/*
 * Java 제네릭 클래스 구현 방법
 * - class + 클래스 이름 + 제네릭 형식 인자 + 클래스 멤버 (Ex. 변수, 메서드 등등...)
 *
 * Ex)
 * class CSomeClass<T> {
 * 		private T m_tVal;
 *
 * 		public T someMethod() {
 * 			return m_tVal;
 * 		}
 * }
 *
 * CSomeClass<Integer> oSomeObjA = new CSomeClass<Integer>();
 * CSomeClass<Float> oSomeObjB = new CSomeClass<Float>();
 *
 * 위와 같이 제네릭 클래스는 객체를 생성하는 시점에 자료형을 결정해줘야하며 제네릭 메서드와 달리 자료형을
 * 생략하는 것이 불가능하다. (+ 즉, 제네릭 클래스는 Java 컴파일러에 의해서 자료형이 자동적으로
 * 결정되지 않는다는 것을 알 수 있다.)
 */

import java.util.Random;

/**
 * Example 27 (제네릭 - 2)
 */
public class CE01Example_27 {
	/** 초기화 */
	public static void start(String[] args) {
		Random oRandom = new Random();
		
		CList_Linked<Integer> oListValuesA = new CList_Linked<Integer>();
		CList_Linked<Float> oListValuesB = new CList_Linked<Float>();
		
		for(int i = 0; i < 10; ++i) {
			oListValuesA.addVal(oRandom.nextInt(1, 100));
			oListValuesB.addVal(oRandom.nextFloat(1.0f, 100.0f));
		}
		
		System.out.println("=====> 리스트 - 정수 <=====");
		printValues(oListValuesA);
		
		System.out.println("\n=====> 리스트 - 실수 <=====");
		printValues(oListValuesB);
	}
	
	/** 값을 출력한다 */
	private static <T extends Comparable<T>> void printValues(CList_Linked<T> a_oListValues) {
		for(int i = 0; i < a_oListValues.getNumValues(); ++i) {
			T tVal = a_oListValues.getVal(i);
			System.out.printf("%s, ", tVal);
		}
		
		System.out.println();
	}
}
