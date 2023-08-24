package exam1;

public class First extends Object{//class First는 extends Object의 자식이다. [상속]
	//Object의 자손으로 9개의 기능(메서드)을 물려받음,
	@Override//부모가 가지고 있는 메서드 중에 기능을 그대로 아니고 바꿔서 쓰겠다.
	public String toString() {
		return "im exam package in First Class";
	}
	
}
