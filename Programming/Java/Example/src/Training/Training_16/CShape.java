package Training.Training_16;

/**
 * 도형
 */
public class CShape {
	private int m_nColor = 0;
	
	/** 생성자 */
	public CShape(int a_nColor) {
		this.m_nColor = a_nColor;
	}
	
	/** 색상을 반환한다 */
	public String getStr_Color() {
		String[] oStrings_Color = {
				"빨간색", "녹색", "파란색"
		};
		
		return oStrings_Color[m_nColor];
	}
	
	/** 모양을 반환한다 */
	public String getStr_Shape() {
		return "";
	}
	
	/** 도형을 그린다 */
	public void draw() {
		System.out.printf("%s %s 을(를) 그렸습니다.\n", this.getStr_Color(), this.getStr_Shape());
	}
	
	/**
	 * 색상
	 */
	public static final int COLOR_RED = 0;
	public static final int COLOR_GREEN = 1;
	public static final int COLOR_BLUE = 2;
}

/**
 * 선
 */
class CLine extends CShape {
	/** 생성자 */
	public CLine(int a_nColor) {
		super(a_nColor);
	}
	
	/** 모양을 반환한다 */
	@Override
	public String getStr_Shape() {
		return "선";
	}
}

/**
 * 삼각형
 */
class CTriangle extends CShape {
	/** 생성자 */
	public CTriangle(int a_nColor) {
		super(a_nColor);
	}
	
	/** 모양을 반환한다 */
	@Override
	public String getStr_Shape() {
		return "삼각형";
	}
}

/**
 * 사각형
 */
class CRectangle extends CShape {
	/** 생성자 */
	public CRectangle(int a_nColor) {
		super(a_nColor);
	}
	
	/** 모양을 반환한다 */
	@Override
	public String getStr_Shape() {
		return "사각형";
	}
}
