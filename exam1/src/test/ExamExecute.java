package test;

import org.junit.Test;

import exam1.SubOne;
import exam1.SubTwo;
import exam1.SuperA;

public class ExamExecute {
	@Test
	public void firstExec() {//클라이언트 무슨일 할지 결정하고 호출, 객체를 만들어서 일꾼에게 넘겨줌(의존관계 주입)
/*		SuperA var1 = new SuperA();
		var1.print();
		*/
		workPrint( new SuperA() );
//		var1.printOne();
		
/*		SubOne var2 = new SubOne();
		var2.print();
		*/
		workPrint( new SubOne() );
//		var2.printOne();
		//MemberVO first = new MemberVO();
		//	String rtnVal = first.toString();//클래스 이름만 반환  -> 넣을 곳을 줌
		//toString -> Object.toString을 물려받은 것 , 
		//클래스의 기본 정보를 문자열로 나타냄 ,
		//소속된 곳 exam1.First 메모리상에 만들어진 주소 1ed6388a (16진법)
		//System.out.println("일 시키고 되돌려 받은 갚   " + rtnVal);
		//SubOne var2 = new SubTwo();//형제는 전혀 서로 관계가 없음
/*		SuperA var3 = new SubTwo();
		var3.print();
		*/
		workPrint( new SubTwo() );
	}
	public void workPrint(SuperA odj/*다형성 상위타입( 다형성의 꽃 인터페이스 )*/) {//SuperA,SubOne,SubTwo 각 묶음 자료-> odj에 저장 상위타입으로 선언해야 전부 저장될 수 있다.
		//잘하는 일꾼을 불러와서 일한다
		
		odj.print();
	}
}
