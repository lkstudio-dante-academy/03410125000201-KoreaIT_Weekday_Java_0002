package Training.Training_14;

/**
 * 도서
 */
public class CBook {
	private String m_oTitle = "";
	private String m_oAuthor = "";
	
	/** 생성자 */
	public CBook(String a_oTitle, String a_oAuthor) {
		this.m_oTitle = a_oTitle;
		this.m_oAuthor = a_oAuthor;
	}
	
	/** 정보를 출력한다 */
	public void showInfo() {
		System.out.printf("제목 : %s\n", m_oTitle);
		System.out.printf("저자 : %s\n", m_oAuthor);
	}
}
