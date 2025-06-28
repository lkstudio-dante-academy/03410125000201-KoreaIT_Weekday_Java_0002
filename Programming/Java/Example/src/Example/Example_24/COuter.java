package Example.Example_24;

/**
 * 외부 클래스
 */
public class COuter {
	/**
	 * 멤버 내부 클래스
	 */
	public class CInner_Member {
		private int m_nVal = 0;
		
		/** 값을 증가 시킨다 */
		public void incrVal(int a_nVal) {
			m_nVal += a_nVal;
			COuter.this.m_nVal += a_nVal;
		}
		
		/** 정보를 출력한다 */
		public void showInfo() {
			System.out.printf("멤버 변수 (내부) : %d\n", m_nVal);
			System.out.printf("멤버 변수 (외부) : %d\n", COuter.this.m_nVal);
		}
	}
	
	private int m_nVal = 0;
	
	/** 값을 증가 시킨다 */
	public void incrVal(int a_nVal) {
		m_nVal += a_nVal;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("멤버 변수 (외부) : %d\n", m_nVal);
	}
}
