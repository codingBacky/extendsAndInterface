package test;

import org.junit.Test;
import exam2.SuperInter;
import exam2.SuperInterImplTwo;

public class ExamInterface {
	int k;
	int aa;
	
	@Test
	public void interTest() {
		SuperInter var1 = new SuperInterImplTwo();//구체적인 내용을 담은게 있어야 생성할 수 있다. new 뒤에는 클래스만 올수 있음
		String inputLine = var1.dataString();
		System.out.println("입력된 자료 " + inputLine);
		var1.print();
	}
	/*구분안됨
	public ExamInterface(int k, int aa) {//타입의 순서가 다르면 오버로딩 가능
		this();//ExamInterface호출
		this.k = k;
		// TODO Auto-generated constructor stub
	}
	public ExamInterface(int aa, int k) {
		this();//ExamInterface호출
		this.k = k;
		// TODO Auto-generated constructor stub
	}
	
	public ExamInterface() {
		// TODO Auto-generated constructor stub
	}	
	*/
	
	}

