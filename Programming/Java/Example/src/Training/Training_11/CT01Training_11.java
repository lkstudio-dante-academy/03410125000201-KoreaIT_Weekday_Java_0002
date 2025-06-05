package Training.Training_11;

/*
 * Java 연습 문제 11
 * - 행맨 게임 제작하기
 * - 미리 정해진 단어 중 하나를 랜덤하게 선택한다
 * - 단어를 이루고 있는 문자 일부를 공개한다
 * - 문자를 입력 받아 해당 문자가 단어에 존재 할 경우 문자를 공개한다 (+ 단, 대/소문자 구분 X)
 * - 모든 문자를 공개했을 경우 게임 종료
 *
 * Ex)
 * 정답 : Google
 *
 * _ _ o _ _ e
 * 문자 입력 : g
 *
 * G _ o g _ e
 * 문자 입력 : o
 *
 * G o o g _ e
 * 문자 입력 : l
 *
 * G o o g l e
 * 프로그램을 종료합니다.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Training 11
 */
public class CT01Training_11 {
	/** 초기화 */
	public static void start(String[] args) {
		String oAnswer = getAnswer();
		System.out.printf("정답 : %s\n\n", oAnswer);
		
		char[] oWord = new char[oAnswer.length()];
		setupWord(oAnswer, oWord);
		
		Scanner oScanner = new Scanner(System.in);
		
		do {
			printWord(oWord);
			
			System.out.print("단어 입력 : ");
			char chLetter = oScanner.nextLine().charAt(0);
			
			for(int i = 0; i < oAnswer.length(); ++i) {
				char chLetter_Upper = Character.toUpperCase(chLetter);
				char chLetter_AUpper = Character.toUpperCase(oAnswer.charAt(i));
				
				// 문자가 없을 경우
				if(chLetter_Upper != chLetter_AUpper) {
					continue;
				}
				
				oWord[i] = oAnswer.charAt(i);
			}
			
			System.out.println();
			
			// 정답 일 경우
			if(isAnswer(oWord)) {
				break;
			}
		} while(true);
		
		printWord(oWord);
		System.out.println("프로그램을 종료합니다.");
	}
	
	/** 정답 여부를 검사한다 */
	private static boolean isAnswer(char[] a_oWord) {
		for(int i = 0; i < a_oWord.length; ++i) {
			// 공백이 존재 할 경우
			if(a_oWord[i] == '_') {
				return false;
			}
		}
		
		return true;
	}
	
	/** 정답을 반환한다 */
	private static String getAnswer() {
		String[] oWords = {
				"Apple", "Google", "Samsung", "Microsoft"
		};
		
		Random oRandom = new Random();
		return oWords[oRandom.nextInt(0, oWords.length)];
	}
	
	/** 단어를 설정한다 */
	private static void setupWord(String a_oAnswer, char[] a_oOutWord) {
		Random oRandom = new Random();
		
		for(int i = 0; i < a_oOutWord.length; ++i) {
			a_oOutWord[i] = '_';
		}
		
		for(int i = 0; i < (int)(a_oAnswer.length() * 0.3); ++i) {
			int nIdx = oRandom.nextInt(0, a_oAnswer.length());
			a_oOutWord[nIdx] = a_oAnswer.charAt(nIdx);
		}
	}
	
	/** 단어를 출력한다 */
	private static void printWord(char[] a_oWord) {
		for(int i = 0; i < a_oWord.length; ++i) {
			System.out.printf("%c ", a_oWord[i]);
		}
		
		System.out.println();
	}
}
