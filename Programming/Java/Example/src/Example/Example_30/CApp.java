package Example.Example_30;

/**
 * 어플리케이션
 */
public class CApp {
	private static CApp m_oInst = null;
	
	/** 인스턴스를 반환한다 */
	public static CApp getInst() {
		// 인스턴스가 없을 경우
		if(CApp.m_oInst == null) {
			CApp.m_oInst = new CApp();
		}
		
		return CApp.m_oInst;
	}
}
