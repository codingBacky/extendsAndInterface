package exam2;

//설계적인 관점의 데이터 타입
//정의만 해줌 구체화는 Impl에서
public interface SuperInter {
	//정의되는 모든 필드는 정적이면서 최종적이다==상수필드. 정적이면서 최종적이다 = public static final
	double PI /*필드명 대문자가 원칙*/= 3.1415;
	int AAA = 500;//반드시 초기값 필요
	//=> public static final double PI = 3.1415; 컴파일러가 바꿈
	//모든 정의되는 메서드는 본체{}가 없는 public'추상메서드'이다. public 추상메서드 = public abstrack
	String dataString(); 
	//=> public abstrack String dataString();
	void print();
}

//인터페이스에 메서드가 하나도 없다 => 의미론적인 인터페이스
//인터페이스에 메서드가 하나만 있다 => 함수형 인터페이스 functional interface @FunctionalInterface 만들어줌
//추상메서드를 가진 타입은 [ 인터페이스로는 ] 객체를 생성할 수 없다.