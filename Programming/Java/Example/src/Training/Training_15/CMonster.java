package Training.Training_15;

import java.util.Random;

/**
 * 몬스터
 */
public class CMonster extends CUnit {
	/** 생성자 */
	public CMonster(int a_nHp, int a_nAtk, int a_nDef) {
		super(a_nHp, a_nAtk, a_nDef);
	}
}

/**
 * 네임드 몬스터
 */
class CMonster_Named extends CMonster {
	/** 생성자 */
	public CMonster_Named(int a_nHp, int a_nAtk, int a_nDef) {
		super(a_nHp, a_nAtk, a_nDef);
	}
	
	/** 공격력을 반환한다 */
	@Override
	public int getAtk() {
		int nAtk = super.getAtk();
		Random oRandom = new Random();
		
		return (oRandom.nextFloat(0.0f, 1.0f) <= 0.2f) ? nAtk * 2 : nAtk;
	}
}
