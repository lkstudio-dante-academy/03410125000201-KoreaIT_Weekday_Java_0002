package Training.Training_15;

/**
 * 유닛
 */
public class CUnit {
	private int m_nHp = 0;
	private int m_nAtk = 0;
	private int m_nDef = 0;
	
	/** 생성자 */
	public CUnit(int a_nHp, int a_nAtk, int a_nDef) {
		this.m_nHp = a_nHp;
		this.m_nAtk = a_nAtk;
		this.m_nDef = a_nDef;
	}
	
	/** 체력을 반환한다 */
	public int getHp() {
		return m_nHp;
	}
	
	/** 공격력을 반환한다 */
	public int getAtk() {
		return m_nAtk;
	}
	
	/** 공격한다 */
	public void attack(CUnit a_oTarget) {
		int nDamage = this.getAtk() - a_oTarget.m_nDef;
		nDamage = Math.max(0, nDamage);
		
		a_oTarget.m_nHp = Math.max(0, a_oTarget.m_nHp - nDamage);
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("체력 : %d\n", m_nHp);
		System.out.printf("공격력 : %d\n", m_nAtk);
		System.out.printf("방어력 : %d\n", m_nDef);
	}
}
