package exam1;

public class SubOne extends SuperA{
	@Override//부모 기능 재정의 했음
	public void print() {
		System.out.println("byebye");
	}
	public void printOne() {
		System.out.println("One@@@@@@@@@@");
	}
}
