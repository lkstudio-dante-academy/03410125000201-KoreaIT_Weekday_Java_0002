package Training.Training_15;

/*
 * Java 연습 문제 15
 * - 캐릭터와 몬스터 클래스 구현하기
 * - 캐릭터와 몬스터는 스탯 (체력, 공격력, 방어력) 을 지니고 있다
 * - 캐릭터의 스탯은 사용자로부터 입력을 받는다
 * - 몬스터의 스탯은 랜덤하게 지정한다
 * - 단, 몬스터는 2 종류 (일반, 네임드) 가 존재한다
 * - 네임드 몬스터는 일정 확률로 공격 시 크리티컬이 발생한다 (+ 즉, 크리티컬 시 2 배 데미지)
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 15
 */
public class CT01Training_15 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("캐릭터 체력 입력 : ");
		int nHp = oScanner.nextInt();
		
		System.out.print("캐릭터 공격력 입력 : ");
		int nAtk = oScanner.nextInt();
		
		System.out.print("캐릭터 방어력 입력 : ");
		int nDef = oScanner.nextInt();
		
		CCharacter oCharacter = new CCharacter(nHp, nAtk, nDef);
		CMonster oMonster = createMonster();
		
		// 네임드 몬스터 일 경우
		if(oMonster instanceof CMonster_Named) {
			System.out.println("\n-----> 네임드 몬스터 등장!");
		}
		
		System.out.println();
		
		try {
			do {
				oCharacter.attack(oMonster);
				
				System.out.println("=====> 플레이어 공격 후 <=====");
				showInfo(oCharacter, oMonster);
				
				System.out.println();
				Thread.sleep(500);
				
				// 몬스터가 사망했을 경우
				if(oMonster.getHp() <= 0) {
					break;
				}
				
				oMonster.attack(oCharacter);
				
				System.out.println("=====> 몬스터 공격 후 <=====");
				showInfo(oCharacter, oMonster);
				
				System.out.println();
				Thread.sleep(500);
				
				// 캐릭터가 사망했을 경우
				if(oCharacter.getHp() <= 0) {
					break;
				}
			} while(true);
		} catch(Exception oException) {
			oException.printStackTrace();
		}
		
		String oWinner = (oCharacter.getHp() > 0) ? "캐릭터" : "몬스터";
		System.out.printf("%s 가 승리했습니다.\n", oWinner);
	}
	
	/** 정보를 출력한다 */
	private static void showInfo(CCharacter a_oCharacter, CMonster a_oMonster) {
		System.out.println("-----> 플레이어 정보");
		a_oCharacter.showInfo();
		
		System.out.println("\n-----> 몬스터 정보");
		a_oMonster.showInfo();
	}
	
	/** 몬스터를 생성한다 */
	private static CMonster createMonster() {
		Random oRandom = new Random();
		
		int nHp = oRandom.nextInt(50, 250);
		int nAtk = oRandom.nextInt(5, 15);
		int nDef = oRandom.nextInt(3, 6);
		
		// 네임드 몬스터 일 경우
		if(oRandom.nextFloat(0.0f, 1.0f) <= 0.3f) {
			return new CMonster_Named(nHp, nAtk, nDef);
		}
		
		return new CMonster(nHp, nAtk, nDef);
	}
}
