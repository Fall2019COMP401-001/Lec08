package lec8.ex7;

public class SubA extends A {	
	private int z;
	
	public SubA(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public int methodInSubA() {
		return methodInA() + z;
	}
}
