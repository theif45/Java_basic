package JAVA_221214;

public class Earth {
//	static, final 순서 상관없음
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
