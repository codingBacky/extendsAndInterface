package exam1;

public class MemberVO {
	int numData;
	String irumData;
	//toString호출하면 좀더 유의미한 값을 반환하겠다.
	@Override//재정의 내가 원하는대로 바꿔서 쓸게!
	public String toString() {//아버지 처럼 안하고 이렇게 쓸래!
		return "MemberVO [numData=" + numData + ", irumData=" + irumData + "]";
	}
	

}
