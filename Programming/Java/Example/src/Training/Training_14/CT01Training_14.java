package Training.Training_14;

/*
 * Java 연습 문제 14
 * - 도서를 표현하는 클래스 정의하기
 * - 도서의 정보는 제목, 저자로 이루어져 있다
 * - 제목과 저자를 입력 받아 도서 객체를 생성해서 추가한다
 * - 프로그램을 시작 시 도서 개수를 입력 받는다
 * - 입력 받은 만큼 제목과 저자 정보를 지니고 있는 도서 객체를 생성한다
 *
 * Ex)
 * 도서 개수 입력 : 2
 * 1 번째 도서 제목 입력 : Hello, Java!
 * 1 번째 도서 저자 입력 : 미상
 *
 * 2 번째 도서 제목 입력 : Hello, Python!
 * 2 번째 도서 저자 입력 : 미상
 *
 * =====> 도서 목록 <=====
 * 제목 : Hello, Java!
 * 저자 : 미상
 *
 * 제목 : Hello, Python!
 * 저자 : 미상
 */

import java.util.Scanner;

/**
 * Training 14
 */
public class CT01Training_14 {
	/** 초기화 */
	public static void start(String[] args) {
		Scanner oScanner = new Scanner(System.in);
		
		System.out.print("도서 개수 입력 : ");
		int nNumBooks = oScanner.nextInt();
		
		CBook[] oBooks = new CBook[nNumBooks];
		oScanner.nextLine();
		
		for(int i = 0; i < oBooks.length; ++i) {
			System.out.printf("%d 번째 도서 제목 입력 : ", i + 1);
			String oTitle = oScanner.nextLine();
			
			System.out.printf("%d 번째 도서 저자 입력 : ", i + 1);
			String oAuthor = oScanner.nextLine();
			
			CBook oBook = new CBook(oTitle, oAuthor);
			oBooks[i] = oBook;
			
			System.out.println();
		}
		
		System.out.println("=====> 도서 목록 <=====");
		
		for(CBook oBook : oBooks) {
			oBook.showInfo();
			System.out.println();
		}
		
		for(int i = 0; i < oBooks.length; ++i) {
			oBooks[i].showInfo();
			System.out.println();
		}
	}
}
