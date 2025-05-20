package Example.Example_15;

/*
 * 싱글턴 패턴 (Singleton Pattern) 이란?
 * -
 */

/**
 * 싱글턴
 */
public class CSingleton {
	private int m_nVal = 0;
	private static int m_nVal_Static = 0;
	
	private static CSingleton m_oInst = null;
	
	/** 생성자 */
	private CSingleton() {
		// Do Something
	}
	
	/** 값을 반환한다 */
	public int getVal() {
		return m_nVal;
	}
	
	/** 값을 변경한다 */
	public void setVal(int a_nVal) {
		m_nVal = a_nVal;
	}
	
	/** 인스턴스를 반환한다 */
	public static CSingleton getInst() {
		// 인스턴스가 없을 경우
		if(CSingleton.m_oInst == null) {
			CSingleton.m_oInst = new CSingleton();
		}
		
		return CSingleton.m_oInst;
	}
}
