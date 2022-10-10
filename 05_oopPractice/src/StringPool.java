public class StringPool {

	public static void main(String[] args) {
		
		// "밥버거"라는 값이 저장되어 있는 ★주소값★을 변수 s1에 저장
		// 이때 변수 s1는 Stack 메모리에,
		// "밥버거"라는 값은 Heap 메모리 내의 String pool에 저장됨
		// String pool은 HashMap 자료구조 형태로, 중복된 데이터가 저장되지 않음
		String s1 = "밥버거";
		
		// 변수 s1과 같이 "밥버거"라는 값이 저장되어 있는 ★주소값★을 변수 s2에 저장
		// 변수 s2 또한 Stack 메모리에 저장됨
		String s2 = "밥버거";
		
		// 동등 연산자 '=='는 s1과 s2의 주소값이 같은지 비교해줌
		// 주소값이 같을 경우, 변수 b에 true를 저장
		boolean b1 = s1 == s2;
		
		// true가 출력되므로, s1과 s2는 주소값이 같음을 알 수 있음
		// String pool의 중복된 데이터가 저장되지 않는 특징으로 인해
		// 동일한 문자열 값이 같은 주소를 가지기 때문
		System.out.println(b1);
		
		// new 연산자를 사용하여 객체를 생성할 경우
		// 변수 s3와 s4는 똑같이 Stack 메모리에 저장되지만,
		// "밥버거"라는 값은 일반 Heap 메모리 내에 저장되기 때문에
		// 중복이 배제되지 않고 계속 새로운 인스턴스(주소)가 생성됨
		String s3 = new String("밥버거");
		String s4 = new String("밥버거");
		
		// 마법의 소라고둥님 이번에도 주소값이 같을까요?
		boolean b2 = s3 == s4;
		
		// 아니.
		System.out.println(b2);
		
		// new 연산자를 사용하여 객체를 생성하고 값을 비교할 때,
		// '=='을 사용하면 변수 s4 자체는 주소값을 저장하고 있기 때문에 값을 비교할 수 없음
		if(s4 == "밥버거") {
			System.out.println("튜닝의 끝은 순정이라고, 밥버거는 기본이 제일 맛있습니다");
		} else {
			System.out.println("아 그거 그렇게 하는 거 아닌데ㅋㅋ");
		}
		
		// 그러니까 '.equals()'를 사용하여 값을 비교하고 맛있는 밥버거를 즐기도록 하자
		if(s4.equals("밥버거")) {
			System.out.println("튜닝의 끝은 순정이라고, 밥버거는 기본이 제일 맛있습니다");
		} else {
			System.out.println("아 그거 그렇게 하는 거 아닌데ㅋㅋ");
		}
	}
}