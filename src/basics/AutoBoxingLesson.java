package basics;

public class AutoBoxingLesson {
	
	public Integer myMethod(Integer param) {
		int localInt = param;
		return localInt;
	}
	
	public int myMethod(int param) {
		Integer localInt = param;
		return localInt;
	}
	
	public int myMethod(Integer paramInteger, int paramInt) {
		return paramInteger + paramInt;
	}
}
