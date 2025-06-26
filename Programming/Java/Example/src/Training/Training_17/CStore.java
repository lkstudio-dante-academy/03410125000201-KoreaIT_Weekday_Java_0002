package Training.Training_17;

/**
 * 상점
 */
public class CStore {
	private int m_nNumStuffsA = 0;
	private int m_nNumStuffsB = 0;
	private int m_nNumStuffsC = 0;
	
	/** 생성자 */
	public CStore(int a_nNumStuffsA,
				  int a_nNumStuffsB,
				  int a_nNumStuffsC) {
		this.m_nNumStuffsA = a_nNumStuffsA;
		this.m_nNumStuffsB = a_nNumStuffsB;
		this.m_nNumStuffsC = a_nNumStuffsC;
	}
	
	/** 물건을 출력한다 */
	public void showStuffs() {
		System.out.println("=====> 물건 목록 <=====");
		System.out.printf("1. 물건 A 구입 (재고 : %d)\n", m_nNumStuffsA);
		System.out.printf("2. 물건 B 구입 (재고 : %d)\n", m_nNumStuffsB);
		System.out.printf("3. 물건 C 구입 (재고 : %d)\n", m_nNumStuffsC);
		System.out.println("4. 종료");
		
		System.out.print("\n선택 : ");
	}
	
	/** 물건을 구입한다 */
	public void buyStuff(int a_nNumber) throws Exception {
		switch(a_nNumber) {
			case NUMBER_STUFF_A:
				// 재고가 없을 경우
				if(m_nNumStuffsA <= 0) {
					throw new Exception("재고가 없습니다.");
				} else {
					m_nNumStuffsA -= 1;
				}
				
				break;
			
			case NUMBER_STUFF_B:
				// 재고가 없을 경우
				if(m_nNumStuffsB <= 0) {
					throw new Exception("재고가 없습니다.");
				} else {
					m_nNumStuffsB -= 1;
				}
				
				break;
			
			case NUMBER_STUFF_C:
				// 재고가 없을 경우
				if(m_nNumStuffsC <= 0) {
					throw new Exception("재고가 없습니다.");
				} else {
					m_nNumStuffsC -= 1;
				}
				
				break;
		}
	}
	
	/**
	 * 물건
	 */
	public static final int NUMBER_STUFF_A = 1;
	public static final int NUMBER_STUFF_B = 2;
	public static final int NUMBER_STUFF_C = 3;
	public static final int EXIT = 4;
}
