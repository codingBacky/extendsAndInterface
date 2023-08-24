package exam2;

import java.util.Scanner;

//인터페이스 SuperInter를 구현하는 Class <=인터페이스가 가진 메서드를 구체화 해야함
public class SuperInterImpl implements SuperInter{

	@Override
	public String dataString() {
		@SuppressWarnings("resource")//경고무시^^
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요");
		return scan.nextLine();//불렀던 곳에 되돌려줄게
	}

	@Override
	public void print() {
		System.out.println("출력했습니다");
		
	}

}
